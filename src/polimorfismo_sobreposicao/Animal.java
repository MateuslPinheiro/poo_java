package polimorfismo_sobreposicao;

public abstract class Animal {
    protected float peso;
    protected int idade;

    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        if (this.idade == 1){
            return "Animal{" +
                    "peso = " + peso + "kg"+
                    ", idade = " + idade + " ano" +
                    '}';
        } else {
            return "Animal{" +
                    "peso = " + peso + "kg"+
                    ", idade = " + idade + " anos" +
                    '}' + "\n \n";
        }
    }
}
