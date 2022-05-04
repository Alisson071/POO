package Herança;

public class FuncionarioComissionado extends Funcionario{
    private int comissao;
    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, int comissao){
        super(primeiro_nome, segundo_nome, salario);
        this.comissao = comissao;
    }
    
}
