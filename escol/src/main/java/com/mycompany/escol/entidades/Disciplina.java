package com.mycompany.escol.entidades;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
  private String nome;
  private int semestre;
  private String horario;
  private Professor professor;
  public List<Aluno> lstAlunos;

    public Disciplina(String nome, int semestre, String horario, Professor professor, List<Aluno> lstAlunos) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
        this.professor = professor;
        this.lstAlunos = lstAlunos;
    }

    public Disciplina() {
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
        this.professor = new Professor();
        this.lstAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getLstAlunos() {
        return lstAlunos;
    }
    public void setLstAlunos(List<Aluno> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }
    
}
