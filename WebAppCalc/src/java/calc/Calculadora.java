
package calc;

/*
 *Data 09/03/26
 * @author Ryan Lima
 */
public class Calculadora {
    // Atributos
    
    
    //Metodos
    public double Somar(double v1, double v2) {
        return v1 + v2;
    }
    
    public double Subtrair(double v1, double v2) {
        return v1 - v2;
    }
    
    public double Multiplicar(double v1, double v2) {
        return v1 * v2;
    }
    
    public double Dividir(double v1, double v2) {
        return v1 / v2;
    }
    
    public double Dobro(double v1) {
        return v1 * 2;
    }
    
    public double Triplo(double v1) {
        return v1 * 3;
    }
    
    public double Raiz(double v1) {
        return Math.sqrt(v1);
    }
    
    public double Cubo(double v1) {
        return v1 * v1 * v1;
    }
    
    public double RestoDivisao(double v1, double v2) {
        return v1 % v2;
    }
}
