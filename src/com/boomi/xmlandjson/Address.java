package com.boomi.xmlandjson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("address")
public class Address {
    @XmlElement(name = "street")
    @JsonProperty("street")
    private String street;

    @XmlElement(name = "city")
    @JsonProperty("city")
    private String city;

    @XmlElement(name = "state")
    @JsonProperty("state")
    private String state;

    @XmlElement(name = "zipcode")
    @JsonProperty("zipcode")
    private String zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}