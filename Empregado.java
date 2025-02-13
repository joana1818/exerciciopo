package Q04;

    abstract class Empregado {
        private String nome, cargo;
        private double salarioBase;
        private int horasTrabalhadas;

        public Empregado(String nome, String cargo, double salarioBase, int horasTrabalhadas) {
            this.nome = nome;
            this.cargo = cargo;
            this.salarioBase = salarioBase;
            this.horasTrabalhadas = horasTrabalhadas;
        }

        public double calcularSalario() {
            return 0;
        }

        public void exibirInformacoes() {
            System.out.println(nome + " | " + cargo + " | Salário: R$ " + calcularSalario());
        }
    }

    class Gerente extends Empregado {
        private double bonus;

        public Gerente(String nome, double salarioBase, int horasTrabalhadas, double bonus) {
            super(nome, "Gerente", salarioBase, horasTrabalhadas);
            this.bonus = bonus;
        }

        @Override
        public double calcularSalario() {
            return super.calcularSalario() + bonus;
        }
    }

    class AssistenteAdministrativo extends Empregado {
        private double desconto;

        public AssistenteAdministrativo(String nome, double salarioBase, int horasTrabalhadas, double desconto) {
            super(nome, "Assistente Administrativo", salarioBase, horasTrabalhadas);
            this.desconto = desconto;
        }

        @Override
        public double calcularSalario() {
            return super.calcularSalario() - desconto;
        }
    }

         class Main {
        public static void main(String[] args) {
            Empregado[] empregados = {
                    new Gerente("Joana", 5000, 40, 1000),
                    new AssistenteAdministrativo("Bob", 3000, 40, 200)
            };

            for (Empregado emp : empregados) {
                emp.exibirInformacoes();
            }
        }
    }


