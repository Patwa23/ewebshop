package com.test.configclient.model;


public class Person {

    private String name;
    private String year;
    private String starttime;
    private String endtime;
    private String connstring;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getConnstring() {
        return connstring;
    }
    public void setConnstring(String connstring) {
        this.connstring = connstring;
    }

    public Person(String name, String year, String starttime, String endtime,String connstring) {
        this.name = name;
        this.year = year;
        this.starttime = starttime;
        this.endtime = endtime;
        this.connstring=connstring;
    }

}
