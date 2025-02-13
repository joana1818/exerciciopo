package Q02;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSalario(){
        return salario;
    }

    public double setSalario( double salario){
        this.salario = salario;
    }

    public void calcularSalario(){
        return salario;
    }
}


class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }
}

class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joana", 2222);
        Gerente gerente = new Gerente("Kailane", 12344, 98383);

        System.out.println(funcionario.getNome() + funcionario.getSalario());
        System.out.println(gerente.getNome() + gerente.calcularSalario());
    }
}
