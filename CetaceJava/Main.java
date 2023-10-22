package CetaceJava;

public class Main{
    public static void main(String[] args){

        Balaenides  monBalaenides = new Balaenides();

        String message = "La " + monBalaenides.nomCommun() + " est un cétacé. " + monBalaenides.nager() + " c'est aussi un mysticète." + monBalaenides.seNourrir();

        System.out.println(message);
    
        }
    }
    

