package com.kokab.nrsegptrandomusertest.name.name_object.name_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameModel {

    private String title;
    private String first;
    private String last;

}
