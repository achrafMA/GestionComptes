package com.comptes.Management;

import java.util.Date;

public class Program {
    public static void afficherDetailCompte(Compte compte){

    }
    public static void main(String[] args) {
        Client client=new Client(11,"ali","Baba");
        Compte compte=new Compte(11,"B123456",client);
        client.setCompte(compte);
        Operation op1=new Operation(new Date(2020,3,5),"vers",4000,compte);
        compte.addOperation(op1);
        Operation op2=new Operation(new Date(2020,3,7),"vers",5000,compte);
        compte.addOperation(op2);
        compte.addOperation(new Operation(new Date(2020,3,25),"retr",2000,compte));
        compte.addOperation(new Operation(new Date(2020,3,30),"retr",3000,compte));
        compte.addOperation(new Operation(new Date(2020,04,05),"vers",6000,compte));
        afficherDetailCompte(compte);
        System.out.println("Client: "+client.getNom()+" "+client.getPrenom());
        System.out.println("Date Type Montant");
        for (Operation op: compte.getOperations()) {
            System.out.println(op.getDate() + " " + op.getType() + " " + op.getMontant());
        }
        System.out.println("Solde: "+compte.getSolde());

    }
}
