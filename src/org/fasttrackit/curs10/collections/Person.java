package org.fasttrackit.curs10.collections;

public abstract class Person {
    private final String name;
    private final Integer age;
    private final String position;
    public Person(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString(){
        return "Person: %s, %s, %s".formatted(name, age, position);
    }
}
