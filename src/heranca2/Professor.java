package heranca2;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    //Métodos
    public void receberAumento(float s){
        this.salario += s;
    }
    //Métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
