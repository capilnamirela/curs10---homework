package org.fasttrackit.curs10.homework10;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private static List<Student> students = new ArrayList<>();

    public Classroom(List<Student> students) {
        this.students = students;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> disciplineGrade = new ArrayList<>();
        if (discipline == null || discipline.isBlank()) {
            return null;
        } else {
            for (Student student : students) {
                if (discipline.equals(student.getDiscipline())) {
                    disciplineGrade.add(student.getGrade());
                }
            }
        }
        return disciplineGrade;
    }

    public List<Integer> getGradesForStudent(String nameSurname) {
        List<Integer> studentGrade = new ArrayList<>();
        if (nameSurname == null || nameSurname.isBlank()) {
            return null;
        } else {
            for (Student student : students) {
                if (nameSurname.equals(student.getNameSurname())) {
                    studentGrade.add(student.getGrade());
                }
            }
        }
        return studentGrade;
    }


    public Integer getMaxGradeInt(String discipline) {
        Integer max = 0;
        if (discipline == null || discipline.isBlank()) {
            return null;
        } else {
            for (Student student : students) {
                if (discipline.equals(student.getDiscipline()) && max < student.getGrade()) {
                    max = student.getGrade();
                }
            }
        }
        return max;
    }

    public List<Student> getMaxGrade(String discipline) {
        if (discipline == null || discipline.isBlank() || getMaxGradeInt(discipline) == null) {
            return null;}
        List<Student> studentMaxGradeDisc = new ArrayList<>();
        for (Student student : students) {
             if (getMaxGradeInt(discipline) == student.getGrade() && discipline.equals(student.getDiscipline())){
               studentMaxGradeDisc.add(student);
            }
        }
        return studentMaxGradeDisc;
    }

     public Integer getMaxGradeInt() {
            Integer max = 0;
            for (Student student : students) {
                if (max < student.getGrade()) {
                    max = student.getGrade();
                }
            }
            return max;
        }
    public List<Student> getMaxGrade() {
        if (getMaxGradeInt() == null || getMaxGradeInt() == 0) {
            return null;}
        List<Student> studentMaxGrade = new ArrayList<>();
        for (Student student : students) {
            if (getMaxGradeInt() == student.getGrade() ){
                studentMaxGrade.add(student);
            }
        }
        return studentMaxGrade;
    }

        public Integer getAverageGrade (String discipline){
            Integer sumGrades = 0;
            Integer nrGrades = 0;
            if (discipline == null || discipline.isBlank()) {
                return null;
            } else {
                for (Student student : students) {
                    if (discipline.equals(student.getDiscipline())) {
                        sumGrades += student.getGrade();
                        nrGrades++;
                    }
                }
            }
            if (nrGrades > 0) {
                return sumGrades / nrGrades;
            } else {
                return 0;
            }

        }

        public Integer getWorstGradeInt (String discipline){
            Integer min = getMaxGradeInt(discipline);
            if (discipline == null || discipline.isBlank()) {
                return null;
            } else {
                for (Student student : students) {
                    if (discipline.equals(student.getDiscipline()) && min > student.getGrade()) {
                        min = student.getGrade();
                    }
                }
            }
            return min;
        }

    public List<Student> getWorstGrade(String discipline) {
        if (discipline == null || discipline.isBlank() || getMaxGradeInt(discipline) == null) {
            return null;}
        List<Student> studentWorstGradeDisc = new ArrayList<>();
        for (Student student : students) {
            if (getWorstGradeInt(discipline) == student.getGrade() && discipline.equals(student.getDiscipline())){
                studentWorstGradeDisc.add(student);
            }
        }
        return studentWorstGradeDisc;
    }

}
