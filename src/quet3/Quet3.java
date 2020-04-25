
package quet3;



public class Quet3 {

   
    public static void main(String[] args) {
    Porta p = new Porta();
    p.cor = "amarela";
    p.cor = "vermelha";
    p.dimensaoX = 10;
    p.dimensaoY = 20;
    p.dimensaoZ = 30;
    p.abre();
    p.fecha();
    
    p.estaAberta();
    
    
    Casa c = new Casa();
    
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
    
    c.cor = "verde";
    
   c.porta1 = porta1;
   c.porta2 = porta2;
   c.porta3 = porta3;
   
   c.porta1.abre();
   c.porta2.abre();
   c.porta1.fecha();
   c.porta2.fecha();
   c.porta3.abre();
   c.porta1.abre();
   c.porta2.abre();
    
    System.out.println(c.quantasPortasEstaoAbertas());
    
    
    
    Edificio edificio1 = new Edificio();
    
    edificio1.cor = "verde";
    
    Porta porta01 = new Porta();
    Porta porta02 = new Porta();
    Porta porta03 = new Porta();
    Porta porta04 = new Porta();
    Porta porta05 = new Porta();
    Porta porta06 = new Porta();
    
    edificio1.addPorta(porta01);
    edificio1.addPorta(porta02);
    edificio1.addPorta(porta03);
    edificio1.addPorta(porta04);
    edificio1.addPorta(porta05);
    edificio1.addPorta(porta06);
    
    porta01.abre();
    porta02.fecha();
    porta03.abre();
    porta04.abre();
    porta05.fecha();
    porta06.abre();
    
        System.out.println(edificio1.getQntPortasOpen());
    
    edificio1.addAndares();
    
      System.out.println(edificio1.getTotalDeAndares());
    
    
    
    }
      
    
    
}
    
    

