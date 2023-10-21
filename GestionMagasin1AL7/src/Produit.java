import java.util.Date;
public class Produit {

    int identifiant;
    String libelle,marque;
    float prix;

    Date date_exp;
    public Produit(int id,String marque,String lib)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
    }
    public Produit(int id,String marque,String lib,Date d)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
        date_exp=d;
    }
    public Produit(){}

    public Produit(int id,String m,String lib,float p)
    {
        this.identifiant=id;
        this.marque=m;
        this.libelle=lib;
        this.prix=p;

    }

    public Produit(int id,String ma)
    {
        this.identifiant=id;
        this.marque=ma;
    }
    public Produit(String lib,int id)
    {
      this.identifiant=id;
      this.libelle=lib;
    }

    public  void afficher()
    {
        System.out.println("id :"+this.identifiant);
        System.out.println("libelle :"+this.libelle);
        System.out.println("marque :"+marque);
        System.out.println("prix :"+prix);
        System.out.println("Date exp :"+date_exp);
    }


    public String toString()
    {
        return "identifiant :"+identifiant+" marque :"+marque+
                " Libelle :"+libelle+" prix :"+prix +" Date exp :"+date_exp;
    }
}
