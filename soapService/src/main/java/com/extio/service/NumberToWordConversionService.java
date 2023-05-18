package com.extio.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.extio.request.NumberToWordsRequest;
import com.extio.response.NumberToWordsResponse;

@WebService(name = "NumberConversion", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
public interface NumberToWordConversionService {

    @WebMethod(operationName = "NumberToWords")
    @WebResult(name = "NumberToWordsResult")
    NumberToWordsResponse numberToWords(
            @WebParam(name = "NumberToWords") NumberToWordsRequest request);
}

