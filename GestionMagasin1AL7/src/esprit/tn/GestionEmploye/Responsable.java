package esprit.tn.GestionEmploye;

public class Responsable extends Employe{
   private float prime;

  public Responsable(int id ,String n,float pr)
  {
     super(id,n);
      this.prime=pr;
  }
  public Responsable(){

  }
  public Responsable(float prime,int id,String n,
                     String ad,int nb)
  {
      super(id,n,ad,nb);
      this.prime=prime;
  }
  public float getPrime()
  {
      return prime;
  }
  public void setPrime(float p)
  {
      prime=p;
  }

  public String toString()
  {
      return "Responsable :"+super.toString()+
              " Prime :"+prime;
  }

    public float calculSalaire() {
        float Salaire = 0;
        if (this.nbh > 160) {

            int Heure_Supp = this.nbh - 160;
            float Prix_Supp = (float) (Heure_Supp * (10 + (10 * 0.2)));
            Salaire = (160 * 10) + Prix_Supp + prime;

        } else {
            Salaire = (this.nbh * 10) + prime;
        }

        return Salaire;

    }

}
