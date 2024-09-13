/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;


public class rétiaire extends Personnage{
    private boolean filet;

    public void setFilet(boolean filet) {
        this.filet = filet;
    }

    public boolean isFilet() {
        return filet;
    }

    public rétiaire(String nom, int valeurMaxAttaque, int valeurDefense, int pointsDeVie, int initiative) {
        super(nom, valeurMaxAttaque, valeurDefense, pointsDeVie, initiative);
        filet = true;
        
    }

    public rétiaire() {
    }
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.print( '\t' + "Classe de combat : Rétiaire");
    }
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if(filet == true){
            System.out.print('\n');
            System.out.println("Igor l'empaleur lance son filet");
            Random rand = new Random();
            int minVal = 0;
            int maxVal = 10;
            int touche = rand.nextInt(maxVal - minVal)+ minVal;
            if(touche == 10){
                System.out.println('\n' + "Son filet attrape Bob le malchanceux et il l'empale sauvagement avec sa lance");
                personnageCible.setPointsDeVie(minVal);
            }
            else{
                System.out.println("Le filet n'a pas atteint sa cible" + '\n');
                filet = false;
            }
        }
        else{
            System.out.print('\n');
            System.out.println("Igor ramasse son filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);
            filet = true;
        }
    }
}
