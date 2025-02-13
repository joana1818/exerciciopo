package Q03;

import java.util.ArrayList;
import java.util.List;

class Veiculo {
    public void ligar() {
        System.out.println("O veículo está ligado.");
    }

    public void desligar() {
        System.out.println("O veículo está desligado.");
    }
}

class Carro extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("O carro esta em movimento: Vrum,vrum!");
    }
}

class Moto extends Veiculo {
    @Override
    public void ligar() {
        System.out.println("A moto está ligada: Ram dam dam!");
    }
}

 class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());


        for (Veiculo v : veiculos) {
            v.ligar();
        }
    }
}

