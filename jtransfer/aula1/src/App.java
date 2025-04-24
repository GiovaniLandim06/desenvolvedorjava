import java.io.FileWriter; //Classe para escrever no arquivo
import java.io.IOException; //Classe para tratar exceções no arquivo
import java.nio.charset.Charset;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    
        //declaração de variaveis
        String nome;
        int opcaoTransporte;
        String meioTransporte = "";
 
        System.out.println("==Pesquisa de Transporte Diario");
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println(nome); 
        System.out.println("Como você vai ao trabalho?");
        System.out.println("1-Metrô");
        System.out.println("2-Onibûs");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Taxi");
        System.out.println("6-Carro");
        System.out.println("Escolha uma opção (1-6)");

        opcaoTransporte = sc.nextInt();
        sc.close();

        switch (opcaoTransporte) {
            case 1:
                meioTransporte = "Metro";
                break;
            case 2: 
            meioTransporte = "Ônibus";
            break;
            case 3:
            meioTransporte = "Caminhada";
            break;
            case 4:
            meioTransporte = "Uber";
            break;
            case 5: 
            meioTransporte = "Taxi";
            break;
            case 6: 
            meioTransporte = "Carro";
            break; 

        }

        //Task de amanhã: Salvar os dados no arquivo txt
        //Task no GitHub(Git e GitHub)
        System.out.println("Nome: " + nome + ", " +  "Transporte: " + meioTransporte);


        try (FileWriter file = new FileWriter("dados.txt", true)){
        
           file.write(nome + ", " + meioTransporte + "\n");
           System.out.println("Dados gravados com sucesso");
            

        } catch (IOException e) {
           System.out.println("Erro ao gravar os dados" + e.getMessage());
        }


     
        }
}
