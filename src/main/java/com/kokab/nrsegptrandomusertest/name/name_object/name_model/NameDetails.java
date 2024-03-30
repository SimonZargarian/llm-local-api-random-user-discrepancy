package com.kokab.nrsegptrandomusertest.name.name_object.name_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameDetails {
    private List<NameModel> names;
}
