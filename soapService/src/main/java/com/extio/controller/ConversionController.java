package com.extio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.extio.request.CelsiusToFahrenheitRequest;
import com.extio.request.NumberToWordsRequest;
import com.extio.response.CelsiusToFahrenheitResponse;
import com.extio.response.NumberToWordsResponse;
import com.extio.service.NumberToWordConversionService;
import com.extio.service.TemperatureConversionService;

@RestController
public class ConversionController {
    private final TemperatureConversionService temperatureConversionService;
    private final NumberToWordConversionService numberToWordConversionService;

    @Autowired
    public ConversionController(TemperatureConversionService temperatureConversionService,
                                NumberToWordConversionService numberToWordConversionService) {
        this.temperatureConversionService = temperatureConversionService;
        this.numberToWordConversionService = numberToWordConversionService;
    }

    @GetMapping("/celsius-to-fahrenheit")
    public String celsiusToFahrenheit(@RequestParam("celsius") double celsius) {
        CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
        request.setCelsius(celsius);
        CelsiusToFahrenheitResponse response = temperatureConversionService.celsiusToFahrenheit(request);
        return response.getTemperatureResult();
    }

    @GetMapping("/number-to-words")
    public String numberToWords(@RequestParam("number") int number) {
        NumberToWordsRequest request = new NumberToWordsRequest();
        request.setNumber(number);
        NumberToWordsResponse response = numberToWordConversionService.numberToWords(request);
        return response.getWordsResult();
    }
}

