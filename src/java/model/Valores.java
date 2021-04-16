/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author luanc
 */
public class Valores {
    private String Percurso;
    private String Combustivel;
    private int result = 0;

    public String getPercurso() {
        return Percurso;
    }

    public void setPercurso(String Percurso) {
        this.Percurso = Percurso;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String Combustivel) {
        this.Combustivel = Combustivel;
    }

    public Valores(String Percurso, String Combustivel) {
        this.Percurso = Percurso;
        this.Combustivel = Combustivel;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Integer> UrbanoAlcool(){
    ArrayList<Integer> listar = new ArrayList<Integer>();
    for(int i=5; i<=45; i+=5){
        int LitKm = 7;
        result = i * LitKm;
        listar.add(result);
    }
    return listar;
}
    
    public ArrayList<Integer> MesmoKm(){
        ArrayList<Integer> listar = new ArrayList<Integer>();
        for(int i=5; i<=45; i+=5){
            int LitKm = 9;
            result = i * LitKm;
            listar.add(result);
        }
        return listar;
    }
    
    public ArrayList<Integer> EstradaGasolina(){
        ArrayList<Integer> listar = new ArrayList<Integer>();
        for(int i=5; i<=45; i+=5){
            int LitKm = 12;
            result = i * LitKm;
            listar.add(result);
        }
        return listar;
    }
}
