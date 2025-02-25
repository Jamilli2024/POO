package POO;

public class Aluno {
    public String nome;
    public double altura;
 
    public Aluno() {
    }
 
    public void estudar(String var1) {
       System.out.println(this.nome + " estuda " + var1);
    }
 
    public void pedirNota(String var2) {
       System.out.println(this.nome + " está pedindo a nota ao professor " + var2);
    }
 }