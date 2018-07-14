/*
Calculate the formula below
x(t) = 0.5 × at^2 + vit + xi
 */
public class Assignment {
    public static void main(String[] args){
        double sum = 0;        //store the result
        double a = -9.81;    //physic a = 9.81
        double v = 0;      //default the beginning of speed is 10m/s
        double x = 0;      //dfeault the beginning of position is 30m
        double t = 10;      //default time = 1s
        sum = (0.5 * a * t * t) + ( v * t ) + x;


        //better way
        double firstpart = 0.5 * a * t * t;
        double secondpart = v * t;
        sum = firstpart + secondpart + x;

        //Print result
        System.out.println("it takes " + t + " second to get " + sum + "m");

    }
}
