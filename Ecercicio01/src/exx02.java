import java.sql.SQLOutput;
import java.util.Scanner;

public class exx02 {
    public static void main(String[] args) {
        Scanner recebersenha = new Scanner(System.in);

        int senha; //int = variavel inteira
        do {
            System.out.println("Digite sua Senha");
            senha = recebersenha.nextInt();
            if(senha != 123) {
                System.out.println("senha errada");
            }
            } while (senha != 123);
                System.out.println( "senha correta");
            }

    }

