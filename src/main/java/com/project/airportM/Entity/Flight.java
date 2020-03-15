package com.project.airportM.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name="flight")
public class Flight extends SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;
    private String flightNo;
    @OneToMany
    //@JoinColumn(foreignKey = @ForeignKey(name = "FK_FlightCity"), name = "CITY_ID", referencedColumnName = "ID")
    private Set<City> city;
    private LocalDate arrDate;
    private LocalTime time;
    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_FlightAirline"), name = "AIRLINE_ID", referencedColumnName = "ID")
    private Airline airline;
    private String type;

    public Flight() {
    }

    public Flight(String flightNo, City city, LocalDate arrDate, LocalTime time, Airline airline, String type) {
        this.flightNo = flightNo;
        this.city = (Set<City>) city;
        this.arrDate = arrDate;
        this.time = time;
        this.airline = airline;
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

    public Set<City> getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = (Set<City>) city;
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

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightNo='" + flightNo + '\'' +
                ", city=" + city +
                ", arrDate=" + arrDate +
                ", time=" + time +
                ", airline=" + airline +
                ", type='" + type + '\'' +
                '}';
    }
}

