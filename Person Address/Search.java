package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Implements search interface.
 */
public interface Search {

    /**
     * Searches persons by last name.
     *
     * @param personList — list of persons among which to search,
     * @param lastName   — last name of a person that needs to be found,
     * @return — list of persons with given last name.
     */
    public List<Person> searchPersonByLastName(List<Person> personList, String lastName);

    /**
     * Searches persons by address.
     *
     * @param personList — list of persons among which to search,
     * @param address    — address of a person that needs to be found,
     * @return — list of persons with given address.
     */
    public List<Person> searchPersonByAddress(List<Person> personList, Address address);

    /**
     * Searches persons born between certain dates.
     *
     * @param personList — list of persons among which to search,
     * @param date1      — date number one,
     * @param date2      — date number two,
     * @return — list of persons with birthdate between given dates.
     */
    public List<Person> searchPersonByTwoDates(List<Person> personList, Date date1, Date date2);

    /**
     * Searches for the youngest persons.
     *
     * @param personList — list of persons among which to search,
     * @return — list of youngest persons.
     */
    public List<Person> searchTheYoungest(List<Person> personList);

    /**
     * Searches for persons who live on the same street.
     *
     * @param personList — list of persons among which to search,
     * @param street     — street name,
     * @return — list of persons, who live on the given street.
     */
    public List<Person> searchPersonByStreet(List<Person> personList, String street);

}
