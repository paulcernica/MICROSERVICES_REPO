package com.eazybytes.loans.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "loans")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Loans extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id", nullable = false)
    public Long loanId;

    @Column(name = "mobile_number", nullable = false)
    public String mobileNumber;

    @Column(name = "loan_number", nullable = false)
    public String loanNumber;

    @Column(name = "loan_type", nullable = false)
    public String loanType;

    @Column(name = "total_loan", nullable = false)
    public Long totalLoan;

    @Column(name = "amount_paid", nullable = false)
    public Long amountPaid;

    @Column(name = "outstanding_amount", nullable = false)
    public Long outstandingAmount;
}
