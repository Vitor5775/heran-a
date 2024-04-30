public class operario extends empregado {
    private double valorProducao;
    private double comissao;

    public operario() {
    }
    public operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario() {
        double salarioLiquidoEmpregado = super.calcularSalario();
        double salarioComComissao = salarioLiquidoEmpregado + (valorProducao * comissao / 100);
        return salarioComComissao;
    }
    public static void main(String[] args) {
        operario operario = new operario("Pedro", "Rua D", "987654321", 789, 2500.0, 12.0, 5000.0, 5.0);
        System.out.println("Nome do operário: " + operario.getnome());
        System.out.println("Salário líquido com comissão: R$" + operario.calcularSalario());
    }
}