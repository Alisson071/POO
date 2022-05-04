package Herança;

public class AppPagamentos {
    public static void main(String args[]){
    Funcionario f = new Funcionario("Francisco", "Sales", 2.300);
    FuncionarioComissionado c = new FuncionarioComissionado("Fernando", "Souza", 3.200, 30, 0.25);

    System.out.println(f.toString());
    System.out.println(c.toString());
    }
}
