/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JUAN MARIN
 */
public class LosDatos {
    
    public ArrayList ListaDatos;
    public ArrayList ListaDatos2;
    
    public LosDatos(){
        ListaDatos = new ArrayList();
        ListaDatos2 = new ArrayList();
    }
    

    public int getBuscarID(String ID){
        int i;
        Celulares aux=null;
        for(i=0; i<ListaDatos.size(); i++){
            aux = (Celulares) ListaDatos.get(i); 
            if(ID.equals(aux.getID())==true)
                return i;
            
        }
        return -1;
    }
    public int getBuscarID2(String ID){
        int i;
        Computadoras aux2=null;
        for(i=0; i<ListaDatos2.size(); i++){
            aux2 = (Computadoras) ListaDatos2.get(i);             
            if(ID.equals(aux2.getID())==true)
                return i;
        }
        return -1;
    }
  

     public void setAddCelu (int MegaPXFrontal, int MegaPXTrasera, 
       String Jack, String Huella, String RecFacial, String Marca, float Ram, 
       float Almacenamiento, String CPU, String GPU, float PulgadasPantallas, 
       float Precio, String ID, String Bluetooth){
      int pos=getBuscarID(ID);
      int pos2=getBuscarID2(ID);
        if(pos!=-1 || pos2!=-1)
            JOptionPane.showMessageDialog(null, 
            "Ya hay un Dispositivo con ese ID","Error",JOptionPane.ERROR_MESSAGE);
        else{
            Celulares celu=new Celulares(MegaPXFrontal, MegaPXTrasera,  Jack,  Huella, RecFacial, Marca,  Ram,  Almacenamiento, CPU, GPU, PulgadasPantallas, Precio, ID, Bluetooth);
            ListaDatos.add(celu);
            JOptionPane.showMessageDialog(null, 
            "¡El Dispositivo se registro con exito!");
        }
    }
     
     
     
      public void setAddCompu (float FuenteAlim, String Tactil, 
      int NumUSB, String HDMI, String VGA, String Marca, float Ram, 
      float Almacenamiento, String CPU, String GPU, float PulgadasPantallas, 
      float Precio, String ID, String Bluetooth){
      int pos1=getBuscarID2(ID);
      int pos=getBuscarID(ID);
        if(pos1!=-1 || pos!=-1)
            JOptionPane.showMessageDialog(null, 
            "Ya hay un Dispositivo con ese ID","Error",JOptionPane.WARNING_MESSAGE);
      else{
          Computadoras compu=new Computadoras(FuenteAlim, Tactil, NumUSB, HDMI, VGA, Marca, Ram, Almacenamiento, CPU, GPU, PulgadasPantallas, Precio, ID, Bluetooth);
            ListaDatos2.add(compu);
            JOptionPane.showMessageDialog(null, 
            "¡El Dispositivo se registro con exito!");
      }     
    }
      
      
      
