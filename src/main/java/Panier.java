import java.util.ArrayList;

public class Panier {
	private int nbreOrangeMax;
	private ArrayList<Orange> listeOrange;

	public Panier(ArrayList<Orange> listeOrange, int max) {
		super();
		this.listeOrange = listeOrange;
		this.nbreOrangeMax = max;
	}

	public Panier() {
		super();
		this.listeOrange = new ArrayList<Orange>();
	}

	public int getNbreOrangeMax() {
		return nbreOrangeMax;
	}

	public void setNbreOrangeMax(int nbreOrangeMax) {
		this.nbreOrangeMax = nbreOrangeMax;
	}

	public ArrayList<Orange> getListeOrange() {
		return listeOrange;
	}

	public void setListeOrange(ArrayList<Orange> listeOrange) {
		this.listeOrange = listeOrange;
	}

	public boolean estVide() {
		if (listeOrange.isEmpty())
			return true;

		return false;
	}

	public boolean estPlein() {
		if (listeOrange.size() == 50)
			return true;

		return false;
	}

	public void ajoute(Orange o) {
		this.listeOrange.add(o);
	}

	public void retire() {
		this.listeOrange.remove(listeOrange.size());
	}

	public double getPrix() {
		double prixTotal = 0;
		for (Orange o : listeOrange) {
			prixTotal += o.getPrix();
		}
		return prixTotal;
	}

	public void boycottePanier(String origine) {
		for (int i = 0; i < listeOrange.size(); i++) {
			if (this.listeOrange.get(i).getOrigine().equals(origine)) {
				this.listeOrange.remove(i);
			}
		}
	}

	@Override
	public String toString() {
		String chaine = "";
		chaine = "Liste des oranges : \n";
		for (Orange o : listeOrange) {
			chaine += o.toString();
		}
		return chaine;
	}

	public boolean equals(Panier panier) {

		boolean flag;
		for (Orange orange : this.listeOrange) {
			flag = false;
			for (Orange o : panier.getListeOrange()) {
				if (orange.equals(o)) {
					flag = true;
				}
			}
			if (!flag)
				return false;
		}

		return true;
	}

}

//import java.util.ArrayList;
//
//public class Panier {
//	private ArrayList<Orange> ListOrange;
//	private int maxNumber;
//
//	public Panier(int startPanier, int maxNumber) {
//		super();
//		ListOrange = new ArrayList<Orange>();
//		startPanier = 0;
//		this.maxNumber = maxNumber;
//	}
//
//	public Panier() {
//		super();
//	}
//
////	public Panier(int maxNumber) {
////		
////		this.maxNumber=maxNumber;
////		ListOrange = new ArrayList<Orange>();
////		
////		this.startPanier = 0;
////	}
//	public boolean estPlein() {
//		return maxNumber == ListOrange.size();
//
//	}
//
//	public boolean estVide() {
//		return ListOrange.isEmpty();
//
//	}
//
//	@Override
//	public String toString() {
//		return "Panier [ListOrange=" + ListOrange + "]";
//	}
//
//	public boolean equals() {
//		Panier p = new Panier();
//
//		return false;
//
//	}
//
//	public void ajout(Orange o) {
//		if (ListOrange.size() < maxNumber) {
//			ListOrange.add(o);
//		}
//		
//	}
//
//	public void retire(Orange o) {
//		ListOrange.remove(o);
//	}
//
//	public double getPrix() {
//		
//	}
//	public void boycotteOrigine() {
//		
//	}
//}
