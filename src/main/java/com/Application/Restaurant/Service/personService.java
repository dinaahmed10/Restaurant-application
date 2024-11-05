package com.Application.Restaurant.Service;

import com.Application.Restaurant.DTO.PersonDTO;
import com.Application.Restaurant.DTO.singUpDTO;
import com.Application.Restaurant.DTO.loginDTO;
import com.Application.Restaurant.entity.Person;

import java.util.List;
import java.util.Optional;

public interface personService {
    List<Object> signUp(singUpDTO singUpDTO);
    PersonDTO getPersonByID(Long id);
    List<PersonDTO> getAllPersons();
    PersonDTO updatePerson(Long id , PersonDTO PersonDTO);
    void deletePerson(Long id);
    Optional<PersonDTO>  logIn(loginDTO loginDTO);
}