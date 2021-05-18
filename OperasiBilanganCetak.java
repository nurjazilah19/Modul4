package operasibilangan;

public class OperasiBilanganCetak {
    public static void main (String [] args ){
        
        OperasiBilangan opbil = new OperasiBilangan();
        opbil.setA(10.5);
        opbil.setB(0.5);
        opbil.setC();
        
        System.out.println("======ARITMATIKA======");
        System.out.println("Bilangan A= " + opbil.getA());
        System.out.println("Bilangan B= " + opbil.getB());
        
        opbil.tampil();
        
        OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
        jumlah.setA(10.5);
        jumlah.setB(0.5);
        jumlah.setC();
        
        System.out.println("");
        System.out.println("======PENJUMLAHAN======");
        System.out.println("Bilangan A= " + opbil.getA());
        System.out.println("Bilangan B= " + opbil.getB());
        
        jumlah.tampil();
        
        OperasiPengurangan kurang = new OperasiPengurangan();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();
        
        System.out.println("");
        System.out.println("======PENGURANGAN======");
        System.out.println("Bilangan A= " + opbil.getA());
        System.out.println("Bilangan B= " + opbil.getB());
      
        kurang.tampil();
        
        OperasiPerkalian kali = new OperasiPerkalian();
        kali.setA(10.5);
        kali.setB(0.5);
        kali.setC();
        
        System.out.println("");
        System.out.println("===PERKALIAN===");
        System.out.println("Bilangan A= " + opbil.getA());
        System.out.println("Bilangan B= " + opbil.getB());
        
        kali.tampil();
        
        OperasiPembagian bagi = new OperasiPembagian();
        bagi.setA(10.5);
        bagi.setB(0.5);
        bagi.setC();
        
        System.out.println("");
        System.out.println("======PEMBAGIAN======");
        System.out.println("Bilangan A= " + opbil.getA());
        System.out.println("Bilangan B= " + opbil.getB());
        
        bagi.tampil();
    }   
}