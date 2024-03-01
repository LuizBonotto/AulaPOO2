public class OperacoesContaCorrenteImpl implements OperacoesContaCorrente {
    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, Double deposito) throws IllegalArgumentException {
        if (deposito <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo");
        }
        contaCorrente.setSaldo(contaCorrente.getSaldo() + deposito);
        return contaCorrente.getSaldo();
    }

    @Override
    public boolean realizaSaque(ContaCorrente contaCorrente, Double saque) {
        if (saque > contaCorrente.getSaldo()) {
            return false;
        }
        contaCorrente.setSaldo(contaCorrente.getSaldo() - saque);
        return true;
    }

}
