package org.spring.mvc.lesson44springdata.service;

import org.spring.mvc.lesson44springdata.dto.PersonDto;
import org.spring.mvc.lesson44springdata.dto.SearchDto;

import java.util.List;

public interface PersonService {

    void save(PersonDto dto);

    List<PersonDto> findAll();

    List<PersonDto> findByLogin(SearchDto dto);

}
