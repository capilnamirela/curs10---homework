package org.fasttrackit.curs10.homework10;

public class Student {
    private final String nameSurname;
    private final String discipline;
    private final Integer grade;

    public Student(String nameSurname, String discipline, Integer grade) {
        this.nameSurname = nameSurname;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Integer getGrade() {
        return grade;
    }

    public String toString(){
        return "Student: %s, discipline: %s, grade: %s ".formatted(nameSurname, discipline, grade);
    }





}
