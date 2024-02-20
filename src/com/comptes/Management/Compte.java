package com.comptes.Management;

import java.util.ArrayList;
import java.util.List;

public class Compte {
    private int id;
    private String numero;
    private double solde;
    //relation  qui aun seul reference
    private Client client;
    //la relation qui a plusieurs references:collections

    private List<Operation> operations=new ArrayList<Operation>();

    public Compte(int id, String numero, Client client) {
        this.id = id;
        this.numero = numero;
        this.solde = 0;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    public void addOperation(Operation operation){
        operation.add(operation);
        if (operation.getType().equals("vers"))
            solde+=operation.getMontant();
        if (operation.getType().equals("retr"))
            solde-=operation.getMontant();

    }
}
