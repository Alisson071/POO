package Abstrações;

public class FuncionarioHora extends FuncionarioAssalariado{
    private int horas;
    private double valorDaHora;
    public FuncionarioHora(String nome, String matricula, double salarioSemanal, int horas, double valorDaHora){
        super(nome, matricula, salarioSemanal);
        this.horas = horas;
        this.valorDaHora = valorDaHora;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getValorDaHora() {
        return valorDaHora;
    }
    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
    @Override
    public double ganhos() {
        return super.ganhos() + horas*valorDaHora;
    }
    public String toString() {
        return super.toString() + String.format(" - Horas: %d - Valor: %.2f - Salario: %.3f", this.horas, this.valorDaHora, ganhos());
    }
    
}
