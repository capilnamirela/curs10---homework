package org.fasttrackit.curs10.collections;

public class Manager extends org.fasttrackit.curs10.collections.Person {
    public static final String MANAGER_POSITION = "manager";
    public Manager(String name, Integer age) {
        super(name, age, MANAGER_POSITION);
    }
}
