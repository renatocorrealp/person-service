package com.renato.person.repository;

import com.renato.person.repository.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
