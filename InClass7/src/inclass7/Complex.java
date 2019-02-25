package inclass7;

public class Complex implements Cloneable {
    
    //instance variables
    
    private double realPart, imaginaryPart;
    
    //constructors
    
    public Complex(){
        this(0, 0);
    }
    
    public Complex(double a){
        this(a, 0);
    }
    
    public Complex(double a, double b){
        this.realPart = a;
        this.imaginaryPart = b;
    }
    
    //methods

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
    
    
    public Complex add(Complex secondComplex){
    
    }
    
    public Complex subtract(Complex secondComplex){
    
    }
    
    public Complex multiply(Complex secondComplex){
    
    }
    
    public Complex divide(Complex secondComplex){
    
    }
    
    public Complex abs(Complex secondComplex){
    
    }
    
    @Override
    public String toString(){
        if (imaginaryPart == 0){
            //I'm not sure how to return realPart as a string w/out the empty string attached
            return realPart + "";
        } else {
            return realPart + "+" + imaginaryPart + "i";
        }
    }
}