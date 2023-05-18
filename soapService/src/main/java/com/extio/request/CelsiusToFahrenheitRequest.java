package com.extio.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheit", propOrder = {
        "celsius"
})
public class CelsiusToFahrenheitRequest {

    @XmlElement(name = "Celsius")
    protected double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}

