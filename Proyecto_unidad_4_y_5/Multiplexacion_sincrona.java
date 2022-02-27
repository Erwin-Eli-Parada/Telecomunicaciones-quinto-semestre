import javax.swing.*;
public class Multiplexacion_sincrona
{
    
    public static void main(String []args){
        try{
        Multiplexacion_sincrona ms=new Multiplexacion_sincrona();
        String [] caracteres={"a","b","c","d","e","f","g","h","i","j"};
        int no_estaciones=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de estaciones"));
        int [] estaciones=new int [no_estaciones];
        int tamaño=0,sincronizacion=0,bytes_nulos=0;
        int bits;
        int bits_utiles;
        String s="",s2="";
        if(estaciones.length<=caracteres.length){
            
            for(int i=0;i<estaciones.length;i++){
                estaciones[i]=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de caracteres de la estación "+(i+1)));
                s2+="la estación "+ caracteres[i]+" transmite "+estaciones[i]+" bytes \n";
                if(tamaño<estaciones[i]){
                    tamaño=estaciones[i];
                }
            }
            for(int i=0;i<estaciones.length;i++){
                bytes_nulos+=tamaño-estaciones[i];                
            }
            for(int i=0;i<tamaño;i++){
                s+="  ";
                if(sincronizacion==0){
                    sincronizacion=1;
                }else{
                    sincronizacion=0;
                }
                s+=sincronizacion;
                for(int j=0;j<estaciones.length;j++){
                    if(estaciones[j]==0){
                        s+=" ";
                    }else{
                        s+=caracteres[j];
                        estaciones[j]--;
                    }
                }
            }
            s2+="el tren de bits es:\n";
            for(int i=s.length()-1;i>-1;i--){
                s2+=s.charAt(i);
            }
            s2+="\nEl numero de bits que se transmiten es "+((tamaño*estaciones.length*8)+tamaño);
            s2+="\nEl numero de bits utiles es "+((tamaño*estaciones.length*8)-(bytes_nulos*8));
            System.out.println(s2);
        }else{
            JOptionPane.showMessageDialog(null,"número de estaciones permitidas rebasado");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en los datos");
        }
    }
}
