package principal;

public class Concessionaria extends Conta{

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return this.valor;
    }
}
