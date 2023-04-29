package principal;

public class Titulo extends Conta{

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        if(this.mes<mesPagto){
            return this.valor + this.valor*0.1;
        }else{
            if(this.dia<diaPagto){
                return this.valor + this.valor*0.1;
            }
        }
        return this.valor;
    }
}
