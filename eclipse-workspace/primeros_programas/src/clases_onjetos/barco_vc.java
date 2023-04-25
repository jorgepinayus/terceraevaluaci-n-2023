package clases_onjetos;

public class barco_vc extends barco {
	private boolean hasVelasCuadradas;
	public BarcoVelasCuadradas(String nom, int size, int nPal) {
		super(nom, size, nPal);
		this.setHasVelasCuadradas(true);
	}
	public boolean isHasVelasCuadradas() {
		return hasVelasCuadradas;
	}
	public void setHasVelasCuadradas(boolean h) {
		this.hasVelasCuadradas = h;

}
