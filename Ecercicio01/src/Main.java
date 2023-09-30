import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String[] listaProfessores = {"Alanas", "Thiago", "Samanta", "Alexa", "Odirley"};

        for (int contador = 0; contador < listaProfessores.length; contador++) {
            System.out.println("Indice atual e" + contador);
            if (contador == 0) {
                System.out.println("O numero de indice do(a) professor(a)" + listaProfessores[contador] + "é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("O numero de indice do(a) professor(a)" + listaProfessores[contador] + "é par");
            } else {
                System.out.println("O numero de indice do(a) professor(a)" + listaProfessores[contador] + "é impar");
            }
        }
    }
}
