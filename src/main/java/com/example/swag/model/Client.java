package com.example.swag.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
public class Client {
    String name;
    Integer age;
    Boolean sex;
}
