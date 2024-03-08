package com.hans.backend.countrybackend.countryinfo.service.service;

import com.hans.backend.countrybackend.countryinfo.service.mapper.impl.CountryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.hans.backend.countrybackend.countryinfo.business.CountryEntity;
import com.hans.backend.countrybackend.countryinfo.business.repository.impl.CountryRepository;
import com.hans.backend.countrybackend.countryinfo.service.mapper.impl.OldCountryMapper;
import com.hans.backend.countrybackend.countryinfo.service.dto.Country;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CountryService {

    private final CountryRepository repository;
    private final CountryMapper countryMapper;




    public Country getById(String id) throws UnsupportedEncodingException {
        return countryMapper.mapCountryWStoCountry(id);
    }




}