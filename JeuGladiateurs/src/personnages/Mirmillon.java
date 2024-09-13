/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;


public class Mirmillon extends Personnage{

    public Mirmillon(String nom, int valeurMaxAttaque, int valeurDefense, int pointsDeVie, int initiative) {
        super(nom, valeurMaxAttaque, valeurDefense, pointsDeVie, initiative);
    }

    public Mirmillon() {
    }
    
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.print( '\t' + "Classe de combat : Mirmillon");
    }
    @Override 
    public void setNewInitiativeRandom(){
        Random rand = new Random();
        int minIni = 0;
        int maxIni = 30;
        this.setInitiative( rand.nextInt(maxIni - minIni) + minIni );
    }
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        if(personnageCible.getPointsDeVie() == 0){
            System.out.println("Bob le malchanceux décapite Igor dont la tête roule sur le sol !!");
        }
        else {super.frapperPersonnage(personnageCible);}
        
    }
}
