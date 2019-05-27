package com.test.secureservice.model;

public class TollUsage {

    public String Id;
    public String stationId;
    public String licensePlate;
    public String timestamp;

    public TollUsage(){}

    public TollUsage(String id, String stationId, String licensePlate, String timestamp) {
        Id = id;
        this.stationId = stationId;
        this.licensePlate = licensePlate;
        this.timestamp = timestamp;
    }
}
