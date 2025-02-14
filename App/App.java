import java.util.Scanner;

public class App {
    public static double calculaIMC(double altura, double peso) {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        char gender = 'f';
        String name = "Jamilli";
        int age;
        double peso = 75;
        double altura = 1.63;
        boolean canVote = false;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade");
        age = ler.nextInt();

        double calculaIMC = calculaIMC(altura, peso);
        System.out.println("O resuldo do IMC é :"+ calculaIMC);
    


       // for (int i = 0; i < age; i++) {
       //     System.out.println("Parabéns para você: " + name);
       // } imprimir a frase o número de vezes da idade

        System.out.println("Nome: " + name);
        System.out.println("Idade:" + age);
        System.out.println("Altura:" + altura);

        if (age < 16) {
            System.out.println(name + " você não pode votar");

        } else if (age < 18 || age > 64) {
            System.out.println(name + "Você não é obrigado a votar!");
            canVote = true;
        } else {
            System.out.println("Você é obrigado a votar!");
            canVote = true;
        }

        if (canVote) {
            System.out.println(name + " Vote consciente!");
        }

    }
}
// função comum
// public double calculaIMC(double altura,double peso) {
// return peso/(altura*altura);
// }

//
// double resultadoIMC(1.70,80);
// sout(resultadoIMC)
//