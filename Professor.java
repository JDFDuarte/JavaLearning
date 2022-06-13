package com.company;

public class Professor extends Pessoa{
    private String disciplina = "";
    private int nrDisc = 0;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNrDisc() {
        return nrDisc;
    }

    public void setNrDisc(int nrDisc) {
        this.nrDisc = nrDisc;
    }
}
