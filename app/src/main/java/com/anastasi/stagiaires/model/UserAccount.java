package com.anastasi.stagiaires.model;

import java.io.Serializable;

public class UserAccount implements Serializable {

    // J'initialise mes variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private String tel;

    public UserAccount(String firstName, String lastName, String address, String city, String email, String tel)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.tel = tel;
    }

    // Méthode/Function GET (On récupère les informations)
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getEmail() { return email; }
    public String getTel() { return tel; }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
