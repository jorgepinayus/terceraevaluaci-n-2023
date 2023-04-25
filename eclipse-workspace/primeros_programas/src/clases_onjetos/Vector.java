package clases_onjetos;

public class Vector {
	int cX;
	int cY;
	int cZ;
	
	public Vector3(int ncX, int ncY, int ncZ){
		cX=ncX;
		cY=ncY;
		cZ=ncZ;
	}
	int getCX() {
		return cX;
	}
	int getCY() {
		return cY;
	}
	int getCZ() {
		return cZ;
	}
	double Module(){
		double r=Math.sqrt(cX*cX+cY*cY+cZ*cZ);
		return r;
	}
	void setCX(int nX) {
		cX=nX;
	}
	void setCY(int nY) {
		cY=nY;
	}
	void setCZ(int nZ) {
		cZ=nZ;
	}
	Vector3 prodInt(int k) {
		Vector3 vr=new Vector3(cX*k,cY*k,cZ*k);
		return vr;
	}
	int prodEsc(Vector3 v1) {
		int r=cX*v1.cX+cY*v1.cY+cZ*v1.cZ;
		return r;
	}
	Vector3 prodVec(Vector3 v1) {
		Vector3 vr=new Vector3((cY*v1.cZ - cZ*v1.cY),(cZ*v1.cX - cX*v1.cZ),(cX*v1.cY - cY*v1.cX));
		return vr;
	}
	int prodMix(Vector3 v1, Vector3 v2) {
		return prodEsc(v1.prodVec(v2));
	}
	String toStr() {
		return("("+cX+", "+cY+", "+cZ+")");
}
