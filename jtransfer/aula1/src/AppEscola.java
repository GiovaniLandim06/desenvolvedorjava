import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppEscola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Você faz faculdade? ");
        int temFaculdade = sc.nextInt();

        boolean temFaculdadeBollean = false;

        if (temFaculdade == 1) {
            temFaculdadeBollean = true;
        } else if (temFaculdade == 0) {
            temFaculdadeBollean = false;
        }

        Aluno aluno = new Aluno(nome, idade, temFaculdadeBollean);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());
 

        /*
          List<Aluno> alunos = new ArrayList<>();
          
          System.out.println("Quantos alunos serão cadastrados? ");
          int n = sc.nextInt();
          
          for (int i = 1; i <= n; i++) {
         System.out.println("Cadastro aluno #" + i);
          System.out.print("Digite seu nome: ");
          sc.nextLine();
          String nome = sc.nextLine();
          System.out.print("Digite sua idade: ");
          int idade = sc.nextInt();
          System.out.print("Você faz faculdade? ");
          boolean temFaculdade = sc.nextBoolean();
         
         alunos.add(new Aluno(nome, idade, temFaculdade));
          }
          
         for (Aluno aluno : alunos) {
         System.out.println(aluno);
         }
         
         

        List<Aluno> alunos = new ArrayList<>();      
        int n;
        System.out.println("---------CADASTRO DE ALUNOS---------");
        
        do {
            System.out.print("Digite seu nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.print("Você faz faculdade? ");
            boolean temFaculdade = sc.nextBoolean();
            
            alunos.add(new Aluno(nome, idade, temFaculdade));
            
            System.out.println("Continuar adicionando alunos? 0-Não 1-Sim");
            n = sc.nextInt();
         } while (n != 0);

          
         for (Aluno aluno : alunos) {
          System.out.println(aluno);
          }
  
 */
         sc.close();
    }

}
