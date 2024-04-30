public class fornecedor extends pessoa {
    private double valorCredito;
    private double valorDivida;

    public fornecedor() {
        
    }
    public fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
        public double oberSaldo() {
            return valorCredito - valorDivida;
        }
        public static void main(String[] args) {
            fornecedor fornecedor = new fornecedor("João", "Rua A", "33481254", 1000.0, 500.0);
            System.out.println("Nome do fornecedor: " + fornecedor.getnome());
            System.out.println("Saldo:  R$" + fornecedor.oberSaldo());
        }
}
