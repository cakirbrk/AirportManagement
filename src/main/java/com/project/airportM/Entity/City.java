package com.project.airportM.Entity;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City extends SuperEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    @Column(name = "CODE")
    private String cityCode;

    @Column(name = "DESCRIPTION")
    private String description;

    public City() {
    }

    public City(String cityCode, String description) {
        this.cityCode = cityCode;
        this.description = description;
    }

    public City(Long cityId, String cityCode, String description) {
        this.cityId=cityId;
        this.cityCode=cityCode;
        this.description=description;

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
    public static CityBuilder builder() {

        return new CityBuilder();
    }
    public static class CityBuilder{
        private City city;

        public CityBuilder() {
            city = new City();
        }
        public CityBuilder cityCode(String cityCode){
            city.setCityCode(cityCode);
            return this;
        }
        public CityBuilder description(String description){
            city.setDescription(description);
            return this;
        }
        public City build() {
            return city;
        }
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityCode='" + cityCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
