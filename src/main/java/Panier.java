import java.util.ArrayList;

public class Panier {
	private ArrayList<Orange> ListOrange;
	private int maxNumber;

	public Panier(int startPanier, int maxNumber) {
		super();
		ListOrange = new ArrayList<Orange>();
		startPanier = 0;
		this.maxNumber = maxNumber;
	}

	public Panier() {
		super();
	}

//	public Panier(int maxNumber) {
//		
//		this.maxNumber=maxNumber;
//		ListOrange = new ArrayList<Orange>();
//		
//		this.startPanier = 0;
//	}
	public boolean estPlein() {
		return maxNumber == ListOrange.size();

	}

	public boolean estVide() {
		return ListOrange.isEmpty();

	}

	@Override
	public String toString() {
		return "Panier [ListOrange=" + ListOrange + "]";
	}

	public boolean equals() {
		Panier p = new Panier();

		return false;

	}

	public void ajout(Orange o) {
		ListOrange.add(o);
	}

	public void retire(Orange o) {
		ListOrange.remove(o);
	}

	public double getPrix() {
		
	}
}
