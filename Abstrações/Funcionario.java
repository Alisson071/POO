package Abstrações;

abstract class Funcionario {
    private String nome;
    private String matricula;
    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String toString(){
        return ("Nome: " + this.nome + ", Matricula: " + this.matricula);
    }
    public String getNome(){
        return this.nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public abstract double ganhos();
    
}