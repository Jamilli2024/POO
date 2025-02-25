package POO;

public class App {


    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
      
        aluno1.nome = "Arthur";
        aluno1.altura = 1.45;

        aluno2.nome = "Jamilli Silva";
        aluno2.altura = 1.63;
        
        System.out.println("nome do aluno:   "   +  aluno1.nome);       
        System.out.println("Altura: " + aluno1.altura);

        aluno1.nome = "Jamilli";

         System.out.println("Aluno atualizado é:  " +  aluno1.nome);


         System.out.println("nome do aluno:   "   +  aluno2.nome);       
         System.out.println("Altura: " + aluno2.altura);

         aluno1.estudar("POO");
        
         aluno1.pedirNota("Iago" );

        

    }
}
