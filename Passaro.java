package Animais;

public class Passaro extends Animal {
    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
//    private String estadoDeEspirito;

//    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.estadoDeEspirito = estadoDeEspirito;
//
//        numeroDePassaros ++;

//    }
//    void comer(){}
//
//    void dormir(){}
//
//    void soar(){
//        System.out.println("PIU-PIU");
//    }

//    }


    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("PIU-PIU");
    }
}
