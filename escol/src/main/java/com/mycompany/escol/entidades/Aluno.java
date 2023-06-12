package com.mycompany.escol.entidades;
import java.util.Date;
public class Aluno {
  private String nome;
  private char sexo;
  private int idade;
  private String matricula;
  private Date ano;

    public Aluno(String nome, char sexo, int idade, String matricula, Date ano) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.matricula = matricula;
        this.ano = ano;
    }
          
  public Aluno(){
      this.nome = "";
      this.sexo = ' ';
      this.idade = 0;
      this.matricula = "";
      this.ano = new Date();
  }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Date getAno() {
        return ano;
    }
    public void setAno(Date ano) {
        this.ano = ano;
    }

}


