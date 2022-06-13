package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\ruipa\\IdeaProjects\\file_alunos.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }
}
