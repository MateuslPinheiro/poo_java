public class ClasseConta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status_aberto = false;

    public ClasseConta(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        if (tipo == "Conta corrente"){
            this.saldo = 50.00f;
        } else if (tipo == "Conta poupança") {
            this.saldo = 150.00f;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus_aberto() {
        return status_aberto;
    }

    public void setStatus_aberto(boolean status_aberto) {
        this.status_aberto = status_aberto;
    }
    public void abrirConta(){this.setStatus_aberto(true);}
    public void fecharConta(){this.setStatus_aberto(false);}
    public void depositar(double d){
        if(this.status_aberto == true){
            this.saldo +=d;
            this.setSaldo(this.saldo);
        }
        else {
            System.out.println("Por favor, abra sua conta para fazer a operação.");
        }
    }
    public void sacar(double d){
        if(this.status_aberto == true){
            this.saldo -=d;
            this.setSaldo(this.saldo);
        }
        else {
            System.out.println("Por favor, abra sua conta para fazer a operação.");
        }
    }
    public void pagarMensal(){
        if(this.status_aberto == true){
            this.saldo -= 10.00f;
            this.setSaldo(this.saldo);
        }
        else {
            System.out.println("Por favor, abra sua conta para fazer a operação.");
        }
    }
    public void status(){
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Conta está aberta? " + this.isStatus_aberto());
    }
}
