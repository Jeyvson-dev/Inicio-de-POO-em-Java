package entities;
public class Triangle {


    public double a;
    public double b;
    public double c;

    public void mathTriangle(String x){

        double p = (this.a + this.b + this.c) / 2;

        double area = Math.sqrt(p * (p - this.a) * (p - this.b)* (p - this.c));

        System.out.printf("A area do triângulo %s é: %.4f", x, area);


    }
    
}
