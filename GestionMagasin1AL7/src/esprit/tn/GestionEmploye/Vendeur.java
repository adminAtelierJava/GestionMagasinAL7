package esprit.tn.GestionEmploye;

public class Vendeur extends Employe{
    private float taux_Vente;

    public Vendeur(int id,String n,String ad,int nb,float taux)
    {
        super(id,n,ad,nb);
        taux_Vente=taux;
    }

   public String toString()
   {
       return "Vendeur :"+super.toString()+
               "taux de Vente :"+taux_Vente;
   }

    public float calculSalaire()
    {
        return (450*taux_Vente)/100;
    }

    public float getTaux_Vente() {
        return taux_Vente;
    }

    public void setTaux_Vente(float taux_Vente) {
        this.taux_Vente = taux_Vente;
    }
}
