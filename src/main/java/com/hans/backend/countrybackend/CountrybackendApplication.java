package com.hans.backend.countrybackend;

import com.hans.backend.countrybackend.countryinfo.service.dto.Country;
import com.hans.backend.countrybackend.countryinfo.service.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class CountrybackendApplication {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        SpringApplication.run(CountrybackendApplication.class, args);


                ApplicationContext ctx = SpringApplication.run(CountrybackendApplication.class, args);

        CountryService countrySrv = (CountryService) ctx.getBean(CountryService.class);

        System.out.println(countrySrv.getById("BEL"));



//        Country dto1 = new Country();
//        dto1.setId("100");
//        dto1.setName("Country" + " " + dto1.getId());
//        countrySrv.create(dto1);
//
//        Country dto2 = new Country();
//        dto2.setId("200");
//        dto2.setName("Country" + " " + dto2.getId());
//        countrySrv.create(dto2);
//
//        Country dto3 = new Country();
//        dto3.setId("300");
//        dto3.setName("Country" + " " + dto3.getId());
//        countrySrv.create(dto3);
//
//        Country dto4 = new Country();
//        dto4.setId("400");
//        dto4.setName("Country" + " " + dto4.getId());
//        countrySrv.create(dto4);
//
//        System.out.println("All data:" + countrySrv.getAll());
//
//        System.out.println("Get by ID:" + countrySrv.getById(200L));
//
//
//        System.out.println("Delete by ID: " + "300");
//        countrySrv.deleteById(Long.valueOf("300"));
//        System.out.println("All data:" + countrySrv.getAll());

    }

}
