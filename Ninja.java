package Desafios2;

public abstract class Ninja {

    //Declarando atributos
    String nome;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    int idade;

    public void mostrarInformacoes() {
        System.out.println("Nome e Idade: " + nome + ", " + idade + " anos");
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
    }
}
