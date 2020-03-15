package com.project.airportM.Util;

import java.time.LocalDate;
import java.time.LocalTime;

public class FlightTM {
    private Long flightId;
    private String flightNo;
    private LocalDate arrDate;
    private LocalTime time;
    private String type;

    public FlightTM() {
    }

    public FlightTM(Long flightId, String flightNo, LocalDate arrDate, LocalTime time, String type) {
        this.flightId = flightId;
        this.flightNo = flightNo;
        this.arrDate = arrDate;
        this.time = time;
        this.type = type;
    }

    public FlightTM(String flightNo, LocalDate arrDate, LocalTime time, String type) {
        this.flightNo = flightNo;
        this.arrDate = arrDate;
        this.time = time;
        this.type = type;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public LocalDate getArrDate() {
        return arrDate;
    }

    public void setArrDate(LocalDate arrDate) {
        this.arrDate = arrDate;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
