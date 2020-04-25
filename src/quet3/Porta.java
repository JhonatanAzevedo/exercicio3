
package quet3;

public class Porta {
Boolean aberta;
String cor = "amarela";
int dimensaoX;
int dimensaoY;
int dimensaoZ;

void abre(){
	aberta = true;
}

void fecha(){
	aberta = false;
}

void pinta(String s){
	this.cor = s;
}


boolean estaAberta() {
		if (this.aberta == true) {
			System.out.println("Está aberta");
			return true;
		} else {
			System.out.println("Está fechada");
			return false;
    
                }         
    }



}