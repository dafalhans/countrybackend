package com.hans.backend.countrybackend.countryinfo.service.mapper;

import com.hans.backend.countrybackend.countryinfo.service.dto.Country;
import org.mapstruct.Mapper;

import java.io.UnsupportedEncodingException;

@Mapper(componentModel = "spring")
public interface ICountryMapper {
    Country mapCountryWStoCountry(String scountryISOCode) throws UnsupportedEncodingException;
}
