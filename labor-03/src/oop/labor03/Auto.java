package oop.labor03;

public class Auto {
    private String marka;
    private String modell;
    private int ar;

    public Auto(String marka, String modell, int ar){
        this.marka = marka;
        this.modell = modell;
        this.ar = ar;
    }

    public void setAr(int ar){
        this.ar = ar;
    }

    public String getModell() {
        return this.modell;
    }

    public void kiirMinden(){
        System.out.println(this.marka + " - " + this.modell + " - " + this.ar + " EUR");
    }
}
