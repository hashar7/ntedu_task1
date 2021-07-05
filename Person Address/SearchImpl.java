package com.company;

        import java.util.List;
        import java.util.Date;
        import java.util.ArrayList;

/**
 * Implements search methods.
 */
public class SearchImpl implements Search {

    /**
     * Searches persons by last name.
     *
     * @param personList — list of persons among which to search,
     * @param lastName   — last name of a person that needs to be found,
     * @return — list of persons with given last name.
     */
    public List<Person> searchPersonByLastName(List<Person> personList, String lastName) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (lastName.equals(person.getLastName())) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * Searches persons by address.
     *
     * @param personList — list of persons among which to search,
     * @param address    — address of a person that needs to be found,
     * @return — list of persons with given address.
     */
    public List<Person> searchPersonByAddress(List<Person> personList, Address address) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAddress().equals(address)) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * Searches persons born between certain dates.
     *
     * @param personList — list of persons among which to search,
     * @param date1      — date number one,
     * @param date2      — date number two,
     * @return — list of persons with birthdate between given dates.
     */
    public List<Person> searchPersonByTwoDates(List<Person> personList, Date date1, Date date2) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getDateOfBirth().after(date1) && person.getDateOfBirth().before(date2)) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * Searches for the youngest persons.
     *
     * @param personList — list of persons among which to search,
     * @return — list of youngest persons.
     */
    public List<Person> searchTheYoungest(List<Person> personList) {
        List<Person> result = new ArrayList<>();
        Person youngest = personList.get(0);
        Date date = new Date(youngest.getDateOfBirth().getTime());
        for (Person person : personList) {
            if (person.getDateOfBirth().after(youngest.getDateOfBirth())) {
                youngest = person;
                date = new Date(youngest.getDateOfBirth().getTime());
            }
        }
        for (Person person : personList) {
            if (person.getDateOfBirth().equals(date)) {
                result.add(person);
            }
        }
        return result;
    }

    /**
     * Searches for persons who live on the same street.
     *
     * @param personList — list of persons among which to search,
     * @param street     — street name,
     * @return — list of persons, who live on the given street.
     */
    public List<Person> searchPersonByStreet(List<Person> personList, String street) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAddress().getStreet().equals(street)) {
                result.add(person);
            }
        }
        return result;
    }

}
