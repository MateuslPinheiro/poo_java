package heranca2;

public class Bolsista extends Aluno{
    //Atributos
    private float bolsa;
    //Métodos
    public void renovarBolsa(){
        System.out.println(this.getNome() + " recebeu sua bolsa");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }
    //Métodos especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
