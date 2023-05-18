package com.extio.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberToWords", propOrder = {
        "number"
})
public class NumberToWordsRequest {

    @XmlElement(name = "ubiNum")
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

