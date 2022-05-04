package Abstrações;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;
    public FuncionarioAssalariado(String nome, String matricula, double salarioSemanal){
        super(nome, matricula);
        this.salarioSemanal = salarioSemanal;
    }
    @Override
    public double ganhos() {
        return salarioSemanal*4;
    }
    public double getSalarioSemanal() {
        return salarioSemanal;
    }
    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" - Salario: %.3f", ganhos());
    }
}
