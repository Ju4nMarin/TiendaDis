
package Archivos;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN MARIN
 */
public class Dispositivos {
   protected String Marca;
   protected float Ram;
   protected float Almacenamiento;
   protected String CPU;
   protected String GPU;
   protected float PulgadasPantallas;
   protected float Precio;
   protected String ID;
   protected String Bluetooth;


    public Dispositivos(String Marca, float Ram, float Almacenamiento, String CPU, String GPU, float PulgadasPantallas, float Precio, String ID, String Bluetooth) {
        this.Marca = Marca;
        this.Ram = Ram;
        this.Almacenamiento = Almacenamiento;
        this.CPU = CPU;
        this.GPU = GPU;
        this.PulgadasPantallas = PulgadasPantallas;
        this.Precio = Precio;
        this.ID = ID;
        this.Bluetooth = Bluetooth;
 
    }

    

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setRam(float Ram) {
        this.Ram = Ram;
    }

    public void setAlmacenamiento(float Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setPulgadasPantallas(float PulgadasPantallas) {
        this.PulgadasPantallas = PulgadasPantallas;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setBluetooth(String Bluetooth) {
        this.Bluetooth = Bluetooth;
    }



    public String getMarca() {
        return Marca;
    }

    public float getRam() {
        return Ram;
    }

    public float getAlmacenamiento() {
        return Almacenamiento;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public float getPulgadasPantallas() {
        return PulgadasPantallas;
    }

    public float getPrecio() {
        return Precio;
    }

    public String getID() {
        return ID;
    }

    public String getBluetooth() {
        return Bluetooth;
    }


 public void getSeeInfo(){
        String info="La información del vehículo es: \n";
        info+="ID: "+ID+"\n";
        info+="Marca: "+Marca+" \n";
        info+="Precio: "+Precio+"\n";
        info+="Ram: "+Ram+"\n";
        info+="Almacenamiento: "+Almacenamiento+" Km\n";
        info+="GPU: "+GPU+"\n";
        info+="CPU: "+CPU+"\n";
        info+="PulgadasPantalla: "+PulgadasPantallas+"\n";
        info+="Bluetooth: "+Bluetooth+"\n";
        JOptionPane.showMessageDialog(null, info);
    }
    
    public String getInfo(){
        String info="La información del vehículo es: \n";
        info+="ID: "+ID+"\n";
        info+="Marca: "+Marca+" \n";
        info+="Precio: "+Precio+"\n";
        info+="Ram: "+Ram+"\n";
        info+="Almacenamiento: "+Almacenamiento+" Km\n";
        info+="GPU: "+GPU+"\n";
        info+="CPU: "+CPU+"\n";
        info+="PulgadasPantalla: "+PulgadasPantallas+"\n";
        info+="Bluetooth: "+Bluetooth+"\n";
        return info;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

