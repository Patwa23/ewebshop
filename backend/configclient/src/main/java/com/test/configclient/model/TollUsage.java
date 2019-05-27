package com.test.configclient.model;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("toll")
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

    @Override
    public String toString() {
        return "TollUsage{" +
                "Id='" + Id + '\'' +
                ", stationId='" + stationId + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
