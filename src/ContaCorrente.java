public class ContaCorrente extends ContaBancaria{
    private String agencia;
    private String conta;
    private int numeroConta;

    public ContaCorrente (int numeroConta) {
        super(numeroConta);
    }

    public ContaCorrente() {
        super();
    }

    public int getNumeroConta() { return numeroConta; }

    public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta; }

    // getters e setters
    public String getAgencia() { return agencia; }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

}
