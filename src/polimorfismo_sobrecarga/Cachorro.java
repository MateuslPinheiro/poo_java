package polimorfismo_sobrecarga;

public class Cachorro {
    public String reagir(String frase){
        if(frase == "toma comida" || frase== "Olá"){
            return "Abanar e Latir";
        } else {
            return "Rosnar";
        }
    }
    public String reagir(int hora, int minuto){
        if(hora<12){
            return "Abanar";
        } else if (hora>=18) {
            return "Ignorar";
        } else {
            return "Abanar e Latir";
        }
    }

    public String reagir(boolean dono){
        if (dono == true){
            return "Abanar";
        } else {
            return "Rosnar e Latir";
        }
    }
    public String reagir(int idade, float peso){
        if (idade<5){
            if (peso<10){
                return "Abanar";
            } else {
                return "Latir";
            }
        } else {
            if(peso<10){
                return "Rosnar";
            } else {
                return "Ignorar";
            }
        }
    }
}
