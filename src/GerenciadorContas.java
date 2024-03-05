class GerenciadorContas {
    public static <T extends ContaBancaria> void transferir(T origem, T destino, double valor) {
        if (origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente na conta de origem.");
        }
    }
}