public class vendedor extends empregado {
    private double valorVendas;
    private double comissao;

    public vendedor() {
    }
    public vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario() {
        double salarioLiquidoEmpregado = super.calcularSalario();
        double salarioComComissao = salarioLiquidoEmpregado + (valorVendas * comissao / 100);
        return salarioComComissao;
    }
    public static void main(String[] args) {
        vendedor vendedor = new vendedor("Ana", "Rua E", "987654321", 789, 2000.0, 10.0, 8000.0, 3.0);
        System.out.println("Nome do vendedor: " + vendedor.getnome());
        System.out.println("Salário líquido com comissão: R$" + vendedor.calcularSalario());
    }
}