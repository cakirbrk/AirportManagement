package com.project.airportM.Dto;


public class CityDTO {

    private Long cityId;
    private String cityCode;
    private String description;

    public CityDTO() {
    }

    public CityDTO(Long cityId) {
        this.cityId = cityId;
    }

    public CityDTO(String cityCode, String description) {
        this.cityCode = cityCode;
        this.description = description;
    }

    public CityDTO(Long cityId, String cityCode, String description) {
        this.cityId = cityId;
        this.cityCode = cityCode;
        this.description = description;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CityDTO{" +
                "cityId=" + cityId +
                ", cityCode='" + cityCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
