package com.renato.person.controller;

import com.renato.person.controller.request.CreatePersonRequest;
import com.renato.person.controller.response.CreatePersonResponse;
import com.renato.person.controller.response.GetPersonResponse;
import com.renato.person.service.dto.PersonDTO;

public class PersonControllerMapper {
    public static PersonDTO toPersonDTO(final CreatePersonRequest createPersonRequest) {
        return new PersonDTO(null, createPersonRequest.getDocumentId(), createPersonRequest.getName(), createPersonRequest.getSurname(), createPersonRequest.getAge());
    }

    public static GetPersonResponse toGetPersonResponse(final PersonDTO personDTO) {
        return new GetPersonResponse(personDTO.id(), personDTO.documentId(), personDTO.name(), personDTO.surname(), personDTO.age());
    }

    public static CreatePersonResponse toCreatePersonResponse(final PersonDTO personDTO) {
        return new CreatePersonResponse(personDTO.id(), personDTO.documentId(), personDTO.name(), personDTO.surname(), personDTO.age());
    }
}
