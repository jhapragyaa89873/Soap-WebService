package com.extio.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.extio.request.CelsiusToFahrenheitRequest;
import com.extio.response.CelsiusToFahrenheitResponse;

@WebService(name = "TemperatureConversion", targetNamespace = "https://www.w3schools.com/xml/")
public interface TemperatureConversionService {

    @WebMethod(operationName = "CelsiusToFahrenheit")
    @WebResult(name = "CelsiusToFahrenheitResult")
    CelsiusToFahrenheitResponse celsiusToFahrenheit(
            @WebParam(name = "CelsiusToFahrenheit") CelsiusToFahrenheitRequest request);
}

