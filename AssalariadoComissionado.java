package principal;

public class AssalariadoComissionado extends Comissionado{

    private double percentualBonus;

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas, double percentualBonus){
        super(nome, sobrenome, numIdent, valorVendas);
        this.percentualBonus = percentualBonus;
    }

    public double getValorAPagar(int diaPagto, int mesPagto){
        return Passivo.SALARIO + getValorVendas()*percentualBonus;
    }
}
