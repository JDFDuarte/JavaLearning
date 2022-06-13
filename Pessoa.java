package com.company;

public class Pessoa {
    //Atributos
    private String nome = "";
    private String apelido = "";
    private int idade = 0;
    private int nif = 0;
    private String cidade = "";

    //Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
        if (nif <= 99999999 || nif >= 1000000000) {
            System.out.println("NIF inválido! Inserir novamente");
        }
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //Métodos Públicos
}
