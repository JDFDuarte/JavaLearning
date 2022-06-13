package com.company;

import java.util.*;

public class Aluno extends  Pessoa{
    private String curso = "";
    private int nrInscr = 0;


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNrInscr() {
        return nrInscr;
    }

    public void setNrInscr(int nrInscr) {
        this.nrInscr = nrInscr;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", nrInscr=" + nrInscr +
                '}';
    }
}
