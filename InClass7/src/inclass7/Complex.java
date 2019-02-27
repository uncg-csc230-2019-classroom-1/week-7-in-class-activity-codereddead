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
        long Rp = (long) (realPart + secondComplex.getRealPart());           
        long Ri = (long) (imaginaryPart + secondComplex.getImaginaryPart());
        return new Complex(Rp,Ri);
                
    }
    
    public Complex subtract(Complex secondComplex){
         long Rp2 = (long) (realPart - secondComplex.getRealPart()); 
         long Ri2 = (long) (imaginaryPart - secondComplex.getImaginaryPart());
        return new Complex(Rp2,Ri2);
    }
    
    public Complex multiply(Complex secondComplex){
         long Rp3 = (long) ((realPart * secondComplex.getRealPart())
                 - (imaginaryPart * secondComplex.getImaginaryPart()));
              
        long Ri3 = (long) ((imaginaryPart * secondComplex.getRealPart())
                + (realPart * secondComplex.getImaginaryPart()));
        return new Complex(Rp3,Ri3);
    }
    
    public Complex divide(Complex secondComplex){
          long Rp4 = (long) (((realPart * secondComplex.getRealPart())
                 + (imaginaryPart * secondComplex.getImaginaryPart()))
                  / ((Math.pow(secondComplex.getRealPart(),2) + Math.pow(secondComplex.getImaginaryPart(),2))));
          
          long Ri4 = (long) (((imaginaryPart * secondComplex.getRealPart())
                 - (realPart * secondComplex.getImaginaryPart())) 
                  /((Math.pow(secondComplex.getRealPart(),2) + Math.pow(secondComplex.getImaginaryPart(),2))));
          return new Complex(Rp4, Ri4);
    }
    
    public Complex abs(Complex secondComplex){
    long Rp5 = (long) (Math.sqrt(Math.pow(realPart ,2) + (Math.pow(imaginaryPart,2))));
    
    return new Complex(Rp5);
    
    }
    /*
    Done with my Code Version - Joshua Karlton-Senaye
    */
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