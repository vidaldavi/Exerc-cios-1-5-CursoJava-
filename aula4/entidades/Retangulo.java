package entidades;
import java.lang.Math;
public class Retangulo {
    public double altura;
    public double largura;

    public double Area() {
        return altura * largura;
    }
    public double Perimetro() {
        return (altura * 2) + (largura * 2);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }


}