package com.renato.person.controller;

import com.renato.person.controller.request.CreatePersonRequest;
import com.renato.person.controller.response.CreatePersonResponse;
import com.renato.person.controller.response.GetPersonResponse;
import com.renato.person.service.IPersonService;
import com.renato.person.service.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private IPersonService personService;

    @PostMapping("/create-person")
    @ResponseStatus(HttpStatus.CREATED)
    public CreatePersonResponse createPerson(final @RequestBody CreatePersonRequest createPersonRequest) {
        final PersonDTO personCreatedDTO = personService.createPerson(PersonControllerMapper.toPersonDTO(createPersonRequest));
        return PersonControllerMapper.toCreatePersonResponse(personCreatedDTO);
    }

    @GetMapping("/{personId}")
    @ResponseStatus(HttpStatus.OK)
    public GetPersonResponse getPerson(final @PathVariable("personId") Long personId) {
        return PersonControllerMapper.toGetPersonResponse(personService.getPersonById(personId));
    }

    @GetMapping("/hello-world")
    public GetPersonResponse getHelloWorld() {
        return new GetPersonResponse(123L,"8595489KJ", "Hello", "World", 48);
    }
}
