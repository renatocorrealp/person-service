package com.renato.person.controller.response;

public record CreatePersonResponse(Long id, String documentId, String name, String surname, int age){
}
