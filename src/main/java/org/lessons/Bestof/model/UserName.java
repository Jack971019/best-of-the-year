package org.lessons.Bestof.model;

public class UserName {

    public String firstName;
    public String lastName;

    public UserName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserName(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
