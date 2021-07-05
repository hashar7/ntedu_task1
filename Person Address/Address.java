package com.company;

import java.util.Objects;

/**
 * Implements address entity
 */
public class Address {

    /**
     * Country
     */
    private final String country;

    /**
     * City
     */
    private final String city;

    /**
     * Street
     */
    private final String street;

    /**
     * House
     */
    private final Integer house;

    /**
     * Flat
     */
    private final Integer flat;

    /**
     * Constructor that creates address by given parameters:
     *
     * @param country — country,
     * @param city    — city,
     * @param street  — street,
     * @param house   — house,
     * @param flat    — flat.
     */
    public Address(String country, String city,
                   String street, Integer house, Integer flat) {
        this.country = Objects.requireNonNullElse(country, "");
        this.city = Objects.requireNonNullElse(city, "");
        this.street = Objects.requireNonNullElse(street, "");
        this.house = house;
        this.flat = flat;
    }

    /**
     * Gets country name.
     *
     * @return country name.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets street name.
     *
     * @return street name.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets city name.
     *
     * @return city name.
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets house number.
     *
     * @return house number.
     */
    public int getHouse() {
        return house;
    }

    /**
     * Gets flat number.
     *
     * @return flat number.
     */
    public int getFlat() {
        return flat;
    }

    /**
     * Overridden equals method fro correct object comparison.
     *
     * @param object — object to compare.
     * @return true if objects are equal, flase otherwise.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Address address = (Address) object;
        return this.country.equals(((Address) object).country) &&
                this.city.equals(((Address) object).city) &&
                this.street.equals(((Address) object).street) &&
                this.house.equals(((Address) object).house) &&
                this.flat.equals(((Address) object).flat);
    }

}
