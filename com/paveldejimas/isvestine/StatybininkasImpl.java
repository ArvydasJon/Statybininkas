package com.paveldejimas.isvestine;

public class StatybininkasImpl implements Statybininkas {
    double stazas;
    String issilavinimas;
    String specializacija;
    double atlyginimas;

    @Override
    public double getStazas() {
        return stazas;
    }

    @Override
    public String getIssilavinimas() {
        return issilavinimas;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public double getAtlyginimas() {
        return atlyginimas;
    }

    @Override
    public void setStazas(double stazas) {
        this.stazas = stazas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }
    public StatybininkasImpl(){}

    public StatybininkasImpl(double stazas,String issilavinimas,String specializacija,double atlyginimas){

        this.stazas=stazas;
        this.issilavinimas=issilavinimas;
        this.specializacija=specializacija;
        this.atlyginimas=atlyginimas;
    }

    @Override
    public String toString() {
        return "StatybininkasImpl{" +
                "stazas=" + stazas +
                ", issilavinimas='" + issilavinimas + '\'' +
                ", specializacija='" + specializacija + '\'' +
                ", atlyginimas=" + atlyginimas +
                '}';
    }
}
