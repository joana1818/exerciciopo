package Q05;
import java.util.Arrays;
import java.util.List;

    class Aluno {
        private String nome;
        private double[] notas;

        public Aluno(String nome, double[] notas) {
            this.nome = nome;
            this.notas = notas;
        }

        public double calcularMedia() {
            return Arrays.stream(notas).average().orElse(0);
        }

        public String getSituacao() {
            return calcularMedia() >= 6.0 ? "Aprovado" : "Reprovado";
        }

        public void exibirInformacoes() {
            System.out.println(nome + " | Média: " + calcularMedia() + " | Situação: " + getSituacao());
        }
    }

        class Main {
        public static void main(String[] args) {
            List<Aluno> alunos = List.of(
                    new Aluno("Joana", new double[]{7.5, 8.0, 6.5}),
                    new Aluno("Kailane", new double[]{5.0, 4.5, 6.0}),
                    new Aluno("Cleudinete", new double[]{8.0, 9.0, 7.5})
            );

            alunos.forEach(a -> {
                a.exibirInformacoes();
                System.out.println("Situação: " + a.getSituacao());
            });
        }
    }


