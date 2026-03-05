package com.eazybytes.accounts.dto;

import lombok.Data;

@Data //has all the getter/setters hashcode,equals etc.
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;
}
