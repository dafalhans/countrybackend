package com.hans.backend.countrybackend.countryinfo.business;

import com.hans.backend.countrybackend.base.business.BaseEntity;
import lombok.Data;
import jakarta.persistence.Entity;

@Entity
@Data
public class CountryEntity extends BaseEntity<Long> {

//
//   @Id
//    @GeneratedValue
//    @Column(name = "country_id")
//    private Long id;

//    @EmbeddedId
//    private PersonPK pk;

//    @Version
//    private int version;

//    private String name;
//   private int age;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "Vrijedag", length = 4)
//    private Weekday freeDay;

//    @Transient
//    private int tansientdata;

//    @Embedded
//    private Address address;

}
