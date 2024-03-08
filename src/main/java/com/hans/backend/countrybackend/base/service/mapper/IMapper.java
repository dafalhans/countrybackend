package com.hans.backend.countrybackend.base.service.mapper;

import java.util.List;

import com.hans.backend.countrybackend.base.service.dto.Base;
import com.hans.backend.countrybackend.base.business.BaseEntity;

public interface IMapper<E extends BaseEntity<?>, D extends Base> {

    List<D> toDTO(List<E> entities);

    List<E> toEntity(List<D> dtos);

    D toDTO(E entity);

    E toEntity(D dto);
}