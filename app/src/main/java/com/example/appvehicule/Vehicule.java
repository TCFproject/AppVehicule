package com.example.appvehicule;

public class Vehicule {
    private String nom;
    private String Immatri;
    private String statu;
    private int id;

    public Vehicule(String nom, String immatri, String statut, int id) {
        this.nom = nom;
        this.Immatri = immatri;
        this.statu = statut;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getImmatri() {
        return Immatri;
    }

    public String getStatu() {
        return statu;
    }

    public int getId() {
        return id;
    }
}
