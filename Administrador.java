public class Administrador extends empregado {
    private double ajudaDeCusto;

    public Administrador() {
    }
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    @Override
    public double calcularSalario() {
        double salarioLiquidoEmpregado = super.calcularSalario();
        double salarioComAjuda = salarioLiquidoEmpregado + ajudaDeCusto;
        return salarioComAjuda;
    }
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Carlos", "Av. C", "987654321", 456, 4000.0, 15.0, 500.0);
        System.out.println("Nome do administrador: " + administrador.getnome());
        System.out.println("Salário líquido com ajuda de custo: R$" + administrador.calcularSalario());
    }
}