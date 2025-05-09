package com.aparicioamaral.apprecycleview.model;

public class Disciplina {

    private String nomeDisciplina;
    private String professor;
    private String diaSemanda;
    private String sala;

    //Construtor Simples
    public Disciplina() {
    }

    //COnstrutor completo
    public Disciplina(String nomeDisciplina, String professor, String diaSemanda, String sala) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.diaSemanda = diaSemanda;
        this.sala = sala;
    }

    //Getters and Setters
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDiaSemanda() {
        return diaSemanda;
    }

    public void setDiaSemanda(String diaSemanda) {
        this.diaSemanda = diaSemanda;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
