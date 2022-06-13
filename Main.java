package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Object;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        ArrayList<Object> studList = new ArrayList<Object>();

        //_______________________________________________________________________________________
        //declare now or forever hold your variables
        String whoAccess = "";
        String studAccess = "";
        String privAccess = "";
        byte menuSec = 0;
        String regStu = "";
        int oldStu = 0;
        String regTea = "";
        byte ageStu = 0;
        String password = "12345";  // Atualizar posteriormente!!

        //_______________________________________________________________________________________
        //WHO IS ACCESSING (PRIVILEGES)?
        label:
        while (true) {
            System.out.println("Bem-vindo à Escola de Informática! \nIndique o tipo de acesso (A-> Alunos; S-> Secretaria):");
            whoAccess = scanner.next().toLowerCase();
            switch (whoAccess) {
                case "a":
                    whoAccess = "Aluno";
                    break label;
                case "s":
                    whoAccess = "Secretaria"; // search clear console

                    break label;
                case "quit":
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        //_______________________________________________________________________________________
        //STUDENT ACCESS
        do {
            if (whoAccess.equals("Aluno")) {
                while (true) {
                    System.out.println("\nAcesso -> Alunos\n" + "Novo(N) ou existente(E)?");
                    studAccess = scanner.next().toLowerCase();
                    if (studAccess.equals("n")) {
                        studAccess = "Novo";
                        break;
                    } else if (studAccess.equals("e")) {
                        studAccess = "Existente";
                        break;
                    } else if (whoAccess.equals("quit")) {
                        return;
                    } else {
                        System.out.println("Opção inválida");
                    }
                }
            }

            if (studAccess.equals("Novo")) {
                System.out.println("Pretende iniciar um novo registo? (Y / N)");
                regStu = scanner.next().toLowerCase();
                if (regStu.equals("y")) {
                    System.out.println("Nome: ");
                    aluno.setNome(scanner.next());
                    System.out.println("Apelido: ");
                    aluno.setApelido(scanner.next());
                    System.out.println("Idade: ");
                    aluno.setIdade(scanner.nextByte());
                    System.out.println("NIF: ");
                    aluno.setNif(scanner.nextInt());
                    System.out.println("Cidade: ");
                    aluno.setCidade(scanner.next());
                    System.out.println("Registo efetuado com sucesso");
                }
            }

            studList.add(aluno);

            try {
                FileWriter myWriter = new FileWriter("file_alunos.txt");
                myWriter.write(String.valueOf(studList));
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            if (studAccess.equals("Existente")) {
                System.out.println("MenuAlunos:");
                System.out.println("1) Consultar dados pessoais");
                System.out.println("2) Consultar disciplinas");
                System.out.println("3) Consultar professores");
                System.out.println("4) Editar dados pessoais");
                oldStu = scanner.nextInt();

                if (oldStu == 1) {
                    System.out.println("Dados Pessoais"); //Consultar
                } else if (oldStu == 2) {
                    System.out.println("Disciplinas"); // Consultar
                } else if (oldStu == 3) {
                    System.out.println("Professores"); // Consultar
                } else if (oldStu == 4) {
                    System.out.println("Editar dados pessoais");
                } else {
                    System.out.println("Opção inválida.");
                }
            }

        }while (ageStu != 0 || (oldStu >= 1 && oldStu<= 4));

        if (regStu.equals("n")) {
            System.out.println("\n Obrigado pela visita.\n" + "Aproveita para consultar a nossa oferta educativa");
        }else if (regStu.equals("quit")){
            return;
        }


        //_______________________________________________________________________________________

        // SCHOOL ACCESS

        if (whoAccess.equals("Secretaria")) {
            System.out.println("Password: ");
            privAccess = scanner.next();
        }
        if (privAccess.equals(password)) {
            System.out.println("MenuAlunos - Acesso exclusivo (Secretaria)");
            System.out.println("1) Consultar Aluno (por nome)");
            System.out.println("2) Consultar Aluno (por número)");
            System.out.println("3) Consultar Aluno (por NIF)");
            System.out.println("4) Consultar Professor");
            System.out.println("5) Consultar Curso");
            System.out.println("6) Registar novo Aluno");
            System.out.println("7) Registar novo Professor");
            menuSec = scanner.nextByte();
            if (menuSec == 1) {
                System.out.println("Pesquisa \n" + "Aluno -> Inserir nome");

            } else if (menuSec == 2) {
                System.out.println("Pesquisa \n" + "Aluno -> Inserir número de aluno");
            } else if (menuSec == 3) {
                System.out.println("Pesquisa \n" + "Aluno -> Inserir NIF");
            } else if (menuSec == 4) {
                System.out.println("Pesquisa \n" + "Professor");
            } else if (menuSec == 5) {
                System.out.println("Pesquisa \n" + "Cursos");
            } else if (menuSec == 6) {
                System.out.println("aaa");//criar função para reutilizar aqui
            } else if (menuSec == 7) {
                System.out.println("Registar Professor");
                System.out.println("Estado (Ativo -> 1; Inativo ->0): ");
                byte stateTea = scanner.nextByte();
                String teacher = "";
                if (stateTea == 1) {
                    teacher = "Estado: Ativo\n (Faz parte da equipa docente atual)";
                } else if (stateTea == 0) {
                    teacher = "Estado: Inativo\n (Não faz parte da equipa docente atual";
                } else {
                    System.out.println("Estado inválido");
                }

                System.out.println("Disciplina(s): ");
                ageStu = scanner.nextByte();
            } else {
                System.out.println("Opção inválida.");

            }
        }
    }
}
