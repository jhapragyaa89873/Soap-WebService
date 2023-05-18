package com.extio.response;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheitResponse", propOrder = {
        "temperatureResult"
})
public class CelsiusToFahrenheitResponse {

    @XmlElement(name = "CelsiusToFahrenheitResult")
    protected String temperatureResult;

    public String getTemperatureResult() {
        return temperatureResult;
    }

    public void setTemperatureResult(String temperatureResult) {
        this.temperatureResult = temperatureResult;
    }
}

