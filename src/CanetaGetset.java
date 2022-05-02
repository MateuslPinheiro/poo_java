public class CanetaGetset {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public CanetaGetset(String m, String c, float p) { //Este é o método Construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public String getCor(){
        return this.cor;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada " +this.tampada);
    }
}
