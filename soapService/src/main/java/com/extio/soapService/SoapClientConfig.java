package com.extio.soapService;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.extio.service.NumberToWordConversionService;
import com.extio.service.TemperatureConversionService;

@Configuration
public class SoapClientConfig {
	//constants for the required urls or we can directly use from application.poperties
    private static final String TEMPERATURE_WSDL_URL = "https://www.w3schools.com/xml/tempconvert.asmx?WSDL";
    private static final String NUMBER_TO_WORD_WSDL_URL = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL";

    
    @Bean
    public TemperatureConversionService temperatureConversionService() {
    	//using inbuilt factory bean for setting the values from service interface
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(TemperatureConversionService.class);
        factory.setAddress(TEMPERATURE_WSDL_URL);
        return (TemperatureConversionService) factory.create();
    }

    @Bean
    public NumberToWordConversionService numberToWordConversionService() {
    	//using inbuilt factory bean for setting the values from service interface
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(NumberToWordConversionService.class);
        factory.setAddress(NUMBER_TO_WORD_WSDL_URL);
        return (NumberToWordConversionService) factory.create();
    }
}
