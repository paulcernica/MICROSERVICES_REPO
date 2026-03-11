package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
//@Table(name = "numeTabel") nu e nevoie ca numele clasei deja se potriveste cu numele tabelei, same pt @Columns
@Getter
@Setter
@SpringBootApplication
@ToString
@NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
