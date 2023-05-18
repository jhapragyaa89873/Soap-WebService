package com.extio.response;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberToWordsResponse", propOrder = {
        "wordsResult"
})
public class NumberToWordsResponse {

    @XmlElement(name = "NumberToWordsResult")
    protected String wordsResult;

    public String getWordsResult() {
        return wordsResult;
    }

    public void setWordsResult(String wordsResult) {
        this.wordsResult = wordsResult;
    }
}

