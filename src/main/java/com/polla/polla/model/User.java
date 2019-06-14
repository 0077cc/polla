package com.polla.polla.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "user")
public class User {
    @Id
    private Integer id;
    @Field(value = "name")
    private String name;
    @Field(value = "lastname")
    private String lastname;
    @Field(value = "email")
    private String email;
    @Field(value = "dni")
    private Long dni;
    @Field(value = "status")
    private Integer status;
}
