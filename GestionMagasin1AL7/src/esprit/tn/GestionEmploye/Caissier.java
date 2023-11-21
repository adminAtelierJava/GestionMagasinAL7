package esprit.tn.GestionEmploye;

public class Caissier extends Employe{
    private int numCaiss;
    public Caissier()
    {

    }


   public Caissier(int num,int id,String n)
   {//super();
       super(id,n);
       numCaiss=num;
   }

    public int getNumCaiss() {
        return numCaiss;
    }

    public void setNumCaiss(int numCaiss) {
        this.numCaiss = numCaiss;
    }

    public String toString()
    {
        return "Caissier "+super.toString()
                +"num Caisse :"+numCaiss;
    }

    public void testtoStrin()
    {

        System.out.println("super :"+super.toString());
        System.out.println("this :"+this.toString());
    }
    public float calculSalaire()
    {
        float Salaire=0;
        if (this.nbh > 180){

            int Heure_Supp = nbh - 180 ;
            float Prix_Supp= (float) (Heure_Supp *(5+(5*0.15)));
            Salaire= (180 * 5 )+Prix_Supp ;

        } else
            Salaire= (this.nbh * 5 );
        return Salaire;
    }

}
