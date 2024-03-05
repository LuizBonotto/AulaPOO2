import java.util.List;
import java.util.ArrayList;
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
        System.out.println("Exercício 1: interface op conta corrente");
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
        boolean saqueRealizado = operacoes.realizaSaque(contaCorrente, 1500.0);
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso. Saldo atual: " + contaCorrente.getSaldo());
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
        // Metodo default da interface
        operacoes.mostraSaldo(contaCorrente);
        System.out.println("fim!");
        System.out.println();

        /*
        Exercício 2
        Crie uma interface Forma2D que possui o método area() que retorna a área de uma forma geométrica. Implemente
        essa interface para as seguintes formas Quadrado, Retângulo e Circulo. Crie um método que receba uma lista de
        formas e retorne a soma das areas dessas formas.
         */
        System.out.println("Exercício 2: interface calculo de area de formas geometricas");
        //Criando objetos
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Circulo circulo = new Circulo(3);
        //Add objetos a lista
        List<Forma2D> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(retangulo);
        formas.add(circulo);
        //Somando todas as areas dos objetos
        double areaTotal = calcularAreaTotal(formas);
        System.out.printf("A área total das formas é: %.2f\n", areaTotal);
        System.out.println("fim!");

        /*
        Crie uma interface Forma3D que estenda o comportamento da interface Forma2D do exercício anterior adicionando o
         método volume(). Implemente essa interface para as seguintes formas Cubo, Cilindro e Esfera. Crie um método que
         receba uma lista de formas e retorne a soma dos volumes, verificar se o método anterior soma corretamente as
         áreas das formas 3D também.
         */
        System.out.println("Exerceio 2 melhorado: interface extends interface");
        Cubo cubo = new Cubo(3);
        Cilindro cilindro = new Cilindro(2, 5);
        Esfera esfera = new Esfera(4);

        List<Forma3D> formas3D = new ArrayList<>();
        formas3D.add(cubo);
        formas3D.add(cilindro);
        formas3D.add(esfera);

        double volumeTotal = calcularVolumeTotal(formas3D);

        System.out.printf("O volume total das formas 3D é: %.2f\n", volumeTotal);
        System.out.println("fim!");

        /*
        Exercício Generics

        Criar classes Conta Corrente e Poupanca
        Atributos:
        numeroConta (int): Número da conta bancária.
        saldo (double): Saldo atual da conta bancária.

        Métodos:
        depositar(double valor): Adiciona o valor especificado ao saldo da conta.
        sacar(double valor): Subtrai o valor especificado do saldo da conta (se houver saldo suficiente).


        Cria uma outra classe GerenciadorContas, implemente o método transferir(T origem, T destino, double valor) que
        transfere
        um valor da conta de origem para a conta de destino,
        verificando se há um saldo suficiente na conta de origem.
         */

        ContaBancaria cc1 = new ContaCorrente(1001);
        ContaBancaria cp1 = new ContaPoupanca(2001);

        cc1.depositar(1000);
        cp1.depositar(500);
        System.out.println("Exercicio contas");
        System.out.println("Saldo CC: " + cc1.getSaldo());
        System.out.println("Saldo CP: " + cp1.getSaldo());

        GerenciadorContas.transferir(cc1, cp1, 300); // Transferir 300 da CC para CP

        System.out.println("Saldo CC: " + cc1.getSaldo());
        System.out.println("Saldo CP: " + cp1.getSaldo());
    }

    // Método para calcular a soma das áreas das formas, exercicio 2
    public static double calcularAreaTotal(List<Forma2D> formas) {
        double somaAreas = 0;
        for (Forma2D forma : formas) {
            somaAreas += forma.area();
        }
        return somaAreas;
    }
    // Método para calcular a soma das áreas das formas, exercicio 2
    public static double calcularVolumeTotal(List<Forma3D> formas) {
        double somaVolumes = 0;
        for (Forma3D forma : formas) {
            somaVolumes += forma.volume();
        }
        return somaVolumes;
    }
}