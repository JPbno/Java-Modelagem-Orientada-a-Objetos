package Animais;

import java.sql.Struct;

public class Cachorro extends Animal{
    // Atributos

    static int numeroDeCachorros;
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
    private int tamanhoDoRabo;
//    private String estadoDeEspirito;

    // Construtores
    // (Padrão/Default)
//    public Cachorro(){
//
//    }
    // Construtores
    // (Adicionais)
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    // Métodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

//    public void comer(){}
//
//    public void soar(){
//        System.out.println("AU AU");
//    }

//    public String pegar(){
//        return "Bolinha";
//    }

    public String interagir(String acao){

        switch (acao){
            case "carinho" : this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir" :  this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "Triste"; break;
            default: this.estadoDeEspirito = "Neutro";
        }
        return this.estadoDeEspirito;

//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "Feliz";
//        } else if (acao.equals("vai dormir")) {
//            this.estadoDeEspirito = "Bravo";
//        }else {
//            this.estadoDeEspirito = "Neutro";
//        }
//        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU-AU");
    }
}

