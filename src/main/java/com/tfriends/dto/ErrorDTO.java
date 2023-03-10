package com.tfriends.dto;

import com.tfriends.data.HttpInterval;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDTO {
    private int cod;
    private String mes;

    public String setMes() {
        return this.mes;
    }

    public String getMes() {
        HttpInterval interval = new HttpInterval();
        String ms = interval.codMessage(cod);

        return ms;
    }
}
