package week10;

import java.util.Scanner;

public class UseParticle {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Particle tag id? : ");
        int tag = keyboard.nextInt();
        Particle particle = new Particle(tag);
        System.out.println(particle);

        while (true) {
            System.out.print("Enter movement: ");
            double x = keyboard.nextDouble();
            double y = keyboard.nextDouble();
            if (x == 0.0 && y == 0.0) {
                break;
            }
            particle.move(x, y);
            System.out.println(particle);
        }
        System.out.println(particle);
    } // end of the main method

} // end of the UseParticle class
