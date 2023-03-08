package com.somesh.generic;

public interface CommonService<E, D> {

    //entity mapper
    E mapToEntity(D type);

    //dto mapper
    D mapToDto(E type);

}