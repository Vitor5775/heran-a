public class empregado extends pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public empregado() {

    }
    public empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public double calcularSalario() {
        double salarioLiquido = salarioBase * (1 - imposto / 100);
        return salarioLiquido;
    }
    public static void main(String[] args) {
    empregado empregado = new empregado("Erick", "Av. B", "987654321", 123, 3000.0, 10.0);
        
        System.out.println("Nome do empregado: " + empregado.getnome());
        System.out.println("Salário liquido: R$" + empregado.calcularSalario());
    } 
    }        
    
