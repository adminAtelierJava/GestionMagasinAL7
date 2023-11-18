package esprit.tn.GestionEmploye;

public class Employe {
    protected  int id,nbh;
    protected String nom,adresse;

    public Employe(int id,String n)
    {
        this.id=id;
        nom=n;

        System.out.println("Employe deux paramètres");
    }

    public Employe(){

        System.out.println("Employe par defaut");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbh() {
        return nbh;
    }

    public void setNbh(int nbh) {
        this.nbh = nbh;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String toString()
    {
        return "id :"+id+"nom :"+nom+
                "adresse :" +adresse+"nombre heure :"+nbh;
    }
}
