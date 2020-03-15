package com.project.airportM.Dto;

public class AirlineDTO {

    private Long airlineId;
    private String airlineCode;
    private String description;

    public AirlineDTO() {
    }

    public AirlineDTO(Long airlineId) {
        this.airlineId = airlineId;
    }

    public AirlineDTO(Long airlineId, String airlineCode, String description) {
        this.airlineId = airlineId;
        this.airlineCode = airlineCode;
        this.description = description;
    }

    public AirlineDTO(String airlineCode, String description) {
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

    @Override
    public String toString() {
        return "AirlilenDTO{" +
                "airlineId=" + airlineId +
                ", airlineCode='" + airlineCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
