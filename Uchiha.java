package Desafios2;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade: " + habilidadeEspecial);
    }

    public void ninjaInfo() {
        mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
