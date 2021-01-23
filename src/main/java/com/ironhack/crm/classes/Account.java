package com.ironhack.crm.classes;

import com.ironhack.crm.enums.Industry;

import java.util.List;

public class Account {

    //Properties
    private static int count = 1;
    private int id;
    private String companyName;
    private Industry industry;
    private int employeeCount;
    private String city;
    private String country;
    private List<Contact> contactList;
    private List<Opportunity> opportunityList;

    //Constructor

    public Account(String companyName, Industry industry, int employeeCount, String city, String country, List<Contact> contactList, List<Opportunity> opportunityList) {
        setCompanyName(companyName);
        setIndustry(industry);
        setEmployeeCount(employeeCount);
        setCity(city);
        setCountry(country);
        setContactList(contactList);
        setOpportunityList(opportunityList);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = count;
        count++;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        if (employeeCount <= 0) {
            throw new IllegalArgumentException("The employee count must be at least 1.");
        }
        this.employeeCount = employeeCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        if (contactList.size() == 0) {
            throw new IllegalArgumentException("The contact list is empty!");
        }
        this.contactList = contactList;
    }

    public List<Opportunity> getOpportunityList() {
        return opportunityList;
    }

    public void setOpportunityList(List<Opportunity> opportunityList) {
        if (opportunityList.size() == 0) {
            throw new IllegalArgumentException("The opportunity list is empty!");
        }
        this.opportunityList = opportunityList;
    }

    public String toString() {
        return "Account{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", industry=" + industry +
                ", employeeCount=" + employeeCount +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", contactList=" + contactList +
                ", opportunityList=" + opportunityList +
                '}';
    }
}
