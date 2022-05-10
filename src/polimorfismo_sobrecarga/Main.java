package polimorfismo_sobrecarga;

public class Main {
    public static void main(String[] args) {
        Cachorro bacon = new Cachorro();

        System.out.println(bacon.reagir("Olá"));
        System.out.println(bacon.reagir("Vai apanhar"));
        System.out.println(bacon.reagir(11,45));
        System.out.println(bacon.reagir(21,00));
        System.out.println(bacon.reagir(true));
        System.out.println(bacon.reagir(false));
        System.out.println(bacon.reagir(2,14.5f));
        System.out.println(bacon.reagir(17,4.5f));
    }
}
