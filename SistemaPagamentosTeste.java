package principal;

public class SistemaPagamentosTeste {
    public static void main(String[] args){
        ControlePagamento controle = new ControlePagamento();
        Passivo passivo1 = new Assalariado("Eduardo", "Morais", 1, 20);
        Passivo passivo2 = new Terceirizado("Ivone", "Aparecida", 2, 36);
        Passivo passivo3 = new Comissionado("Jaqueline", "Morais", 3, 4000);
        Passivo passivo4 = new AssalariadoComissionado("Marta", "Tereza", 4, 4000, 0.06);
        Passivo passivo5 = new Titulo(27, 4, 1200);
        Passivo passivo6 = new Concessionaria(28, 4, 5000);
        Passivo passivo7 = new Assalariado("Artur", "Amaral", 5, 25);

        controle.adicionarPagamento(passivo1);
        controle.adicionarPagamento(passivo2);
        controle.adicionarPagamento(passivo3);
        controle.adicionarPagamento(passivo4);
        controle.adicionarPagamento(passivo5);
        controle.adicionarPagamento(passivo6);
        controle.adicionarPagamento(passivo7);

        System.out.println(controle.pagamentoEmpregado(28, 4));
        System.out.println(controle.pagamentoContas(28, 4));
        System.out.println("Total: " + controle.totalPagar(28, 4));

    }
}
