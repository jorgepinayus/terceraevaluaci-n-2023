package clases_onjetos;

public class maneja_puntos {
	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		Punto3 punto1;
		punto1=new Punto3(3,4,0);//Inicializo el punto
		System.out.print("Este punto dista del origen: ");
		System.out.print(punto1.DistanciaOrigen());
		Punto3 p2=new Punto3(6,2,7);
		Vector3 vec1=punto1.puntoVect(p2);
		System.out.print("\nVector1: "+vec1.toStr());
		System.out.print("\nModulo: ");
		System.out.print(vec1.Module());
		System.out.print("\nv1*3: ");
		System.out.print(vec1.prodInt(3).toStr() +"\n");
		Vector3 vec2 = new Vector3(0,3,5);
		Vector3 vec3 = new Vector3(7,2,3);
		Vector3 pv = vec2.prodVec(vec3);
		System.out.print(vec2.toStr()+"x"+vec3.toStr()+" = "+pv.toStr()+"\n");
		System.out.print(vec1.toStr()+"·"+pv.toStr()+" = "+vec1.prodEsc(pv)+"\n");
		System.out.print(vec1.toStr()+"·("+vec2.toStr()+"x"+vec3.toStr()+") = "+vec1.prodMix(vec2,vec3)+"\n");
		

}
