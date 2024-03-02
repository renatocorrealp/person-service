package com.renato.person.service;

import com.renato.person.service.dto.PersonDTO;

public interface IPersonService {
    PersonDTO createPerson(final PersonDTO personDTO);

    PersonDTO getPersonById(final Long id);
}
