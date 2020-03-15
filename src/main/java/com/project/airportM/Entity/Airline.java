package com.project.airportM.Entity;

import javax.persistence.*;

@Entity
@Table(name = "airline")
public class Airline extends SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long airlineId;
    @Column(name="CODE")
    private String airlineCode;
    @Column(name="DESCRIPTION")
    private String description;

    public Airline(String airlineCode, String description) {
        this.airlineCode = airlineCode;
        this.description = description;
    }

    public Airline() {
    }

    public Airline(Long airlineId, String airlineCode, String description) {
        this.airlineId=airlineId;
        this.airlineCode=airlineCode;
        this.description=description;
    }

    public Long getId() {
        return airlineId;
    }

    public void setId(long airlineId) {
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

    public static ArilineBuilder builder() {

        return new ArilineBuilder();
    }
    public static class ArilineBuilder{
        private Airline airline;

        public ArilineBuilder() {
            airline = new Airline();
        }
        public ArilineBuilder airlineCode(String airlineCode){
            airline.setAirlineCode(airlineCode);
            return this;
        }
        public ArilineBuilder description(String description){
            airline.setDescription(description);
            return this;
        }
        public Airline build() {
            return airline;
        }
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + airlineId +
                ", airlineCode='" + airlineCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

