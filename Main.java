import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;


public class Main {
    public static void main(String[] args) {
////////////////////////////////// Modelagem Orientada a Objetos ///////////////////////////////////////////////////////

        Gato gato1 = new  Gato("Felix", "Preto",4.5);
        Animal gato2 = new Gato("Felix", "Preto",4.5);
        Animal passaro4 = new Passaro("Felix", "Preto",4.5);

        Cachorro cachorro1 = new Cachorro("Puppy","Marron",25,5.5,5,"nada");
        Passaro passaro1 = new Passaro("Jubileu", "Mameluco", 60.2);
        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());


        cachorro1.soar();
        gato1.soar();
        passaro1.soar();



//        System.out.println(cachorro1.getNumeroDeCachorros());

//        Cachorro cachorro2 = new Cachorro("Rex","Marron",25,5.5,5,"nada");
//        System.out.println(cachorro2.getNumeroDeCachorros());
//        System.out.println(cachorro1.getNumeroDeCachorros());

/////////////////////////////////// Classes & Métodos, SWITCH , Encapsulamento  ////////////////////////////////////////

//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//        System.out.println("---------------------------");
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());


//        cachorro1.setNome("Puppy");
//        cachorro1.setCor("Marron");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);

        //System.out.println(cachorro1);

//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
//        System.out.println("O nome do cachorro é: " + cachorro2.getNome());
//        System.out.println("O peso do cachorro é: " + cachorro2.getPeso() + "Kg");
//        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
//        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
//        System.out.println("O Cachorro esta " + cachorro1.interagir("pisar na patinha"));

///////////////////////////////// Intro Hello World ////////////////////////////////////////////////////////////////////

//        System.out.println("Hello World");
//    byte variavelByte = -127;
//        // short -32768 a 32767
//        // char 0 a 65535
//        // int -2b a 2b
//        // long -9t a 9t
//
//        int variavelInt = 2564423;
//
//
//        System.out.println(variavelByte);
//        System.out.println(variavelInt);
    }

}