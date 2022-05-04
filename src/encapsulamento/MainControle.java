package encapsulamento;

public class MainControle {
   public static void main(String[] args) {
      ControleRemoto c = new ControleRemoto();
      c.ligar();
      c.play();
      c.maisVolume();
      c.abrirMenu();
   }

}
