package clases_onjetos;

public class test_barco {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco b1 = new Barco("Caja",2,0);
		Barco b2 = new Barco("jose",15,284);
		BarcoVelasCuadradas pirata = new BarcoVelasCuadradas("Con diez cañones por banda\nviento en popa a toda vela,\nno surca el mar sino vuela\nun velero bergatin.\n\nBajel pirata al que llaman\npor su bravura el temido,\nen todo mar conocido\ndel uno al otro confin.",24,5);
		System.out.print(pirata.getNom());
}
