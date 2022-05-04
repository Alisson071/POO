package Herança;

public class FuncionarioComissionado extends Funcionario{
    private int qntVendas;
    private double valorVendas;
    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, int qntVendas, double valorVendas){
        super(primeiro_nome, segundo_nome, salario);
        this.qntVendas = qntVendas;
        this.valorVendas = valorVendas;
    }
    public int getQntVendas() {
        return qntVendas;
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public Double comissao(){
        return qntVendas * valorVendas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Vendas: %d - Valor: %.2f - Comissão: %.3f", this.qntVendas, this.valorVendas, comissao());
    }
    
}
