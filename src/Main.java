public class Main {
    public static void main(String[] args) {

        //Exemplo de interface:
        /*
        operações em um conta corrente após o desing da solução de uma nova funcionalidade do projeto conta corrente,
        voce ficou responsavel por criar a classe OperacoesContaCorrenteImpl, que implementara a interface
        OperacoesContaCorrente.

        o método double realizaDeposito(ContaCorrente contaCorrente, Double deposito) devera aceitrar aoenas valores
        positivos para deposito. O método doyble realizaSaque(ContaCorrente contaCorrente, Double saque) devera retornar
        true, se o valor sacado for menor ou igual ao saldo da Conta, ou false caso contrario.
         */

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia("1234");
        contaCorrente.setConta("5678");
        contaCorrente.setSaldo(1000.0);

        // Cria uma nova instância de OperacoesContaCorrenteImpl
        OperacoesContaCorrente operacoes = new OperacoesContaCorrenteImpl();

        // Realiza um depósito
        double novoSaldo = operacoes.realizaDeposito(contaCorrente, 500.0);
        System.out.println("Saldo após depósito: " + novoSaldo);
        // Realiza um saque
        boolean saqueRealizado = operacoes.realizaSaque(contaCorrente, 1500.10);
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso. Saldo atual: " + contaCorrente.getSaldo());
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
        // Metdodo default da interface
        operacoes.mostraSaldo(contaCorrente);
    }
}