package com.renato.person.repository.entity;

import jakarta.persistence.*;

@Entity(name = "Person")
public class PersonEntity {

    @Id
    @GeneratedValue(generator="person_seq")
    @SequenceGenerator(name="person_seq", sequenceName = "person_seq", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(unique = true, nullable = false)
    private String documentId;

    private String name;

    private String surname;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
