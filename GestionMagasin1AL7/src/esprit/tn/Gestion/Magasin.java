package esprit.tn.Gestion;
import esprit.tn.Entite.Produit;
public class Magasin {

    private  int id;
    private String adresse;

    private final int CAPACITE=2;

    private Produit [] tabprod=new Produit[CAPACITE];

    private int comp;

    public Magasin()
    {}

    public Magasin(int id,String ad)
    {
        this.id=id;
        adresse=ad;
    }

    public void ajouter(Produit p)
    {
  if(comp<CAPACITE) {
      tabprod[comp] = p;
      comp++;
      System.out.println("produit ajouté");
  }
  else{
      System.out.println("magasin plein");
  }
    }

    public void afficherLibellePr()
    {
      for (int i=0;i<comp;i++)
          System.out.println("marque :"+tabprod[i].getMarque());
    }
}
