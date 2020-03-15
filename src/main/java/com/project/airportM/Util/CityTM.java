package com.project.airportM.Util;

public class CityTM {
    private Long cityId;
    private String cityCode;
    private String description;

    public CityTM() {
    }

    public CityTM(Long cityId, String cityCode, String description) {
        this.cityId = cityId;
        this.cityCode = cityCode;
        this.description = description;
    }

    public CityTM(String cityCode, String description) {
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
}
