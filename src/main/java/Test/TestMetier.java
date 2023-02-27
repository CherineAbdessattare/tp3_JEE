package Test;

import java.util.List;
import Metier.MetierImpl;
import Metier.Produit;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Produit> prods = metier.getProduitsParMotCle("DELL");
		for (Produit p : prods)
			System.out.println(p.getNomProduit());
		}
	}