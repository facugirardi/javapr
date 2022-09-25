package clases;

public class Macro {
   private int peso;
   private int cm;
   private double pm;
   private double cam;
   private double gm;

    public Macro(int peso) {
        this.peso = peso;
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
    
    
}
