package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.rétiaire;


public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Mirmillon Bob = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
    rétiaire Igor = new rétiaire("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    do{
    tour.afficheTour();
    for (int i=0; i<100; i++){
        if(i == Bob.getInitiative()){
           if(Bob.getPointsDeVie() > 0){ Bob.frapperPersonnage(Igor);}
        } 
        if(i == Igor.getInitiative()) {
            if(Igor.getPointsDeVie() > 0){ Igor.frapperPersonnage(Bob);}
        }
    }
    affichage.afficherSeparateurInfosPerso();
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    Bob.setNewInitiativeRandom();
    Igor.setNewInitiativeRandom();
    tour.augmenteTour();
    affichage.afficherSeparateurDeTour();
    } while(Bob.getPointsDeVie() > 0 && Igor.getPointsDeVie() > 0);
    affichage.afficheVictoire(Bob, Igor);
    // </editor-fold>
    }

}
