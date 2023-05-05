
package ejercicioventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;

public class VentanaEjercicio extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JTextArea areaTexto;
    private JButton boton;
    
    public VentanaEjercicio(){
        setSize(1300,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Evento");
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        //colocarEtiquetas();
        //colocarBotones();
        colocarCajaDeTexto();
        colocarAreaDeTexto();
    }
    
    private void colocarPanel(){
        panel=new JPanel();
        
        panel.setLayout(null);
        
        getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta=new JLabel();
        
        etiqueta.setBounds(10, 10, 600, 60);
        etiqueta.setText("cual es tú nombre: ");
        etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta.setForeground(Color.black);
        etiqueta.setOpaque(true);
        etiqueta.setFont(new Font("chiller",0,60));
        
        
        panel.add(etiqueta);
    }
    private void colocarBotones(){
        boton=new JButton();
        
        boton.setBounds(30, 360, 130, 34);
        boton.setText("click aquí");
        boton.setMnemonic(' ');
        
        panel.add(boton);
        
        saludo=new JLabel();
        
        saludo.setBounds(30, 430,700 , 40);
        saludo.setFont(new Font("Cascadia Code",1,30));
        panel.add(saludo);
        
       //eventoOyenteDeAccion();
        //eventoOyenteDeRaton();
    }
    private void colocarCajaDeTexto(){
        
        cajaTexto=new JTextField();
        
        cajaTexto.setBounds(10, 10, 250, 40);
        
        panel.add(cajaTexto);
        eventosDelTeclado();
    }
    private void colocarAreaDeTexto(){
        areaTexto=new JTextArea();
        
        areaTexto.setBounds(300, 10, 200, 300);
        panel.add(areaTexto);
        
        //JScrollPane es un método que sirve para que la caja de texto sea mas extensa con una barra y se pueda scrollear en ella
        JScrollPane scroll=new JScrollPane(areaTexto);
        scroll.setBounds(300, 10, 200, 300);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scroll);
    }
    private void eventoOyenteDeAccion(){
        ActionListener oyenteDeAccion=new ActionListener() {
            //A continuación, sobrescribe el método actionPerformed() de la interfaz A0ctionListener
            @Override
            public void actionPerformed(ActionEvent e) {
            saludo.setText("Hola "+cajaTexto.getText());
            }
        };
        // registra la instancia de la clase que implementa ActionListener en el objeto que dispara el evento
        boton.addActionListener(oyenteDeAccion);
    }
    private void eventoOyenteDeRaton(){
        //Agregando oyente de raton . mouse listener
        //se crea un objeto de una clase abstracta o interface, y para crear el objeto se debe utilizar todos sus metodos
        MouseListener oyenteDeRaton=new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
                //el metodo append sirve para escribir sin que se boree el texto anterior escrito
                areaTexto.append("\nmouseClicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("\nmousePressed");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("\nmouseReleased");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("\nmouseEntered");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("\nmouseExited");

            }
            
        };
        //se añade a boton el metodo MouseListener 
        boton.addMouseListener(oyenteDeRaton);
    }
    private void eventosDelTeclado(){
        KeyListener oyenteDeTeclado=new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                areaTexto.append("KeyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                areaTexto.append("KeyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //areaTexto.append("KeyReleased\n");
                //se puede utilizar el metodo getKeyChar para saber que tecla se ha pulsado y hacer una accion a eso
                if(e.getKeyChar()=='p'){
                    areaTexto.append("Es una p\n");
                }
            }
        };
        //se añade a la cajaTexto el metodo keylistener
        cajaTexto.addKeyListener(oyenteDeTeclado);
        
    }
}
