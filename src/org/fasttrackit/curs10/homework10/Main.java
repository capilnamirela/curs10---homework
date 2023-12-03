package org.fasttrackit.curs10.homework10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> studentGrade = readStudentsFromFile();
        System.out.println(studentGrade);

        Classroom classroom = new Classroom(studentGrade);

        System.out.println(classroom.getGradesForDiscipline("Physics"));
        System.out.println(classroom.getGradesForStudent("Neela Amaltheia"));
        System.out.println(classroom.getMaxGradeInt("Mathematics"));
        System.out.println(classroom.getMaxGrade("Mathematics"));
        System.out.println(classroom.getMaxGradeInt());
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println(classroom.getWorstGradeInt("Physics"));
        System.out.println(classroom.getWorstGrade("Physics"));

        RaportGenerator raportGenerator = new RaportGenerator(studentGrade);
        raportGenerator.generateRaport(studentGrade);


    }

    public static List<Student> readStudentsFromFile() throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", "grades.txt"));
        while (scanner.hasNext()) {
            students.add(studentsFromLine(scanner.nextLine()));
        }
        return students;
    }


    private static Student studentsFromLine(String line) {
        String[] value = line.split(Pattern.quote("|"));
        return new Student(value[0], value[1], Integer.parseInt(value[2]));
    }
}




