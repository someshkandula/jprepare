package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {
        System.out.println (" Inside driver class !!! ");

        List<Person> personList = populateWithData ();

        List<Person> usList = personList.stream ()
                .filter (b -> b.getCompany ().equals ("US")).collect (Collectors.toList ());

        usList.stream ().forEach (System.out::println);



        long usC = personList.stream ()
                .filter (b -> b.getCompany ().equals ("US")).count ();
        System.out.println ("usC: "+usC);


        List<Person> nonUsList = personList.stream ()
                .filter (b -> !b.getCompany ().equals ("US")).collect (Collectors.toList ());

        nonUsList.stream ().forEach (System.out::println);

        long nonUsC = personList.stream ()
                .filter (b -> !b.getCompany ().equals ("US")).count ();
        System.out.println ("nonUsC : "+nonUsC);


        Map<Boolean, List<Person>> partitionByList = personList.stream ().collect (Collectors.partitioningBy (b -> b.getCompany ().equals ("US")));
        Map<Boolean, List<Person>> groupByList = personList.stream ().collect (Collectors.groupingBy ((Person p) -> p.getCompany ().equals ("US")));

        partitionByList.entrySet ().stream ().forEach (System.out::println);
        groupByList.entrySet ().stream ().forEach (System.out::println);

        Map<Boolean, Long> partitionByCount = personList.stream ().collect (Collectors.partitioningBy (b -> b.getCompany ().equals ("US"),Collectors.counting ()));
        Map<Boolean, Long> groupByCount = personList.stream ().collect (Collectors.groupingBy ((Person p) -> p.getCompany ().equals ("US"), Collectors.counting ()));

        partitionByCount.entrySet ().stream ().forEach (System.out::println);
        groupByCount.entrySet ().stream ().forEach (System.out::println);


        Map<String, Long> groupingByCountry = personList.stream ().collect (Collectors.groupingBy ((Person p) -> p.getCompany (),Collectors.counting ()));

        groupingByCountry.entrySet ().stream ().forEach (System.out::println);


    }

    static List<Person> populateWithData() {

        Person person01 = new Person ("person01", "US");
        Person person02 = new Person ("person02", "US");
        Person person03 = new Person ("person03", "Brazil");
        Person person04 = new Person ("person04", "US");
        Person person05 = new Person ("person05", "Brazil");
        Person person06 = new Person ("person06", "US");
        Person person07 = new Person ("person07", "Gerrmany");
        Person person08 = new Person ("person08", "US");


        List<Person> personList = new ArrayList<> ();
        personList.add (person01);
        personList.add (person02);
        personList.add (person03);
        personList.add (person04);
        personList.add (person05);
        personList.add (person06);
        personList.add (person07);
        personList.add (person08);
        return personList;

    }
}
