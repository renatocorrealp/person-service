package com.renato.person.service;

import com.renato.person.repository.PersonRepository;
import com.renato.person.repository.PersonRepositoryMapper;
import com.renato.person.repository.entity.PersonEntity;
import com.renato.person.service.dto.PersonDTO;
import com.renato.person.service.exception.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService implements IPersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonDTO createPerson(final PersonDTO personDTO) {
        PersonEntity personEntity = PersonRepositoryMapper.toPersonEntity(personDTO);
        personRepository.save(personEntity);
        return PersonRepositoryMapper.toPersonDTO(personEntity);
    }

    public PersonDTO getPersonById(final Long id) {
        final Optional<PersonEntity> personEntity = personRepository.findById(id);

        if (!personEntity.isPresent()) {
            throw new PersonNotFoundException("Person not found for the given id");
        }

        return PersonRepositoryMapper.toPersonDTO(personEntity.get());
    }

}
