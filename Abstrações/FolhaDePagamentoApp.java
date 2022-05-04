package Abstrações;

public class FolhaDePagamentoApp {
    public static void main(String args[]){
        FuncionarioComissionado f = new FuncionarioComissionado("José", "21345", 25, 0.30);
        FuncionarioAssalariado a = new FuncionarioAssalariado("Marcia", "34524", 300);
        FuncionarioHora h = new FuncionarioHora("Flavio", "56789", 450, 35, 0.50);
        System.out.println(f.toString());
        System.out.println(a.toString());
        System.out.println(h.toString());

    }
}
