package principal;

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Passivo> pagamentos;

    public ControlePagamento(){
        this.pagamentos = new ArrayList<>();
    }
    public void adicionarPagamento(Passivo passivo){
        pagamentos.add(passivo);
    }
    public double totalPagar(int diaPag, int mesPag){
        double total = 0;
        for(Passivo passivo : pagamentos){
            total += passivo.getValorAPagar(diaPag, mesPag);
        }
        return total;
    }

    public String pagamentoEmpregado(int diaPag, int mesPag){
        String controle = "";
        for (Passivo passivo : pagamentos){
            if(passivo instanceof Empregado){
                controle += "Nome: " + ((Empregado) passivo).nome + " " +((Empregado) passivo).sobrenome  + "\n" + "Identificacao: " + ((Empregado) passivo).numIdent + "\n" + "Valor a pagar: " + passivo.getValorAPagar(diaPag, mesPag) + "\n" +"----------------------"+"\n";
            }
        }
        return controle;
    }

    public String pagamentoContas(int diaPag, int mesPag){
        String controle = "";
        for(Passivo passivo : pagamentos){
            if(passivo instanceof Conta) {
                controle += "Dia pago: " + diaPag + " Mes pago: " + mesPag + " Valor a pagar: " + passivo.getValorAPagar(diaPag, mesPag) + "\n";
            }
        }
        return controle;
    }
    public ArrayList<Passivo> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
