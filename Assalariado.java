package principal;

public class Assalariado extends Empregado{

    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras){
        super(nome, sobrenome, numIdent);
        this.horasExtras = horasExtras;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        double total = 0;
        if(horasExtras != 0){
            total = Passivo.SALARIO + Passivo.HORA * horasExtras;
        }else{
            total = Passivo.SALARIO;
        }
        return total;
    }
}
