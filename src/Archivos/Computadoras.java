
package Archivos;

/**
 *
 * @author JUAN MARIN
 */
public class Computadoras extends Dispositivos{
    float FuenteAlim;
    String Tactil;
    int NumUSB;
    String HDMI;
    String VGA;

    public Computadoras(float FuenteAlim, String Tactil, int NumUSB, String HDMI, String VGA, String Marca, float Ram, float Almacenamiento, String CPU, String GPU, float PulgadasPantallas, float Precio, String ID, String Bluetooth) {
        super(Marca, Ram, Almacenamiento, CPU, GPU, PulgadasPantallas, Precio, ID, Bluetooth);
        this.FuenteAlim = FuenteAlim;
        this.Tactil = Tactil;
        this.NumUSB = NumUSB;
        this.HDMI = HDMI;
        this.VGA = VGA;
    }

  

    public void setFuenteAlim(float FuenteAlim) {
        this.FuenteAlim = FuenteAlim;
    }

    public void setTactil(String Tactil) {
        this.Tactil = Tactil;
    }

    public void setNumUSB(int NumUSB) {
        this.NumUSB = NumUSB;
    }

    public void setHDMI(String HDMI) {
        this.HDMI = HDMI;
    }

    public void setVGA(String VGA) {
        this.VGA = VGA;
    }

    public float getFuenteAlim() {
        return FuenteAlim;
    }

    public String getTactil() {
        return Tactil;
    }

    public int getNumUSB() {
        return NumUSB;
    }

    public String getHDMI() {
        return HDMI;
    }

    public String getVGA() {
        return VGA;
    }
    
    
}
