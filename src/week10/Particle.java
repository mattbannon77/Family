package week10;

public class Particle {

    private int tag;
    private double xPos;
    private double yPos;

    public Particle(int tag) {

        this.tag = tag;
        this.xPos = 0.0;
        this.yPos = 0.0;
    } // end of the Particle constructor

    public void move (double x, double y) {

        this.xPos += x;
        this.yPos += y;
    } // end of the move method

    public String toString() {

        return "Particle " + tag + " is at (" + xPos + "," + yPos + ")";
    } // end of the toString method

} // end of the Particle class
