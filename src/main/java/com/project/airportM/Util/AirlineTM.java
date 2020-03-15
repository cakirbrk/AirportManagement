package com.project.airportM.Util;

public class AirlineTM {
    private Long airlineId;
    private String airlineCode;
    private String description;

    public AirlineTM() {
    }

    public AirlineTM(String airlineCode, String description) {
        this.airlineCode = airlineCode;
        this.description = description;
    }

    public AirlineTM(Long airlineId, String airlineCode, String description) {
        this.airlineId = airlineId;
        this.airlineCode = airlineCode;
        this.description = description;
    }

    public Long getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Long airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
