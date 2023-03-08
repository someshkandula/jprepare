package com.somesh.coldstreamselect;

import java.math.BigDecimal;
import java.util.Date;

public class DataPoint {

    int PointNumber;
    Date Time;
    double FValue;
    boolean IsMarked;

    @Override
    public String toString() {
        return "DataPoint{" +
                "PointNumber=" + PointNumber +
                ", Time=" + Time +
                ", FValue=" + FValue +
                ", IsMarked=" + IsMarked +
                '}';
    }
}
