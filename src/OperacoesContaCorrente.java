public interface OperacoesContaCorrente {
    double realizaDeposito(ContaCorrente contaCorrente, Double deposito);
    boolean realizaSaque(ContaCorrente contaCorrente, Double saque);

    default void mostraSaldo (ContaCorrente contaCorrente){
        System.out.println("Saldo da Conta: " + contaCorrente.getSaldo());
    }
}
