package Herança;

public class Funcionario{
    private String primeiro_nome;
    private String segundo_nome;
    private double salario;

    public Funcionario(String primeiro_nome, String segundo_nome, double salario){
        this.primeiro_nome = primeiro_nome;
        this.segundo_nome = segundo_nome;
        this.salario = salario;
    }
    public String toString() {
        return String.format("Nome: %s - Sobrenome: %s - salario: %.3f", this.primeiro_nome, this.segundo_nome, this.salario);
    }

    public String getPrimeiroNome(){
        return primeiro_nome;
    }
    public String getSegundoNome(){
        return segundo_nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setPrimeiroNome(String primeiro_nome){
        this.primeiro_nome = primeiro_nome;
    }
    public void setSegundoNome(String segundo_nome){
        this.segundo_nome = segundo_nome;
    }
    public void setSalario(double salario){
        this.salario = salario;

    }
}