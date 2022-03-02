public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA = 15;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIA++;
    }

    // --------------------------------------------------------------
    @Override
    public void sacar(double valorSaque) {
        saldo -= valorSaque;
    }

    @Override
    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    @Override
    public void transferir(double valorTransferencia, Conta contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

    // ----------------------------------------------------------------------
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // ----------------------------------------------------------------------
    protected void impressao() {
        System.out.printf("Agencia: %d", this.agencia);
        System.out.printf("\nNumero da Conta: %d", this.numero);
        System.out.printf("\nSaldo: %.2f \n", this.saldo);
    }

}
