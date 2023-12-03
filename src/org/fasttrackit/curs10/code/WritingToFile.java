package org.fasttrackit.curs10.code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.*;


public class WritingToFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", false));
        writer.write("This is my first written line" + lineSeparator());
        writer.write("This is my second written line");
        writer.newLine();
        writer.write("This is my third written line");
        writer.newLine();

        for(int i = 0; i<10; i++){
            writer.write(i + lineSeparator());
        }



        writer.close();
    }
}
