package esprit.tn.GestionEmploye;

import esprit.tn.Gestion.Magasin;

public class Test {

    public static void main(String[] args) {
        //Employe em1=new Employe(1,"nom1");
       Caissier cais1=new Caissier(145,2,"nom2");
        //Employe em2=new Employe();
        Caissier cais2=new Caissier();

        System.out.println("id :"+cais1.getId());
        System.out.println("nom :"+cais1.getNom());
        System.out.println("num Cai :"+cais1.getNumCaiss());
        System.out.println("to String");
        System.out.println(cais1);
        System.out.println(cais2);
        System.out.println("test ");
        cais1.testtoStrin();
        System.out.println("test responsable");

        Responsable res=new Responsable();
        Responsable res1=new Responsable(1,"nom1",200);
        System.out.println("id :"+res1.getId());
        System.out.println("nom :"+res1.getNom());
        System.out.println("prime :"+res1.getPrime());
        Vendeur vend1=new Vendeur(1,"nomV","tunis ",15,200);

        Magasin m1=new Magasin();
cais2.setNbh(20);
        m1.ajouter(res1);
        m1.ajouter(cais2);
        m1.ajouter(vend1);
        System.out.println("Affichage des employes");
        m1.afficherEmploye();

        System.out.println("Affiche Salaires");
        m1.afficheSalaire();

Employe em1=new Vendeur(1,"nomV","tunis ",15,200);
if(em1 instanceof Vendeur) {
    Vendeur vend = (Vendeur) em1;
    System.out.println("taux de vente :" + vend.getTaux_Vente());
}
else {
    System.out.println("ce n'est pas un vendeur");
}
if(em1 instanceof Caissier) {
    Caissier c1 = (Caissier) em1;
    System.out.println("num Caiss :" + c1.getNumCaiss());

    System.out.println("num caisse :"+((Caissier)em1).getNumCaiss());
}else {
    System.out.println("ce n'est pas un caissier");
}

m1.afficherTauxDeVente();

m1.nbEmpParType();
    }
}
