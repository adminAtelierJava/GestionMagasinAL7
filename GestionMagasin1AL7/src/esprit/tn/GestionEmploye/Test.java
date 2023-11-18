package esprit.tn.GestionEmploye;

public class Test {

    public static void main(String[] args) {
        Employe em1=new Employe(1,"nom1");
       Caissier cais1=new Caissier(145,2,"nom2");
        Employe em2=new Employe();
        Caissier cais2=new Caissier();

        System.out.println("id :"+cais1.getId());
        System.out.println("nom :"+cais1.getNom());
        System.out.println("num Cai :"+cais1.getNumCaiss());
        System.out.println("to String");
        System.out.println(cais1);
        System.out.println(cais2);
        System.out.println("test ");
        cais1.testtoStrin();
    }
}
