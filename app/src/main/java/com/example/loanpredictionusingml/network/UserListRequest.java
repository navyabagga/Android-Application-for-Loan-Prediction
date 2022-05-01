package com.example.loanpredictionusingml.network;

import com.google.gson.annotations.SerializedName;
public class UserListRequest
{

    @SerializedName("Gender")
    private Integer gender;
    @SerializedName("Married")
    private Integer married;
    @SerializedName("Dependent")
    private Integer dependents;
    @SerializedName("Education")
    private Integer education;
    @SerializedName("Self_Employed")
    private Integer self_employed;
    @SerializedName("ApplicantIncome")
    private Integer applicant_income;
    @SerializedName("CoapplicantIncome")
    private Integer coapplicant_income;
    @SerializedName("LoanAmount")
    private Integer loan_amt;
    @SerializedName("Loan_Amount_Term")
    private Integer loan_amt_term;
    @SerializedName("Credit_History")
    private Integer credit_history;
    @SerializedName("Property_Area")
    private Integer property_area;
    public UserListRequest(int gender, int married, int dependents, int education, int self_employed, int applicant_income,
                           int coapplicant_income, int loan_amt, int loan_amt_term, int credit_history, int property_area)
    {
        this.gender = gender;
        this.married = married;
        this.dependents = dependents;
        this.education = education;
        this.self_employed = self_employed;
        this.applicant_income = applicant_income;
        this.coapplicant_income= coapplicant_income;
        this.loan_amt = loan_amt;
        this.loan_amt_term = loan_amt_term;
        this.credit_history = credit_history;
        this.property_area = property_area;

    }
    //Gender
    public Integer getGender()
    {
        return gender;
    }
    public void setGender(Integer gender)
    {
        this.gender = gender;
    }
    //Married
    public Integer getMarried()
    {
        return married;
    }
    public void setMarried(Integer married)
    {
        this.married = married;
    }
    //Dependents
    public Integer getDependents()
    {
        return dependents;
    }
    public void setDependents(Integer dependents)
    {
        this.dependents = dependents;
    }
    //Education
    public Integer getEducation()
    {
        return education;
    }
    public void setEducation(Integer education)
    {
        this.education = education;
    }
    //Self Employed
    public Integer getSelf_employed()
    {
        return self_employed;
    }
    public void setSelf_employed(Integer self_employed)
    {
        this.self_employed = self_employed;
    }
    //Applicant Income
    public Integer getApplicant_income()
    {
        return applicant_income;
    }
    public void setApplicant_income(Integer applicant_income)
    {
        this.applicant_income = applicant_income;
    }
    //Coapplicant Income
    public Integer getCoapplicant_income()
    {
        return coapplicant_income;
    }
    public void setCoapplicant_income(Integer coapplicant_income)
    {
        this.coapplicant_income = coapplicant_income;
    }
    //Loan Amount
    public Integer getLoan_amt()
    {
        return loan_amt;
    }
    public void setLoan_amt(Integer loan_amt)
    {
        this.loan_amt = loan_amt;
    }
    //Loan Amount Term
    public Integer getLoan_amt_term()
    {
        return loan_amt_term;
    }
    public void setLoan_amt_term(Integer loan_amt_term)
    {
        this.loan_amt_term = loan_amt_term;
    }
    //Credit History
    public Integer getCredit_history()
    {
        return credit_history;
    }
    public void setCredit_history(Integer credit_history)
    {
        this.credit_history = credit_history;
    }
    //Property Area
    public Integer getProperty_area()
    {
        return property_area;
    }
    public void setProperty_area(Integer property_area)
    {
        this.property_area = property_area;
    }

}