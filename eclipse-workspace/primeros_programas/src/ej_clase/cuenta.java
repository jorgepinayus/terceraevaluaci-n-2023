package ej_clase;

public class cuenta {
	String titular;
	double cantidad;
	
	public Cuenta(String T, double c) {
		titular=T;
		cantidad=c;
	}
	public Cuenta(String T) {
		titular=T;
		cantidad=0;
	}
	
	double getCant() {
		return cantidad;
	}
	void setCant(double n) {
		cantidad=n;
	}
	String getTit() {
		return titular;
	}
	void setTit(String n) {
		titular=n;
	}
	void ingresar(double n) {
		if (n>0){
			cantidad=cantidad+n;
		}
	}
	void retirar(double n) {
		cantidad=cantidad-n;
		if (cantidad<0){
			cantidad=0;
}
