package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PlanAlimentacion {
    private int peso;
    private int altura;
    private String objetivo;
    private boolean text1;
    private boolean text2;
    
    
    public PlanAlimentacion(int peso, int altura, String objetivo) {
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public boolean isText1() {
        return text1;
    }

    public void setText1(boolean text1) {
        this.text1 = text1;
    }

    public boolean isText2() {
        return text2;
    }

    public void setText2(boolean text2) {
        this.text2 = text2;
    }

    
    public void planAl(){
        String contents = "";
        String home = System.getProperty("user.home");
        File file = new File(home+"/Downloads/"+"plan_alimentacion.txt");

        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            if((peso >= 45 && peso <= 60)&&(altura >= 150 && altura <= 180)){
                if(null != objetivo)switch (objetivo) {
                    case "Mantener":
                        contents = "Balance entre proteinas, fibras, vitaminas, minerales e hidratos de carbono." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: cafe - té - cafe con leche descremada - yogourt - mate - mate cocido - frutas."
                                + System.getProperty("line.separator") + "- Comidas y cenas: Huevo duro - carne de cerdo, vaca y pollo - vegetales - frutas.";
                        break;
                    case "Aumentar":
                        contents = "Dieta alta hidratos de carbono y proteinas." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: cafe - cafe con leche - leche."
                                + System.getProperty("line.separator") + "- Comidas y cenas: carne de cerdo, vaca y pollo - verdura (batata y papa).";
                        break;
                    case "Adelgazar":
                        contents = "No es recomendable bajar de peso";
                        break;
                    default:
                        break;
                }
                
                    this.text1 = true;

            }
            else if((peso >= 60 && peso <= 75)&&(altura >= 150 && altura <= 180)){
                                System.out.println(objetivo);

                if(null != objetivo)switch (objetivo) {
                    case "Mantener":
                        contents = "Balance entre proteinas, Fibras, vitaminas, minerales e hidratos de carbono." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: cafe - té - cafe con leche descremada - yogourt - mate - mate cocido - frutas."
                                + System.getProperty("line.separator") + "- Comidas y cenas: Huevo duro - carne de cerdo, vaca y pollo - vegetales - frutas";
                        break;
                    case "Aumentar":
                        contents = "Dieta alta hidratos de carbono y proteinas." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: cafe - cafe con leche - leche."
                                + System.getProperty("line.separator") + "- Comidas y cenas:  carne de cerdo, vaca y pollo - verdura(batata y papa).";
                        break;
                    case "Adelgazar":
                        System.out.println("2222");
                        contents = "Dieta alta en comidas naturales bajas en hidratos de carbono." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: frutas - té."
                                + System.getProperty("line.separator") + "- Comidas y cenas: verduras, carnes.";
                        break;
                    default:
                        break;
                }
                    this.text1 = true;

                
            }
            else if((peso >= 70 && peso <= 100)&&(altura >= 150 && altura <= 180)){
                if(null != objetivo)switch (objetivo) {
                    case "Mantener":
                        contents = "Balance entre proteinas, Fibras, vitaminas, minerales e hidratos de carbono." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: cafe - té - cafe con leche descremada - yogourt - mate - mate cocido - frutas."
                                + System.getProperty("line.separator") + "- Comidas y cenas: Huevo duro - carne de cerdo, vaca y pollo - vegetales - frutas";
                        break;
                    case "Aumentar":
                        contents = "Dieta alta hidratos de carbono y proteinas." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: cafe - cafe con leche - leche."
                                + System.getProperty("line.separator") + "- Comidas y cenas:  carne de cerdo, vaca y pollo - verdura(batata y papa).";
                        break;
                    case "Adelgazar":
                        contents = "Dieta alta en comidas naturales bajas en hidratos de carbono." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: frutas - té."
                                + System.getProperty("line.separator") + "- Comidas y cenas: verduras, carnes.";
                        break;
                    default:
                        break;
                }
                    this.text1 = true;
                
            }
            else if((peso >= 100 && peso <= 140)&&(altura >= 150 && altura <= 180)){
                if(null != objetivo)switch (objetivo) {
                    case "Adelgazar":
                        contents = "Dieta alta en comidas naturales bajas en hidratos de carbono." +
                                System.getProperty("line.separator") + "- Desayunos y meriendas: frutas - té."
                                + System.getProperty("line.separator") + "- Comidas y cenas: verduras, carnes.";
                        break;
                    case "Aumentar":
                        contents = "No es recomendable aumentar de peso";
                        break;
                    case "Mantener":
                        contents = "No es recomendable mantener este peso";
                        break;
                    default:
                        break;
                }
                this.text1 = true;

            }
            else{
                this.text2 = true;
            }

            
        writer.write(contents);
        } catch (IOException e) {
            System.out.println(e);
        }
    
    
    
    }
}
