package com.somesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamEx1 {

    public static void main(String args[]){

        System.out.println ("Hello world");

        Set data = new HashSet ();
        data.add ("test");
        data.add ("test1");
        data.add ("test2");

        Set data1 = new HashSet ();
        data1.add ("rest");
        data1.add ("rest1");
        data1.add ("rest2");


        List<Employee> emp = new ArrayList<> ();
        emp.add (new Employee("somesh","1",new Dept (data)));

        emp.add (new Employee("malla","2",new Dept (data1)));

        emp.stream ().forEach (t -> {
            System.out.println (t.empName);
            //t.dept
            //name:

        });


    }

}

class Employee {

    String empName;
    String empId;
    Dept dept;


    public Employee(String empName, String empId, Dept dept) {
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
    }
}
class Dept {
    Set<String> data;

    public Dept(Set<String> data) {
        this.data = data;
    }
}
