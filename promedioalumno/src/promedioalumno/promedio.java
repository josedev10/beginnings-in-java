
package promedioalumno;

import javax.swing.JOptionPane;

/*
Ejercicio 16: Queremos desarrollar una aplicacion que nos ayude a gestionr las notas
de un centro educativo. Cada grupo (o clase) esta compuesto por 5 alumnos.
Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. 
Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno
que se encuentra en la posicion N (N se lee por teclado).
 */
public class promedio {
    String[] name=new String[5];
    float[] pt=new float[5];
    float[] st=new float[5];
    float[] tt=new float[5];
    int i,n;
    float mpt,mst,mtt,suma1=0,suma2=0,suma3=0,ma;
    String cad="";
    boolean sw=false;
    
    public void pedirName(){
        for(i=0;i<5;i++){
            name[i]=JOptionPane.showInputDialog("Ingresa alumno "+(i+1)+" nombre: ");
            cad+=(i+1)+". "+name[i]+"  ";
        }
    }
    public void pedirnotapt(){
        for(i=0;i<5;i++){
            pt[i]=Float.parseFloat(JOptionPane.showInputDialog("Digita "
                    + "nota del primer trimestre del alumno "+name[i]+" : "));
        }
    }
    public void pedirnotast(){
        for(i=0;i<5;i++){
            st[i]=Float.parseFloat(JOptionPane.showInputDialog("Digita "
                    + "nota del segundo trimestre del alumno "+name[i]+" : "));
        }
    }
    public void pedirnotatt(){
       for(i=0;i<5;i++){
            tt[i]=Float.parseFloat(JOptionPane.showInputDialog("Digita "
                    + "nota del tercer trimestre del alumno "+name[i]+" : "));
        } 
    }
    public void MediaTrimestre(){
        for(i=0;i<5;i++){
            suma1+=pt[i];
            suma2+=st[i];
            suma3+=tt[i];
        }
        mpt=suma1/5;
        mst=suma2/5;
        mtt=suma3/5;        
    }
    public void elegirAlumno(){
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog(cad+"\n\nDigita el número del alumno: "));
            n+=-1;
            if(n>=5 || n<0){
                JOptionPane.showMessageDialog(null,"por favor, digita un número valido");
            }
        }while(n>=5 || n<0);
    } 
            
    public void MediaAlumno(){
        ma=(pt[n]+st[n]+tt[n])/3;
    }
    public void MostrarA(){
        JOptionPane.showMessageDialog(null,"La media del grupo: \n"+""
                + "primer trimestre: "+mpt+"\nSegundo trimestre: "+mst+""
                        + "\nTercer Trimestre: "+mtt+"\n\nMedia del alumno "+name[n]+" : "+ma);
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog(cad+"\n\nDigita el número del alumno: \n\n Digite 0 para cerrar"));
            if(n==0){
                sw=true;
            }else{
            n+=-1;
            
            if(n>=5 || n<0){
                JOptionPane.showMessageDialog(null,"por favor, digita un número valido");
            }else{
        ma=(pt[n]+st[n]+tt[n])/3;
                JOptionPane.showMessageDialog(null,"La media del grupo: \n"+""
                + "primer trimestre: "+mpt+"\nSegundo trimestre: "+mst+""
                        + "\nTercer6 Trimestre: "+mtt+"\n\nMedia del alumno "+name[n]+" : "+ma);
            }
        }
        }while(n>=5 || n<0 || sw==false);
        
        
    }
}
