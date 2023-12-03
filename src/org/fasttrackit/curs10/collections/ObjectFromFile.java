package org.fasttrackit.curs10.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ObjectFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> persons = readPersonsFromFile();
        writeReport(persons);
        System.out.println(persons);
    }

    private static void writeReport(List<Person> persons) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/report.txt"));
        for (Person person: persons){
            if(person != null && person.getAge() > 30){
                bufferedWriter.write(personToLine(person));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();

    }

    private static String personToLine(Person person) {
        return "%s has age %s and position %s".formatted(person.getName(), person.getAge(), person.getPosition());
    }

    private static List<Person> readPersonsFromFile() throws FileNotFoundException {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", "persons.txt"));
        while (scanner.hasNext()){
            persons.add(personFromLine(scanner.nextLine()));

        }
        return persons;
    }

    private static Person personFromLine(String line){
        String[] values = line.split(Pattern.quote("|"));
        switch (values[2]){
            case "manager" -> {
                return new Manager(values[0], Integer.parseInt(values[1]));
            }
            case "carpenter" -> {
                return new Carpenters(values[0], Integer.parseInt(values[1]));
            }
            case "welder" -> {
                return new Welders(values[0], Integer.parseInt(values[1]));
            }
            default -> System.out.println("No valid position");
        }
        return null;
    }

}
