package com.jdbls.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    String name;
    String yearOfRelease;
    int CastNumbers;
    String status;

}
