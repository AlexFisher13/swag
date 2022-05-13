package com.example.swag.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
public class Client {
    String name;
    Integer age;
    Boolean sex;
    Address address;
    List<String> phones;

    @Data
    @AllArgsConstructor
    static class Address {
        String city;
        String street;
        Integer flat;
    }
}
