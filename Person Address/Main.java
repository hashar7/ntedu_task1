package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Russia", "Moscow", "Tverskaya", 14, 41);
        Address address2 = new Address("Russia", "Moscow", "Tverskaya", 65, 56);
        Address address3 = new Address("Russia", "Moscow", "Kutuzovskiy prosp.", 21, 12);
        Address address4 = new Address("Russia", "Moscow", "Tverskaya", 67, 76);
        Address address5 = new Address("Russia", "Moscow", "Pervomayskaya", 31, 13);

        Person person1 = new Person("Mikhail", "Uspenskiy", new Date(2000, 10, 21), address1);
        Person person2 = new Person("Ivan", "Ivanov", new Date(1999, 9, 20), address2);
        Person person3 = new Person("Egor", "Smirnov", new Date(1998, 8, 19), address3);
        Person person4 = new Person("Petr", "Sergeev", new Date(1965, 7, 18), address4);
        Person person5 = new Person("Kirill", "Ivanov", new Date(1978, 6, 17), address5);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        Search search = new SearchImpl();

        List<Person> persons = search.searchPersonByLastName(personList, "Ivanov");
        System.out.println("Person(s) with Ivanov surname:");
        for (Person p : persons) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        Address address = new Address("Russia", "Moscow", "Tverskaya", 14, 41);
        persons = search.searchPersonByAddress(personList, address);
        System.out.println("Person(s) with address " + address.getCountry() + " " + address.getCity() +
               " " + address.getStreet() + " " + address.getHouse() + " " + address.getFlat() + ":");
        for (Person p : persons) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        Date date1 = new Date(1997, 1, 1);
        Date date2 = new Date(2001, 1, 1);

        persons = search.searchPersonByTwoDates(personList, date1, date2);
        System.out.println("Persons that were born between " + date1.toString() + " and " + date2.toString() +":");
        for (Person p : persons) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        persons = search.searchTheYoungest(personList);
        System.out.println("The youngest person(s):");
        for (Person p : persons) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        persons = search.searchPersonByStreet(personList, "Tverskaya");
        System.out.println("Person(s) who live(s) on Tverskaya street:");
        for (Person p : persons) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        /*  OUTPUT:
        Person(s) with Ivanov surname:
        Ivan Ivanov
        Kirill Ivanov
        Person(s) with address Russia Moscow Tverskaya 14 41:
        Mikhail Uspenskiy
        Persons that were born between Mon Feb 01 00:00:00 MSK 3897 and Fri Feb 01 00:00:00 MSK 3901:
        Mikhail Uspenskiy
        Ivan Ivanov
        Egor Smirnov
        The youngest person(s):
        Mikhail Uspenskiy
        Person(s) who live(s) on Tverskaya street:
        Mikhail Uspenskiy
        Ivan Ivanov
        Petr Sergeev
         */

    }
}

