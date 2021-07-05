package com.company;

import java.util.Date;
import java.util.Objects;

/**
 * Implements person entity.
 */
public class Person {

    /**
     * First name of person
     */
    private final String firstName;

    /**
     * Last name of person
     */
    private final String lastName;

    /**
     * Person's date of birth
     */
    private final Date dateOfBirth;

    /**
     * Person's address
     */
    private final Address address;

    /**
     * Constructor that creates person from given parameters:
     * @param firstName     — First name of person,
     * @param lastName      — Last name of person,
     * @param dateOfBirth   — Person's date of birth,
     * @param address       — Person's address.
     */
    public Person(String firstName, String lastName, Date dateOfBirth, Address address) {
        this.firstName = Objects.requireNonNullElse(firstName, "");
        this.lastName =Objects.requireNonNullElse(lastName, "");
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    /**
     * Gets first name.
     * @return person's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     * @return person's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets date of birth.
     * @return person's date of birth.
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Gets address.
     * @return person's address.
     */
    public Address getAddress() {
        return address;
    }

}
