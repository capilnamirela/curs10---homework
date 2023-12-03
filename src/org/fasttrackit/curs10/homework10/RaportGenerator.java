package org.fasttrackit.curs10.homework10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RaportGenerator {
    private static List<Student> students = new ArrayList<>();

    public RaportGenerator(List<Student> students) {
        this.students = students;
    }

    public void generateRaport(List<Student> students) throws IOException {
       BufferedWriter generateRaport = new BufferedWriter(new FileWriter("Files/grade_reports_out.txt"));

       generateRaport.write("Cele mai mari note sunt: " + System.lineSeparator());

        for (Student student : students) {
            if (getMaxGradeForWriting() == student.getGrade()){
                generateRaport.write(student.getNameSurname());
                generateRaport.write(" ");
                generateRaport.write(student.getDiscipline());
                generateRaport.write(" ");
                generateRaport.write(student.getGrade() + System.lineSeparator());
            }
        }

        generateRaport.write("Nota medie este: " + System.lineSeparator());
        generateRaport.write(getAverageGrade() + System.lineSeparator());

        generateRaport.write("Cele mai mici note sunt: " + System.lineSeparator());
        for (Student student : students) {
            if (getMinGrade() == student.getGrade()){
                generateRaport.write(student.getNameSurname());
                generateRaport.write(" ");
                generateRaport.write(student.getDiscipline());
                generateRaport.write(" ");
                generateRaport.write(student.getGrade() + System.lineSeparator());
            }
        }

        generateRaport.close();
    }

    public Integer getMaxGradeForWriting() {
        Integer max = 0;
        for (Student student : students) {
            if (max < student.getGrade()) {
                max = student.getGrade();
            }
        }
        return max;
    }

    public Integer getAverageGrade() {
        Integer sumGrades = 0;
        Integer nrGrades = 0;
        for (Student student : students) {
            sumGrades += student.getGrade();
            nrGrades++;
        }
        if (nrGrades>0) {
            return sumGrades / nrGrades;
        } else {
            return 0;
        }
    }

    public Integer getMinGrade() {
        Integer min = getMaxGradeForWriting();
        for (Student student : students) {
            if (min > student.getGrade()) {
                min = student.getGrade();
            }
        }
        return min;
    }

}

