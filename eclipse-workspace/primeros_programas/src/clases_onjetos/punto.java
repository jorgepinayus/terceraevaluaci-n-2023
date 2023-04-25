package clases_onjetos;

public class punto {
	int cX;
	int cY;
	
	//constructor
	public Punto(int ncX, int ncY){
		cX=ncX;
		cY=ncY;
	}
	//Métodos get: obtiene y devuelve un valor
	int getCX() {
		return cX;
	}
	int getCY() {
		return cY;
	}
	double DistanciaOrigen(){
		double r=Math.sqrt(cX*cX+cY*cY);
		return r;
	}
	double DistanciaPunto(Punto p1){
		double r=Math.sqrt((cX-p1.cX)*(cX-p1.cX)+(cY-p1.cY)*(cY-p1.cY));
		return r;
	}
	//Métodos set: establece el valor de un atributo 
	//(si el atributo es público, para un punto p1 es más simple 
	//poner p1.cX=nX)
	void setCX(int nX) {
		cX=nX;
	}
	void setCY(int nY) {
		cY=nY;
	}
	void setCXY(int nX ,int nY) {
		cX=nX;
		cY=nY;
	}
	void Desplazar(int mx,int my){
		cX=cX+mx;
		cY=cY+my;
}
