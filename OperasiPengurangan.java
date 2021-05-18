package operasibilangan;

/**
 *
 * @author my computer
 */
public class OperasiPengurangan extends OperasiBilanganCetak {
    protected double  a;
    protected double  b;
    protected double  c;

    protected void setA(double a){
        this.a= a;
    }
    protected double getA(){
        return a;
    }
      protected void setB(double b){
        this.b= b;
    }
    protected double getB(){
        return b;
    }
      protected void setC(){
        this.c= a-b;
    }
    protected double getC(){
        return c;
    }
   
   
    protected void tampil(){
        System.out.println("HASIL = "+getC());
    }


}
    
