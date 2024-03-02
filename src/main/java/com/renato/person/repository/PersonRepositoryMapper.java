package com.renato.person.repository;

import com.renato.person.repository.entity.PersonEntity;
import com.renato.person.service.dto.PersonDTO;

public class PersonRepositoryMapper {
    public static PersonEntity toPersonEntity(final PersonDTO personDTO) {
        final PersonEntity personEntity = new PersonEntity();
        personEntity.setDocumentId(personDTO.documentId());
        personEntity.setName(personDTO.name());
        personEntity.setSurname(personDTO.surname());
        personEntity.setAge(personDTO.age());
        return personEntity;
    }

    public static PersonDTO toPersonDTO(final PersonEntity personEntity) {
        return new PersonDTO(personEntity.getId(), personEntity.getDocumentId(), personEntity.getName(), personEntity.getSurname(), personEntity.getAge());
    }
}
