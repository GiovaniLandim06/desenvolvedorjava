//encapsulamento 
// public
// private
// protected
// package 
public class Aluno {
    private String nome;
    private int idade;
    private boolean temFaculdade;


    public Aluno() {
    }


    public Aluno(String nome, int idade, boolean temFaculdade) {
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public boolean getTemFaculdade() {
        return temFaculdade;
    }


    public void setTemFaculdade(boolean temFaculdade) {
        this.temFaculdade = temFaculdade;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + ", Faz faculdade: " + temFaculdade;
    }

    

    

    
}
