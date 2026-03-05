package com.eazybytes.accounts.dto;

import lombok.Data;

@Data //has all the getter/setters hashcode,equals etc.
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
