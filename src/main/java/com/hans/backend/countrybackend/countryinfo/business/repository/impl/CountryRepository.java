package com.hans.backend.countrybackend.countryinfo.business.repository.impl;

import org.springframework.stereotype.Repository;
import com.hans.backend.countrybackend.countryinfo.business.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

}