package com.example.loanpredictionusingml;
import java.util.HashMap;
import java.util.Map;
public class Response {
    private Integer gender;
    private Integer married;
    private Integer dependents;
    private Integer education;
    private Integer self_employed;
    private Integer applicant_income;
    private Integer coapplicant_income;
    private Integer loan_amt;
    private Integer loan_amt_term;
    private Integer credit_history;
    private Integer property_area;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
