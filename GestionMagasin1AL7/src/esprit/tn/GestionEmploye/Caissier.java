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
}
