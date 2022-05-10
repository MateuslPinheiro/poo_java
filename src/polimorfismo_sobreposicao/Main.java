package polimorfismo_sobreposicao;

public class Main {
    public static void main(String[] args) {
        Mamifero b = new Mamifero();
        Lobo Bacon = new Lobo();
        Cachorro Biscoito = new Cachorro();

        Bacon.setIdade(12);
        Biscoito.setIdade(1);
        Bacon.setPeso(15);
        Biscoito.setPeso(3);

        System.out.println(Biscoito);
        System.out.println(Bacon);

        b.emitirSom();
        Bacon.emitirSom();
        Biscoito.emitirSom();

    }
}
