package com.coldstream.sensitech;

import java.util.Date;

public class DataPoint {

    int PointNumber;
    Date Time;
    long FValue;
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