    public void setEliminarDis(String cod){
        int pos=getBuscarID(cod);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, 
            "Error: El ID NO SE ENCUENTRA REGISTRADO");
        else{
            ListaDatos.remove(pos);
            JOptionPane.showMessageDialog(null, 
            "Elemento eliminado");
        }
        
    }
    public void setEliminarDis2(String cod2){
        int pos=getBuscarID2(cod2);
        if(pos==-1)
            JOptionPane.showMessageDialog(null, 
            "Error: El ID NO SE ENCUENTRA REGISTRADO");
        else{
            ListaDatos2.remove(pos);
            JOptionPane.showMessageDialog(null, 
            "Elemento eliminado");
        }
        
    }

    public void setModificar(String ID) {
    int pos = getBuscarID(ID);
    int MegaPXFrontal;
    int MegaPXTrasera;
    String Jack;
    String Huella;
    String RecFacial;
    String Marca;
    float Ram;
    float Almacenamiento;
    String CPU;
    String GPU;
    float PulgadasPantallas;
    float Precio;
    String Bluetooth;
    
    if(pos==-1){
     JOptionPane.showMessageDialog(null,
     "El elmento no existe!");   
    }else{
      Celulares temp=(Celulares) ListaDatos.get(pos);
      MegaPXFrontal=Integer.parseInt(JOptionPane.showInputDialog(
      "Ingrese el nuevo Numero de MegaPixeles de la camara Frotal: "));
      MegaPXTrasera=Integer.parseInt(JOptionPane.showInputDialog(
      "Ingrese el nuevo Numero de MegaPixeles de la camara Trasera: "));
      
        Object DispoJack[] = {"Integrado", "No Integrado"};
        Object OptionJack = null;
        
        OptionJack = 
            JOptionPane.showInputDialog(null,
            "Seleccione el nuevo estado del Jack de Audiculares",
            null,
            JOptionPane.QUESTION_MESSAGE,null,DispoJack, 
            DispoJack[0]);
        
        if((OptionJack.toString()).equals("Integrado")){
           Jack="Si"; 
        }else{
           Jack="No";
        }  
        
        Object DispoHuella[] = {"Integrado", "No Integrado"};
        Object OptionHuella = null;
        
        OptionHuella = 
            JOptionPane.showInputDialog(null,
            "Seleccione el nuevo estado del Sensor de Huella",
            null,
            JOptionPane.QUESTION_MESSAGE,null,DispoHuella, 
            DispoHuella[0]);
        
        if((OptionHuella.toString()).equals("Integrado")){
           Huella="Si"; 
        }else{
           Huella="No";
        }
        
        Object DispoRecFacial[] = {"Integrado","No Intengrado"};
        Object OptionRecFacial = null;
        
        OptionRecFacial =
                JOptionPane.showInputDialog(null,
                   "Selecione el nuevo estado del Reconocimiento Facial",
                   null,
                   JOptionPane.QUESTION_MESSAGE,null,DispoRecFacial,
                   DispoRecFacial[0]);
          if(OptionRecFacial.equals("Integrado")){
              RecFacial="Si";
          }else{
              RecFacial="No";
          }              
                        
       Object DispoBlue[] = {"Integrado", "No Integrado"};
        Object OptionBlue = null;
        
        OptionBlue = 
            JOptionPane.showInputDialog(null,
            "Seleccione el nuevo estado de la Conecxion a Bluetooth",
            null,
            JOptionPane.QUESTION_MESSAGE,null,DispoBlue, 
            DispoBlue[0]);
        
        if((OptionBlue.toString()).equals("Integrado")){
           Bluetooth="Si"; 
        }else{
           Bluetooth="No";
        }                    
      Marca=(JOptionPane.showInputDialog(
      "Ingrese la nueva Marca: ")); 
      Ram=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese la nueva Cantidad de Memoria Ram: "));
      Almacenamiento=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese la nueva Cantidad de Almacenamiento: "));  
      CPU=(JOptionPane.showInputDialog(
      "Ingrese el nuevo CPU: "));
      GPU=(JOptionPane.showInputDialog(
      "Ingrese el nuevo GPU: "));
      PulgadasPantallas=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese el nuevo tamaño en pulgadas de la pantalla: "));
      Precio=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese el nuevo Precio: "));
        
      temp.setMegaPXFrontal(MegaPXFrontal);
      temp.setMegaPXTrasera(MegaPXTrasera);
      temp.setJack(Jack);
      temp.setHuella(Huella);
      temp.setRecFacial(RecFacial);
      temp.setBluetooth(Bluetooth);
      temp.setAlmacenamiento(Almacenamiento);
      temp.setMarca(Marca);
      temp.setRam(Ram);
      temp.setCPU(CPU);
      temp.setGPU(GPU);
      temp.setPulgadasPantallas(PulgadasPantallas);
      temp.setPrecio(Precio);
      
      ListaDatos.set(pos, temp);
    }
}
    
   public void setModificar2(String ID) {
    int pos = getBuscarID2(ID);
    float FuenteAlim;
    String Tactil;
    int NumUSB;
    String HDMI;
    String VGA;
    String Marca;
    float Ram;
    float Almacenamiento;
    String CPU;
    String GPU;
    float PulgadasPantallas;
    float Precio;
    String Bluetooth;
    
    if(pos==-1){
     JOptionPane.showMessageDialog(null,
     "El elmento no existe!");   
    }else{
      Computadoras temp=(Computadoras) ListaDatos2.get(pos);
      FuenteAlim=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese el nuevo volaje de la fuente de alimentacion: "));
      NumUSB=Integer.parseInt(JOptionPane.showInputDialog(
      "Ingrese el nuevo numero de puertos USB: "));
      
        Object DispoTactil[] = {"Integrado", "No Integrado"};
        Object OptionTactil = null;
        
        OptionTactil = 
            JOptionPane.showInputDialog(null,
            "Seleccione el nuevo estado del la Pantalla Tactil",
            null,
            JOptionPane.QUESTION_MESSAGE,null,DispoTactil, 
            DispoTactil[0]);
        
        if((OptionTactil.toString()).equals("Integrado")){
           Tactil="Si"; 
        }else{
           Tactil="No";
        }  
        
        Object DispoHDMI[] = {"Integrado", "No Integrado"};
        Object OptionHDMI = null;
        
        OptionHDMI = 
            JOptionPane.showInputDialog(null,
            "Seleccione el nuevo estado del Puerto HDMI",
            null,
            JOptionPane.QUESTION_MESSAGE,null,DispoHDMI, 
            DispoHDMI[0]);
        
        if((OptionHDMI.toString()).equals("Integrado")){
           HDMI="Si"; 
        }else{
           HDMI="No";
        }
        
        Object DispoVGA[] = {"Integrado","No Intengrado"};
        Object OptionVGA = null;
        
        OptionVGA =
                JOptionPane.showInputDialog(null,
                   "Selecione el nuevo estado del Puerto VGA",
                   null,
                   JOptionPane.QUESTION_MESSAGE,null,DispoVGA,
                   DispoVGA[0]);
          if(OptionVGA.equals("Integrado")){
              VGA="Si";
          }else{
              VGA="No";
          }              
                        
       Object DispoBlue[] = {"Integrado", "No Integrado"};
        Object OptionBlue = null;
        
        OptionBlue = 
            JOptionPane.showInputDialog(null,
            "Seleccione el nuevo estado de la Conecxion a Bluetooth",
            null,
            JOptionPane.QUESTION_MESSAGE,null,DispoBlue, 
            DispoBlue[0]);
        
        if((OptionBlue.toString()).equals("Integrado")){
           Bluetooth="Si"; 
        }else{
           Bluetooth="No";
        }                    
      Marca=(JOptionPane.showInputDialog(
      "Ingrese la nueva Marca: ")); 
      Ram=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese la nueva Cantidad de Memoria Ram: "));
      Almacenamiento=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese la nueva Cantidad de Almacenamiento: "));  
      CPU=(JOptionPane.showInputDialog(
      "Ingrese el nuevo CPU: "));
      GPU=(JOptionPane.showInputDialog(
      "Ingrese el nuevo GPU: "));
      PulgadasPantallas=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese el nuevo tamaño en pulgadas de la pantalla: "));
      Precio=Float.parseFloat(JOptionPane.showInputDialog(
      "Ingrese el nuevo Precio: "));
        
      temp.setFuenteAlim(FuenteAlim);
      temp.setHDMI(HDMI);
      temp.setNumUSB(NumUSB);
      temp.setTactil(Tactil);
      temp.setVGA(VGA);
      temp.setBluetooth(Bluetooth);
      temp.setAlmacenamiento(Almacenamiento);
      temp.setMarca(Marca);
      temp.setRam(Ram);
      temp.setCPU(CPU);
      temp.setGPU(GPU);
      temp.setPulgadasPantallas(PulgadasPantallas);
      temp.setPrecio(Precio);
      
      ListaDatos2.set(pos, temp);
    }
} 
    
    
   public void getMayor(){
        int i;
        int a;
        int posM=-1;
        String TempID="";
        String TempID2="";
        String ID="";
        float Tempmay=-1;
        float Tempmay2=-1;
        float May=0;
        float men= 1000000000;
        int posN=-1;
        Celulares celu=null;
        Computadoras compu=null;
        if(ListaDatos.isEmpty()==true && ListaDatos2.isEmpty()==true)
            JOptionPane.showMessageDialog(null, 
            "¡Los ArrayList se encuentra vacios!");
        else{
            if(ListaDatos.isEmpty()==false){
             for(i=0; i<ListaDatos.size(); i++){
              celu=(Celulares) ListaDatos.get(i);
              if(celu.getPrecio()>= Tempmay){
              Tempmay=celu.getPrecio();
              posM=i;
              celu=(Celulares) ListaDatos.get(posM);
              TempID=celu.getID();         
                    }
                }   
            }
            
           if(ListaDatos2.isEmpty()==false){
            for(i=0; i<ListaDatos2.size(); i++){
              compu=(Computadoras) ListaDatos2.get(i);
              if(compu.getPrecio()>= Tempmay2){
              Tempmay2=compu.getPrecio();
              posM=i;
              compu=(Computadoras) ListaDatos2.get(posM);
              TempID2=compu.getID();         
                    }
                }   
           }
             
            if (Tempmay > Tempmay2){
               May = Tempmay;
               ID = TempID;
            }else{
               May = Tempmay2;
               ID = TempID2;
            }
        }   
    if(posM==-1 && posN==-1){
   
     }else{
    String info="El Mayor precios es de: "+May+" $"+"\n"+"ID del Dispositivo: "+ID;
    JOptionPane.showMessageDialog(null, info);
     
   }  
           
    
   }  
   public void getMenor(){
        int i;
        int a;
        int posM=-1;
        String TempID="";
        String TempID2="";
        String ID="";
        float Tempmen=1000000000;
        float Tempmen2=1000000000;
        float Men=0;
        float men= 1000000000;
        int posN=-1;
        Celulares celu=null;
        Computadoras compu=null;
        if(ListaDatos.isEmpty()==true && ListaDatos2.isEmpty()==true)
            JOptionPane.showMessageDialog(null, 
            "¡Los ArrayList se encuentra vacios!");
        else{
            if(ListaDatos.isEmpty()==false){
             for(i=0; i<ListaDatos.size(); i++){
              celu=(Celulares) ListaDatos.get(i);
              if(celu.getPrecio()<= Tempmen){
              Tempmen=celu.getPrecio();
              posM=i;
              celu=(Celulares) ListaDatos.get(posM);
              TempID=celu.getID();         
                    }
                }   
            }
            
           if(ListaDatos2.isEmpty()==false){
            for(i=0; i<ListaDatos2.size(); i++){
              compu=(Computadoras) ListaDatos2.get(i);
              if(compu.getPrecio()<= Tempmen2){
              Tempmen2=compu.getPrecio();
              posM=i;
              compu=(Computadoras) ListaDatos2.get(posM);
              TempID2=compu.getID();         
                    }
                }   
           }
             
            if (Tempmen < Tempmen2){
               Men = Tempmen;
               ID = TempID;
            }else{
               Men = Tempmen2;
               ID = TempID2;
            }
        }   
    if(posM==-1 && posN==-1){

     }else{
    String info="El Menor precio es de: "+Men+" $"+"\n"+"ID del Dispositivo: "+ID;
    JOptionPane.showMessageDialog(null, info);
     
   }  
           
    
   }    
    
 public void getProm(){
  int i;
  int a;
  int posM=-1;
  int posN=-1;
  Celulares celu=null;
  Computadoras compu =null;
  double n=0;
  double b=0;
  if(ListaDatos.isEmpty()==true && ListaDatos2.isEmpty()==true)
   JOptionPane.showMessageDialog(null, 
    "¡ArrayList se encuentra vacio!");    
  else{
    if(ListaDatos.isEmpty()==false){
     for(i=0; i<ListaDatos.size(); i++){
     celu=(Celulares) ListaDatos.get(i);
     n+=celu.getPrecio();
     posM=i;
    }   
   }  
   if(ListaDatos2.isEmpty()==false){
   for(i=0; i<ListaDatos2.size(); i++){
     compu=(Computadoras) ListaDatos2.get(i);
     b+=compu.getPrecio();
     posM=i;
    }    
   }   
  }
 
   if (posM==-1 && posN==-1){

   }else{
      String info="El promedio de los Precios de los Celulares es de: "+n/ListaDatos.size()+"$";
      JOptionPane.showMessageDialog(null, info);
      
      String info2="El promedio de los Precios de los Computadores es de: "+b/ListaDatos2.size()+"$";
      JOptionPane.showMessageDialog(null, info2);  
   }        
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
public void setmostrarDatosCel(JTable jTable1){
        int i;        
        Celulares temp=null;               
        setagregarFilas(jTable1, 0);
        for(i=0; i<ListaDatos.size(); i++){
            temp=(Celulares) ListaDatos.get(i);
            setagregarFilas(jTable1, jTable1.getRowCount()+1);
            jTable1.setValueAt(temp.getMarca(), i, 0);
            jTable1.setValueAt(temp.getID(), i, 1);
            jTable1.setValueAt(temp.getPrecio(), i, 2);
            jTable1.setValueAt(temp.getMegaPXFrontal(), i, 3);
            jTable1.setValueAt(temp.getMegaPXTrasera(), i, 4);
            jTable1.setValueAt(temp.getJack(), i, 5);
            jTable1.setValueAt(temp.getBluetooth(), i, 6);
            jTable1.setValueAt(temp.getHuella(), i, 7);
            jTable1.setValueAt(temp.getRecFacial(), i, 8);
            jTable1.setValueAt(temp.getRam(), i, 9);
            jTable1.setValueAt(temp.getAlmacenamiento(), i, 10);
            jTable1.setValueAt(temp.getPulgadasPantallas(),i,11);
            jTable1.setValueAt(temp.getCPU(),i,12);
            jTable1.setValueAt(temp.getGPU(),i,13);
            
     
        }
    
}

    private void setagregarFilas(JTable jTable1, int Filas) {
   DefaultTableModel modelData = (DefaultTableModel) jTable1.getModel();
   modelData.setRowCount(Filas);        
    
}
    
  public void setmostrarDatosCompu(JTable jTable2) {
        int i;        
        Computadoras temp2=null;               
        setagregarFilas2(jTable2, 0);
        for(i=0; i<ListaDatos2.size(); i++){
            temp2=(Computadoras ) ListaDatos2.get(i);
            setagregarFilas2(jTable2, jTable2.getRowCount()+1);
            jTable2.setValueAt(temp2.getMarca(), i, 0);
            jTable2.setValueAt(temp2.getID(), i, 1);
            jTable2.setValueAt(temp2.getPrecio(), i, 2);
            jTable2.setValueAt(temp2.getNumUSB(), i, 3);
            jTable2.setValueAt(temp2.getHDMI(), i, 4);
            jTable2.setValueAt(temp2.getTactil(), i, 5);
            jTable2.setValueAt(temp2.getBluetooth(), i, 6);
            jTable2.setValueAt(temp2.getVGA(), i, 7);
            jTable2.setValueAt(temp2.getFuenteAlim(), i, 8);
            jTable2.setValueAt(temp2.getRam(), i, 9);
            jTable2.setValueAt(temp2.getAlmacenamiento(), i, 10);
            jTable2.setValueAt(temp2.getPulgadasPantallas(),i,11);
            jTable2.setValueAt(temp2.getCPU(),i,12);
            jTable2.setValueAt(temp2.getGPU(),i,13);
            
     
        }
     


}

    private void setagregarFilas2(JTable jTable2, int Filas) {
   DefaultTableModel modelData = (DefaultTableModel) jTable2.getModel();
   modelData.setRowCount(Filas);        
    
}  
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}