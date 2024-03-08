package com.hans.backend.countrybackend.countryinfo.service.dto;

import com.hans.backend.countrybackend.base.service.dto.Base;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Country extends Base {

//Vlag van het land
//Tf code
//Hoofdstad
//Munteenheid

    private String capital;
    private String currency;
    private String flagB64;
    private String flagB64Byte;
    private String flagB64Byte2;
    private String flagB64RAW;
    private String flagLocation;
    private String phonePrefix;


}