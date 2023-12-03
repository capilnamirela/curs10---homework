package org.fasttrackit.curs10.collections;
import java.util.HashSet;
import java.util.concurrent.Callable;

import static org.fasttrackit.curs10.collections.Welders.WELDER_POSITION;


public class Main {
    public static void main(String[] args) {

        org.fasttrackit.curs10.collections.Company company = new org.fasttrackit.curs10.collections.Company();
        company.employeeOnePerson(new Manager("Mihai", 44));
        company.employeeOnePerson(new Manager("George", 22));
        company.employeeOnePerson(new Carpenters("Ionel", 51));
        company.employeeOnePerson(new Welders("Ana", 31));
        company.employeeOnePerson(new Plumbers("Adrian", 44));
        company.employeeOnePerson(new Plumbers("Adrian", 43));

        System.out.println(company.getEmployees());
        System.out.println(company.getManager());
        System.out.println(company.getPersons(WELDER_POSITION));
        System.out.println(company.getPersonsOlderThan(35));
        System.out.println(company.getNameThatContains("i"));

    }
}
