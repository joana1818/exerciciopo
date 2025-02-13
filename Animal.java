package Q01;

public class Animal {
    public void fazerSom(){
        System.out.println("O animal esta fazendo um som");
    }
}
class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Au,au");
    }
}
class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Miauu");
    }
}

class Main{
    public static void main(String[] args){
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        Animal [] animais = {meuCachorro,meuGato};

        for(Animal animal : animais){
            animal.fazerSom();
         }

    }
}
