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
        return getSalario() + bonus;
    }

}
