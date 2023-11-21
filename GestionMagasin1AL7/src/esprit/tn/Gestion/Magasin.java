package esprit.tn.Gestion;
import esprit.tn.Entite.Produit;
import esprit.tn.GestionEmploye.Caissier;
import esprit.tn.GestionEmploye.Employe;
import esprit.tn.GestionEmploye.Responsable;
import esprit.tn.GestionEmploye.Vendeur;

public class Magasin {

    private  int id;
    private String adresse;

    private final int CAPACITE=50;

    private Produit [] tabprod=new Produit[CAPACITE];

    private  int comp;

    private final int CAPACITE_EMP=20;
    private Employe [] tabEmp=new Employe[CAPACITE_EMP];

    private int compEmp;
    private static int totalProduit;
    public Magasin()
    {}

    public Magasin(int id,String ad)
    {
        this.id=id;
        adresse=ad;
    }


    public void ajouter(Employe em)
    {
       if(compEmp<CAPACITE_EMP)
       {
           tabEmp[compEmp]=em;
           compEmp++;
       }
       else {
           System.out.println("Magasin plein");
       }

    }
    public void ajouter(Produit p)
    {
  if(comp<CAPACITE) {
      if(!chercher(p)){
      tabprod[comp] = p;
      comp++;
      System.out.println("produit ajouté");

      totalProduit++;
  }else {
          System.out.println("le produit existe déjà");
  }}
  else{
      System.out.println("magasin plein");
  }
    }

    public void afficherEmploye()
    {
     for (int i=0;i<compEmp;i++)
     {
         System.out.println(tabEmp[i].toString());
     }
    }
    public void afficheSalaire()
    {
        for (int i=0;i<compEmp;i++)
        {
            System.out.println(tabEmp[i].calculSalaire());
        }
    }

    public static int getTotalProduit()
    {

        return totalProduit;
    }
    public void afficherLibellePr()
    {
      for (int i=0;i<comp;i++)
          System.out.println("marque :"+tabprod[i].getMarque());
    }


    public boolean chercher(Produit p)
    {
        for (int i=0;i<comp;i++)
        {
            if(tabprod[i].comparer(p))
                return true;
        }
        return false;
    }

    public int chercherP(Produit p)
    {
        int indice=-1;
        for (int i=0;i<comp;i++)
        {
         if(Produit.comparer(p,tabprod[i]))

             return i;
        }
        return indice;
    }

    public boolean supprimer(Produit p)
    {
        boolean test=false;
        int indice=chercherP(p);

        if (indice==-1)
            test=false;
        else {

            for (int i=indice;i<comp-1;i++)
            {
                tabprod[i]=tabprod[i+1];
                tabprod[i]=null;
            }
            comp--;
            totalProduit--;
            test=true;
        }
        return test;
    }

    public Magasin plusProduit(Magasin m)
    {
        if (this.comp>m.comp)
            return this;

       else if (this.comp<m.comp)
            return m;
       return null;
    }

    public String toString()
    {

        String str="L'ensemble des produits :\n";

        for (int i=0;i<comp;i++)
            str+=tabprod[i]+"\n";

        return "id ="+id+"adresse :"+adresse+str;
    }

    public static Magasin plusProduit(Magasin m,Magasin m1)
    {
        if (m1.comp>m.comp)
            return m1;

        else if (m1.comp<m.comp)
            return m;
        return null;
    }

    public void afficherTauxDeVente()
    {
        for (int i=0;i<compEmp;i++)
        {if(tabEmp[i] instanceof Vendeur) {
            Vendeur vend = (Vendeur) tabEmp[i];
            System.out.println("taux de vente :" + vend.getTaux_Vente());
        }else{
            System.out.println("ce n'est pas un vendeur");
        }
        }
    }
    public void nbEmpParType()
    {

        int nbC=0,nbV=0,nbR=0;
        for (int i=0;i<compEmp;i++)
        {
            if(tabEmp[i] instanceof Caissier)
                nbC++;
            if(tabEmp[i] instanceof Vendeur)
                nbV++;
            if(tabEmp[i] instanceof Responsable)
                nbR++;
        }
        System.out.println("le nombre de caissier :"+nbC);
        System.out.println("Le nombre de Vendeur :"+nbV);
        System.out.println("Le nombre de Responsable :"+nbR);
    }
}
