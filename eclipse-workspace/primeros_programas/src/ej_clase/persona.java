package ej_clase;

public class persona {
	String nombre;
	int edad;
	String DNI;
	char sexo;
	double peso;
	double altura;
	char cns='H';
	void generarDNI() {
		char let[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z','S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int n=(int)Math.floor(Math.random() *(99999999 - 00000000 + 1) + 00000000);
		DNI=(Integer.toString(n)+let[n%23]);
	}
	void compSexo(char se) {
		if ((se!='M') && (se!='H')) {
			se=cns;
		}
		else sexo=se;
	}
	
	public Persona(){
		nombre="";
		edad=0;
		DNI="";
		sexo=cns;
		peso=0;
		altura=0;
	}
	public Persona(String nom, int ed, char s){
		nombre=nom;
		edad=ed;
		DNI="";
		compSexo(s);
		peso=0;
		altura=0;
	}
	public Persona(String nom, int ed, char s, double p, double a){
		nombre=nom;
		edad=ed;
		if ((s!='M') && (s!='H')) {
			sexo=cns;
		}
		else {
			sexo=s;
		}
		peso=p;
		altura=a;
	}
	int calcularIMC() {
		double IMC=(peso/(altura*altura));
		if (IMC<20) {
			return -1;
		}
		else if ((IMC>=20) && (IMC<=25)) {
			return 0;
		}
		else {
			return 1;
		}
	}
	boolean esMayordeEdad() {
		if (edad>=18){
			return true;
		}
		else return false;
	}
	void setNombre(String n) {
		nombre=n;}
	void setEdad(int e) {
		edad=e;}
	void setSexo(char s) {
		compSexo(s);}
	void setAltura(double d) {
		altura=d;}
	void setPeso(double p) {
		peso=p;}
	
	String getNombre() {
		return nombre;}
	int getEdad() {
		return edad;}
	char getSexo() {
		return sexo;}
	double getAltura() {
		return altura;}
	double getPeso() {
		return peso;}
	public String toString() {
		return ("La persona de nombre '"+ nombre +"' tiene los siguietes atributos:\n" + "Edad: "+ edad +"\nSexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura+"\nDNI: "+DNI);
}
