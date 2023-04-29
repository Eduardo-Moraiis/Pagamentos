package principal;

public interface Passivo {
    public static final double SALARIO = 1320.00;
    public static final double HORA = 65.00;

    public abstract double getValorAPagar(int diaPagto, int mesPagto);
}
