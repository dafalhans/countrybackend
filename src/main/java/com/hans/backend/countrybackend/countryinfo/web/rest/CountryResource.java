package com.hans.backend.countrybackend.countryinfo.web.rest;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hans.backend.countrybackend.countryinfo.service.service.CountryService;
import com.hans.backend.countrybackend.countryinfo.service.dto.Country;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class CountryResource {

    private final Logger logger = LoggerFactory.getLogger(CountryResource.class);

    private final CountryService service;

    @GetMapping("/countries/health")
    public ResponseEntity<String> up() {
        return ResponseEntity.ok("Country Resource up and running");
    }

//    @GetMapping("/countries")
//    public ResponseEntity<List<Country>> getAll() {
//        logger.debug("Get all countries ");
//        List<Country> dtos = service.getAll();
//        return ResponseEntity.ok(dtos);
//    }

    @GetMapping("/countries/{id}")
    public ResponseEntity<Country> getById(@PathVariable String id) throws UnsupportedEncodingException {
        logger.debug("Get Country by id: {}", id);
        Country dto = service.getById(id);
        return ResponseEntity.ok(dto);
    }

//    @PostMapping("/countries")
//    public ResponseEntity<String> create(@RequestBody Country dto) {
//        logger.debug("Create Country: {}", dto);
//        service.create(dto);
//        return ResponseEntity.ok("Country created");
//    }

//    @PutMapping("/countries")
//    public ResponseEntity<Country> update(@RequestBody Country dto) {
//        logger.debug("Update Country: {}", dto);
//        Country updatedDto = service.update(dto);
//        return ResponseEntity.ok(updatedDto);
//    }

//    @DeleteMapping("/countries/{id}")
//    public ResponseEntity<String> delete(@PathVariable Long id) {
//        logger.debug("Delete Country by id: {}", id);
//        service.deleteById(id);
//        return ResponseEntity.ok("Country delete");
//    }

}