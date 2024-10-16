package com.udea.reglas.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Participant {
    private String name;
    private int age;
    private int creditScore;
    private long annualSalary;
    private long existingDebt;
    private long loanAmount;
    private String loanPurpose;
    private String employmentStatus;
    private int yearsAtCurrentJob;
    private long accountBalance;
}
