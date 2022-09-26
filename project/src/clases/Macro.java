package clases;

import java.util.HashSet;

public class Macro {
   private int peso;
   private int cm;
   private double pm;
   private double cam;
   private double gm;
   private int cal;
   private int prot;
   private int carb;
   private int grasas;
   private boolean noEnc;

    public Macro(int peso) {
        this.peso = peso;
    }

    public Macro() {
    }

    public boolean isNoEnc() {
        return noEnc;
    }

    public void setNoEnc(boolean noEnc) {
        this.noEnc = noEnc;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getProt() {
        return prot;
    }

    public void setProt(int prot) {
        this.prot = prot;
    }

    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public int getGrasas() {
        return grasas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }
    
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }

    public double getPm() {
        return pm;
    }

    public void setPm(double pm) {
        this.pm = pm;
    }

    public double getCam() {
        return cam;
    }

    public void setCam(double cam) {
        this.cam = cam;
    }

    public double getGm() {
        return gm;
    }

    public void setGm(double gm) {
        this.gm = gm;
    }
   
   public void calc(){
       int cm2 = peso * 24;
       double pm2 = peso * 0.3;
       double cam2 = peso * 0.5;
       double gm2 = peso * 0.25;
       this.setCm(cm2);
       this.setCam(cam2);
       this.setPm(pm2);
       this.setGm(gm2);
   }
    
   public void seguimiento(String alimento){
        int calorias;
        int proteinas;
        int carb;
        int grasas;
       
        if("milanesa de pollo".equals(alimento)){
            noEnc = false;
            calorias = 284 + this.getCal();
            proteinas = 20 + this.getProt();
            carb = 25 + this.getCarb();
            grasas = 12 + this.getGrasas();
                    
            this.setCal(calorias);
            this.setCarb(carb);
            this.setProt(proteinas);
            this.setGrasas(grasas);
        }
        else if("hamburguesa".equals(alimento)){
            calorias = 280 + this.getCal();
            proteinas = 15 + this.getProt();
            carb = 27 + this.getCarb();
            grasas = 11 + this.getGrasas();
            noEnc = false;
            this.setCal(calorias);
            this.setCarb(carb);
            this.setProt(proteinas);
            this.setGrasas(grasas);
        }
        else if("banana".equals(alimento)){
            calorias = 100 + this.getCal();
            proteinas = 2 + this.getProt();
            carb = 25 + this.getCarb();
            grasas = 1 + this.getGrasas();
            noEnc = false;
            this.setCal(calorias);
            this.setCarb(carb);
            this.setProt(proteinas);
            this.setGrasas(grasas);
        }
        else if("manzana".equals(alimento)){
            calorias = 72 + this.getCal();
            proteinas = 1 + this.getProt();
            carb = 20 + this.getCarb();
            grasas = 0 + this.getGrasas();
            noEnc = false;
            this.setCal(calorias);
            this.setCarb(carb);
            this.setProt(proteinas);
            this.setGrasas(grasas);
        }
        else if("fideos".equals(alimento)){
            calorias = 219 + this.getCal();
            proteinas = 7 + this.getProt();
            carb = 40 + this.getCarb();
            grasas = 4 + this.getGrasas();
            noEnc = false;
            this.setCal(calorias);
            this.setCarb(carb);
            this.setProt(proteinas);
            this.setGrasas(grasas);
        }
        else if("pure de papa".equals(alimento)){
            calorias = 210 + this.getCal();
            proteinas = 4 + this.getProt();
            carb = 33 + this.getCarb();
            grasas = 8 + this.getGrasas();
            noEnc = false;
            this.setCal(calorias);
            this.setCarb(carb);
            this.setProt(proteinas);
            this.setGrasas(grasas);
        }
        else{
            noEnc = true;
        }
    }

   
   }
   
   
    

