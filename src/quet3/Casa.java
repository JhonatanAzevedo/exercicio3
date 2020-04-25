
package quet3;

public class Casa {
String cor;
Porta porta1;
Porta porta2;
Porta porta3;


void pinta(String s){
	this.cor = s;
}


int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		if (this.porta1.aberta == true && this.porta2.aberta == true && this.porta3.aberta == true) {
			return portasAbertas = 3;
		} else if ((this.porta1.aberta == true && this.porta2.aberta == true && this.porta3.aberta == false) || (this.porta1.aberta == true && this.porta2.aberta == false && this.porta3.aberta == true) || (this.porta1.aberta == false && this.porta2.aberta == true && this.porta3.aberta == true)) {
			return portasAbertas = 2;
		} else if ((this.porta1.aberta == true && this.porta2.aberta == false && this.porta3.aberta == false) || (this.porta1.aberta == false && this.porta2.aberta == true && this.porta3.aberta == false) || (this.porta1.aberta == false && this.porta2.aberta == false && this.porta3.aberta == true)) {
			return portasAbertas = 1;
		}
		else {
			return portasAbertas;
		}

}


int totalDePortas() {
	return 3;
	}


}


