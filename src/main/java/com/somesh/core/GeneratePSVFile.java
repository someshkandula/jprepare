package org.somesh.core;

import com.opencsv.CSVWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePSVFile {

    public static void main(String args[]) throws IOException, InstantiationException, IllegalAccessException {

        int size = 2000;
        String folder = "/Users/somalingeswarraokandula/CloudLeaf/INFRA-BulkProcessingIssues-374-375/";
        Instant instant = Instant.now();

        Path path_old = Paths.get(folder+instant+"_oldformat_"+size+".psv");
        BufferedWriter bufferWriter_old = Files.newBufferedWriter(path_old, StandardCharsets.UTF_8);
        CSVWriter writer_old = new CSVWriter(bufferWriter_old);


        Path path_new = Paths.get(folder+instant+"_newformat_"+size+".psv");
        BufferedWriter bufferWriter_new = Files.newBufferedWriter(path_new, StandardCharsets.UTF_8);
        CSVWriter writer_new = new CSVWriter(bufferWriter_new);

        String header_old = "FACILITYCODE,CLIENTID,CUSTOMERNAME,SONUMBER,CUSTOMER_REFERENCE_NUMBER,ENTERDATE,SHIPBYDATE,ACTUALSHIPDATE,DIRECTTOPATIENT,SHIPTOADDRESS1,SHIPTOADDRESS2,SHIPTOADDRESS3,SHIPTOSTATE,SHIPTOCITY,SHIPTOZIP,SHIPTOCOUNTRY,EXPECTEDARRIVALDATE,CARRIERID,TRACKINGNUMBER,SHIPPERNUMBER,MONITORID,SHIPMENTID,ASSETNAME,RULESETNAME,SHIPMENTSTATUS,EXTRACTDATETIME";
        String rawData_old = "1058,C10226,Pfizer Inc,2433465,XSO21-002930,2021-03-29T12:38:37Z,2021-03-30T23:59:59Z,2021-03-30T12:27:29Z,No,Development,B528,Goods Inward Discovery Park Ramsgate Road,STS,Sandwich,CT13 9ND,GBR,2021-04-01T12:27:29Z,100000,1276#,1,MTR100,1058##,2433465_Box 1_AWB: 1276#,RSN001,ReadyToShip,2021-03-30T11:45:34Z";

        String header_new = "CLIENTID,CUSTOMERNAME,SONUMBER,CUSTOMER_REFERENCE_NUMBER,ENTERDATE,SHIPBYDATE,ACTUALSHIPDATE,DIRECTTOPATIENT,EXPECTEDARRIVALDATE,CARRIERID,TRACKINGNUMBER,SHIPPERNUMBER,MONITORID,SHIPMENTID,ASSETNAME,RULESETNAME,SHIPMENTSTATUS,EXTRACTDATETIME,ORIGINADDRESS1,ORIGINCODE,ORIGINADDRESS2,ORIGINADDRESS3,ORIGINSTATE,ORIGINCITY,ORIGINZIP,ORIGINCOUNTRY,DESTINATIONCODE,DESTINATIONADDRESS1,DESTINATIONADDRESS2,DESTINATIONADDRESS3,DESTINATIONSTATE,DESTINATIONCITY,DESTINATIONZIP,DESTINATIONCOUNTRY";
        String rawData_new = "C50030,Fisher Clinical Services Inc.,2667735,CRN001,2021-04-19T10:08:37Z,2021-04-20T23:59:59Z,2021-04-22T19:29:46Z,No,2021-04-24T11:29:46Z,100008,910163#,2,NT001,1985##,2667735_Box 2_AWB: 910163#,RSN001,ReadyToShip,2021-04-23T17:16:35Z,2 Wang Lang Rd. Bangkoknoi Ste,Ram9999,Preparation .4th Floor Pasatch,Blg.Pharmacy Dept.17,OS,Bangkok,10700,THA,Ram9999,2 Wang Lang Rd. Bangkoknoi Ste,Preparation .4th Floor Pasatch,Blg.Pharmacy Dept.17,CA,Bangkok,10700,THA";

        String id = String.format("%04d", Random.class.newInstance().nextInt(10000));


        List<String[]> data_old = new ArrayList<String[]>();
        String[] headers_old = header_old.split(",");
        data_old.add(headers_old);

        List<String[]> data_new = new ArrayList<String[]>();
        String[] headers_new = header_new.split(",");
        data_new.add(headers_new);



        for(int i =0;i<size;i++) {
            data_old.add(rawData_old.replace("#", "_"+Random.class.newInstance().nextInt(10000)).split(","));
        }

        for(int i =0;i<size;i++) {
            data_new.add(rawData_new.replace("#", "_"+Random.class.newInstance().nextInt(10000)).split(","));

            //data_new.add(rawData_new.replace("#","_0"+i).split(","));
        }


        writer_old.writeAll(data_old);
        writer_old.close();

        writer_new.writeAll(data_new);
        writer_new.close();

    }
}
