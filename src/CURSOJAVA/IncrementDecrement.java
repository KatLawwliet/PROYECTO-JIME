package CURSOJAVA;

public class IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("JUEGO MARIO BROSS");
        //Postfija
        int lives = 5;
        System.out.println("Total de vidas: " + lives);
        lives= lives - 1;
        System.out.println("Pierde 1 vida: " + lives); // 4

        lives --; //Decrements
        System.out.println("Pierde 2 vidas: " + lives); // 3

        lives ++; //Increments
        System.out.println("Gana 1 vida: " + lives); // 4

        //Prefigure
        //GANA UN REGALO X UNA VIDA ADICIONAL
        int gift = 100 + ++lives;
        System.out.println("GANA 100 (P)+VIDAS : " + gift);


    }

}
