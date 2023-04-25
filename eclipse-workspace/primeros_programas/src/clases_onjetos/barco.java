package clases_onjetos;

public class barco {
	//Atributos
		private String nom;
		private int size;
		private int nPal;
		//Constructor
		public Barco(String nom, int size, int nPal) {
			super();
			this.nom = nom;
			this.size = size;
			this.nPal = nPal;
		}
		//Ejemplo de polimorfismo, sobrecargando el constructor
		public Barco(String nom) {
			super();
			this.nom = nom;
		}
		//Métodos setter y getter
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getnPal() {
			return nPal;
		}
		public void setnPal(int nPal) {
			this.nPal = nPal;
		}
		//Pasa los contenidos a un string
		@Override
		public String toString() {
			return "Barco [Nombre=" + nom + ", longitud=" + size + ", numero de palos=" + nPal + "]";

}
