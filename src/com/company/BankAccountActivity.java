package com.company;

import exe1.BankAccount;
import exe1.Client;
import exe1.CompteCourant;
import exe1.CompteEpargne;

public class BankAccountActivity {

    public static void main(String[] args) {

        Client cl1=new Client("Buffet","Raphael",1997);
        Client cl2=new Client("Buffet","Loan",1994);
        Client cl3=new Client("Buffet","Raymond",1962);

        CompteCourant cc1 =new CompteCourant(cl1,10000);
        CompteCourant cc2=new CompteCourant(cl3,10000);
        CompteEpargne ce1=new CompteEpargne(cl2,10000);
        CompteEpargne ce2=new CompteEpargne(cl3,10000);



        //transfert(cc1,cc2,1000);
        //transfert(cc1,ce1,1000);
        //transfert(ce1,ce2,1000);

    }


    private static void transfert(BankAccount compteDonneur, BankAccount compteReceveur, int ammount){
        int taxe;
        if(compteDonneur.getClass()!=compteReceveur.getClass()){
            taxe=ammount*compteDonneur.getTaxeTypeDifferents()/100;
        }
        else{
            taxe=ammount*compteDonneur.getTaxeTypeSemblable()/100;
        }
        if(enoughMonney(compteDonneur.getAmount(),ammount,taxe)){
            compteDonneur.setAmount(compteDonneur.getAmount()-ammount-taxe);
            compteReceveur.setAmount(compteReceveur.getAmount()+ammount);
        }
        else{
            System.out.println("solde insuffisant transaction annuler");
        }
        affiche(compteDonneur,compteReceveur);

    }
    private static void transfert(CompteEpargne compteDonneur,CompteEpargne compteReceveur,int ammount){
        if(enoughMonney(compteDonneur.getAmount(),ammount,compteDonneur.getTaxeTypeSemblable())) {
            compteDonneur.setAmount(compteDonneur.getAmount() - ammount - compteDonneur.getTaxeTypeSemblable());
            compteReceveur.setAmount(compteReceveur.getAmount() + ammount);
        }
        else{
            System.out.println("solde insuffisant transaction annuler");
        }
        affiche(compteDonneur,compteReceveur);
    }
    private static boolean enoughMonney(int balance,int ammount,int taxe){
        if(balance-taxe<ammount) return false;
        return true;
    }
    private static void affiche (BankAccount compteDonneur, BankAccount compteReceveur){
        System.out.println("solde compte donneur : "+ compteDonneur.getAmount());
        System.out.println("solde compte receveur : "+ compteReceveur.getAmount());
    }

}
