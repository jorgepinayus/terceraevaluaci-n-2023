package clases_onjetos;

public class punto2 {
	int cX;
	int cY;
	int cZ;
	
	//constructor
	public Punto3(int ncX, int ncY, int ncZ){
		cX=ncX;
		cY=ncY;
		cZ=ncZ;
	}
	//Métodos get: obtiene y devuelve un valor
	int getCX() {
		return cX;
	}
	int getCY() {
		return cY;
	}
	int getCZ() {
		return cZ;
	}
	double DistanciaOrigen(){
		double r=Math.sqrt(cX*cX+cY*cY+cZ*cZ);
		return r;
	}
	double DistanciaPunto(Punto3 p1){
		double r=Math.sqrt((cX-p1.cX)*(cX-p1.cX)+(cY-p1.cY)*(cY-p1.cY)+(cZ-p1.cZ)*(cZ-p1.cZ));
		return r;
	}
	Vector3 puntoVect(Punto3 p1) {
		Vector3 vr=new Vector3((p1.cX-cX),(p1.cY-cY),(p1.cZ-cZ));
		return vr;
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
	void setCZ(int nZ) {
		cZ=nZ;
	}
	void Desplazar(Vector3 v1){
		cX=cX+v1.cX;
		cY=cY+v1.cY;
		cZ=cZ+v1.cZ;
	}
	String toStr() {
		return("("+cX+", "+cY+", "+cZ+")");
}
