package Animais;

import org.w3c.dom.ls.LSOutput;

public class Gato extends Animal {

    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }


//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
//    private String estadoDeEspirito;
//
//    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.estadoDeEspirito = estadoDeEspirito;
//
//        numeroDeGatos ++;
//    }
//
//    void comer(){}
//
//    void dormir(){}
//
//    void soar(){
//        System.out.println("MIAU-MIAU");
//    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU-MIAU");
    }
}

