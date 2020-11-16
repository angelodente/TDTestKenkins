
public class Orange {

	private double prix;
	private String origine;
	private String message = "Prix incorrecte";

	public Orange(double prix, String origine) {
		super();
		if (prix > 0) {
			this.prix = prix;
			this.origine = origine;
		} else {
			System.out.println(message);
		}
	}

	public double getPrix() {
		return prix;
	}

	public String getOrigine() {
		return origine;
	}

}
