
public class App {
    public static void main(String[] args){
        // System.out.println("Hello World!");
        char gender = 'f';
        String name = "Jamilli";
        int age = 25;
        double altura = 1.63;
        boolean canVote = false;

        System.out.println("Nome: " + name);
        System.out.println("Idade:" + age);
        System.out.println("Altura:"+ altura);

        if (age < 16){
            System.out.println(name + " não pode votar");

            }
        else if(age < 18 || age > 64){
            System.out.println(name + " Você não é obrigado a votar!");
            canVote = true;
        }
        else {
            System.out.println(" Você é obrigado a votar!");
            canVote = true;
        }
        
        if(canVote){
            System.out.println(name +" Vote consciente!");
        }
        


    }
}
