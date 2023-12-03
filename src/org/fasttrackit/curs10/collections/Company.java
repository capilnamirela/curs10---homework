package org.fasttrackit.curs10.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.curs10.collections.Manager.MANAGER_POSITION;

public class Company {
    private final List<Person> employees = new ArrayList<>();
    public List<Person> getEmployees() {
        return employees;
    }
    public void employeeOnePerson(Person newEmployee) {
        if (hasManager() && MANAGER_POSITION.equals(newEmployee.getPosition())) {
            System.out.println("There is already a manager in this company");
        } else {
            this.employees.add(newEmployee);
        }
    }
    public Person getManager() {
        for (Person employee : employees) {
            if (MANAGER_POSITION.equals(employee.getPosition())) {
                return employee;
            }
        }
        return null;
    }



    private boolean hasManager(){
        for(Person employee : employees){
            if (MANAGER_POSITION.equals(employee.getPosition())){
                return true;
            }
        }
        return false;
    }

    public List<Person> getPersons(String position){
        if (position == null || position.isBlank()){
            return employees;
        }
        List<Person> result = new ArrayList<>();
        for (Person employee : employees){
            if (position.equals(employee.getPosition())){
                result.add(employee);
            }
        }
        return result;
    }

    public List<Person> getPersonsOlderThan(Integer age){

        List<Person> result = new ArrayList<>();
        for (Person employee : employees){
            if (age < employee.getAge()){
                result.add(employee);
            }
        }
        return result;
    }

    public List<Person> getNameThatContains(String text){
        List<Person> result = new ArrayList<>();
        for (Person employee : employees){
            if (employee.getName().contains(text)){
                result.add(employee);
            }
        }
        return result;
    }


}
