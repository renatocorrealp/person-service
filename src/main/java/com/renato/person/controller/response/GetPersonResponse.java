package com.renato.person.controller.response;

public record GetPersonResponse(Long id, String documentId, String name, String surname, int age){
}
