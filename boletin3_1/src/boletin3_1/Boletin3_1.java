
package boletin3_1;

public class Boletin3_1 {

    public static void main(String[] args) {
    
        Coche coche1=new Coche();
        coche1.acelerar(10);
          System.out.println("velocidade ="+ coche1.getVelocidade());
        coche1.frenar(7);
        System.out.println("velocidade ="+ coche1.getVelocidade());
    }
    
}
