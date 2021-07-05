package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(0.0, 2.0, 1.0);
        QuadraticEquation q2 = new QuadraticEquation(1.0, 0.0, -1.0);
        QuadraticEquation q3 = new QuadraticEquation(1.0, -2.0, 1.0);
        QuadraticEquation q4 = new QuadraticEquation(1.0, 0.0, 1.0);
        q1.solveEquation();
        q2.solveEquation();
        q3.solveEquation();
        q4.solveEquation();
        System.out.println("q1 solution:" + q1.getX1() + " " + q1.getX2());
        System.out.println("q2 solution:" + q2.getX1() + " " + q2.getX2());
        System.out.println("q3 solution:" + q3.getX1() + " " + q3.getX2());
        System.out.println("q4 solution:" + q4.getX1() + " " + q4.getX2());
        /*  OUTPUT:
            q1 solution:-0.5 -0.5
            q2 solution:1.0 -1.0
            q3 solution:1.0 1.0
            q4 solution:null null
         */
        int numOfPlayers;
        int numOfCubes;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of players: ");
        numOfPlayers = in.nextInt();
        System.out.println("Enter number of cubes: ");
        numOfCubes = in.nextInt();
        Game game = new Game(numOfPlayers, numOfCubes);
        game.startGame();
        /* OUTPUT:
        Enter number of players:
        3
        Enter number of cubes:
        4
        Enter your name and names of players
        Mike
        Bob

        Round number 1 has started
        Player Mike gets 9 points
        Player Bob gets 13 points
        Player Computer gets 15 points
        Winner(s) of this round: Computer: 15 points
        End of round number 1


        Round number 2 has started
        Player Mike gets 15 points
        Player Bob gets 11 points
        Player Computer gets 14 points
        Winner(s) of this round: Mike: 15 points
        End of round number 2


        Round number 3 has started
        Player Mike gets 14 points
        Player Bob gets 14 points
        Player Computer gets 12 points
        Winner(s) of this round: Mike: 14 points
        Bob: 14 points
        End of round number 3


        Round number 4 has started
        Player Mike gets 10 points
        Player Bob gets 11 points
        Player Computer gets 14 points
        Winner(s) of this round: Computer: 14 points
        End of round number 4


        Round number 5 has started
        Player Mike gets 10 points
        Player Bob gets 17 points
        Player Computer gets 12 points
        Winner(s) of this round: Bob: 17 points
        End of round number 5


        Round number 6 has started
        Player Mike gets 10 points
        Player Bob gets 14 points
        Player Computer gets 9 points
        Winner(s) of this round: Bob: 14 points
        End of round number 6


        Round number 7 has started
        Player Mike gets 11 points
        Player Bob gets 13 points
        Player Computer gets 10 points
        Winner(s) of this round: Bob: 13 points
        End of round number 7


        Round number 8 has started
        Player Mike gets 10 points
        Player Bob gets 17 points
        Player Computer gets 13 points
        Winner(s) of this round: Bob: 17 points
        End of round number 8


        Round number 9 has started
        Player Mike gets 13 points
        Player Bob gets 7 points
        Player Computer gets 9 points
        Winner(s) of this round: Mike: 13 points
        End of round number 9


        Round number 10 has started
        Player Mike gets 8 points
        Player Bob gets 11 points
        Player Computer gets 15 points
        Winner(s) of this round: Computer: 15 points
        End of round number 10


        Round number 11 has started
        Player Mike gets 7 points
        Player Bob gets 12 points
        Player Computer gets 11 points
        Winner(s) of this round: Bob: 12 points
        End of round number 11


        Round number 12 has started
        Player Mike gets 16 points
        Player Bob gets 10 points
        Player Computer gets 15 points
        Winner(s) of this round: Mike: 16 points
        End of round number 12


        Round number 13 has started
        Player Mike gets 8 points
        Player Bob gets 11 points
        Player Computer gets 13 points
        Winner(s) of this round: Computer: 13 points
        End of round number 13


        Round number 14 has started
        Player Mike gets 10 points
        Player Bob gets 14 points
        Player Computer gets 9 points
        Winner(s) of this round: Bob: 14 points
        End of round number 14

        Absolute Winner: Bob
        Game finished!

        */

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
        dob yong: Wed Nov 21 00:00:00 MSK 3900
        Younges DoB: Wed Nov 21 00:00:00 MSK 3900
        The youngest person(s):
        Mikhail Uspenskiy
        Person(s) who live(s) on Tverskaya street:
        Mikhail Uspenskiy
        Ivan Ivanov
        Petr Sergeev
         */

    }
}

