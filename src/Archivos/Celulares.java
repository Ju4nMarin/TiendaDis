
package Archivos;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN MARIN
 */
public class Celulares extends Dispositivos{
 int MegaPXFrontal;
 int MegaPXTrasera;
 String Jack;
 String Huella;
 String RecFacial;

    public Celulares(int MegaPXFrontal, int MegaPXTrasera, String Jack, String Huella, String RecFacial, String Marca, float Ram, float Almacenamiento, String CPU, String GPU, float PulgadasPantallas, float Precio, String ID, String Bluetooth) {
        super(Marca, Ram, Almacenamiento, CPU, GPU, PulgadasPantallas, Precio, ID, Bluetooth);
        this.MegaPXFrontal = MegaPXFrontal;
        this.MegaPXTrasera = MegaPXTrasera;
        this.Jack = Jack;
        this.Huella = Huella;
        this.RecFacial = RecFacial;
    }

    public void setMegaPXFrontal(int MegaPXFrontal) {
        this.MegaPXFrontal = MegaPXFrontal;
    }

    public void setMegaPXTrasera(int MegaPXTrasera) {
        this.MegaPXTrasera = MegaPXTrasera;
    }

    public void setJack(String Jack) {
        this.Jack = Jack;
    }

    public void setHuella(String Huella) {
        this.Huella = Huella;
    }

    public void setRecFacial(String RecFacial) {
        this.RecFacial = RecFacial;
    }

    public int getMegaPXFrontal() {
        return MegaPXFrontal;
    }

    public int getMegaPXTrasera() {
        return MegaPXTrasera;
    }

    public String getJack() {
        return Jack;
    }

    public String getHuella() {
        return Huella;
    }

    public String getRecFacial() {
        return RecFacial;
    }
         
     public void getSeeInfoAvion(){
        String info=this.getInfo();        
        info+="MegaPixelesFrontal: "+MegaPXFrontal+"\n";
        info+="MegaPrixelesTrasera: "+MegaPXTrasera+"\n";
        info+="Jack Audiculares: "+Jack+"\n";
        info+="Huella: "+Huella+"\n";
        info+="Reconociemiento Facial: "+RecFacial+"\n";
        JOptionPane.showMessageDialog(null, info);
    }
    
    public String getInfoAvion(){
       String info=this.getInfo();        
        info+="MegaPixelesFrontal: "+MegaPXFrontal+"\n";
        info+="MegaPrixelesTrasera: "+MegaPXTrasera+"\n";
        info+="Jack Audiculares: "+Jack+"\n";
        info+="Huella: "+Huella+"\n";
        info+="Reconociemiento Facial: "+RecFacial+"\n";
        JOptionPane.showMessageDialog(null, info);
        return info;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
