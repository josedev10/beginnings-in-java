
package ventana;

//para poder heredar JFrame tenemos que importarla, revisar la api de java
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//ventana la vamos hacer hija de la clase JFrame para que herede sus metodos
public class Ventana extends JFrame{
    public JPanel panel;//se declara el objeto publico, para todos los metodos
    public Ventana(){
        //no es necesario poner el this, pero si quieres lo puedes
        //se declara los argumentos del metodo setSize, el primer arguento es lo ancho y el segundo lo largo
        this.setSize(800, 650);
        //este metodo nos permite manejar opciones cuando se clickea en cerrar
        //una de las opciones es enviar como argumento EXIT_ON_CLOSE para que cierre el programa al salir la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //este metodo nos sirve para establecer el titulo de la ventana
        setTitle("lio");
        //se establece la ubicacion de la interfaz al salir
        //setLocation(300,50);
        //setBounds seria una convinacion entre el metodo setSize y setLocation
        //setBounds(300,50,800,650);
        //el setLocationRelativeTo(null) funciona para dejar la interfaz en el centro
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.yellow);
        iniciarComponentes();//se invoca al metodo iniciarComponentes
    }
    
    private void iniciarComponentes(){
       colocarPaneles();
       //colocarEtiquetas();
       //colocarBotones();
       //colocarRadioBotones();
       //colocarCajasDeTexto();
       //colocarAreaDeTexto();
       colocarListasDesplegables();
       
    }
    private void colocarPaneles(){
        panel=new JPanel();//se instancia el objeto panel
        
        panel.setLayout(null);//lo que hace es que se desactiva el diseño por defecto del panel, todos los objetos añadidos al panel habra que darle su ubicacion
        
        //panel.setBackground(Color.red);//se le establece un color al panel
        this.getContentPane().add(panel);//el panel, es agregado a la interfaz 
    }
    private void colocarEtiquetas(){
        
        //JLabel etiqueta=new JLabel("Hola");//aqui se crea la etique y se le envia el argumento para que la etiqueta muestre hola
        //JLabel etiqueta=new JLabel("Hola",SwingConstants.TRAILING);//se crea el objeto etiqueta, se le pasa un String y un entero como argumento
        JLabel etiqueta=new JLabel();//se crea el objeto
        
        etiqueta.setText("Balon del mundial");//se le establece un texto a la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//se estable la ubicacion del texto dentro de  la etiqueta
        etiqueta.setBounds(25, 10, 280, 130);//se establece la posicion y el tamaño de la etiqueta, obviamente primero desactivando el layout default
        etiqueta.setForeground(Color.white);//se establece el color de la letra de la etiqueta
        etiqueta.setOpaque(true);//por defecto es false, eso quiere decir que no se puede pintar la etiqueta
        etiqueta.setBackground(Color.black);//se establece el color del fondo del tamaño de la etiqueta
        //Font fuente=new Font("chiller",0,12);
        //etiqueta.setFont(new Font("chiller",Font.ITALIC,40));//se establece la fuente de la etiqueta
        etiqueta.setFont(new Font("chiller",1,40));//se establece la fuente de la etiqueta
        panel.add(etiqueta);//la etiqueta es agregada al panel
        
        
        //etiqueta Tipo imagen
        //una forma de como hacerlo
        //ImageIcon imagen=new ImageIcon("balon.jpeg");//se crea el objeto imagen ImageIcon
        //JLabel etiqueta2=new JLabel(imagen);//se crea la etiqueta y se le envia el argumento imagen 
        //otra forma
        //JLabel etiqueta2=new JLabel(new ImageIcon("balon.jpeg"));//se crea al objeto etiqueta2 JLabel, se crea al objeto de la clase ImageIcon con la direccion de la imagen
        /*JLabel etiqueta2=new JLabel();//se crea el objeto etiqueta2
        etiqueta2.setIcon(new ImageIcon("balon.jpeg"));//se invoca al metodo setIcon con el objeto etiqueta2 y se crea el objeto ImageIcon con la imagen
        etiqueta2.setBounds(10,170, 512, 512);
        panel.add(etiqueta2);*/
        
        ImageIcon imagen=new ImageIcon("balon.jpeg");//se crea el objeto imagen ImageIcon
        JLabel etiqueta2=new JLabel(imagen);//se crea la etiqueta y se le envia el argumento imagen
        etiqueta2.setBounds(10,170, 300, 300);//se estable el tama{o y la posicion de la etiqueta
        /*con el metodo getIamge() se obtiene una imagen y con el metodo getScaledInstance() se 
        envia los ajustes de la nueva imagen,como tamaño y su tipo de escalado*/
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(),Image.SCALE_SMOOTH)));//se establece un nueva imagen con el objeto imagen
        panel.add(etiqueta2);
    }
    private void colocarBotones(){
        
        //botón 1 - boton de texto
        JButton boton1=new JButton();//se crea el objeto JButton
        
        boton1.setBounds(100, 100, 100, 40);//se establece el tamaño y la posicion del objeto boton1
        boton1.setText("soy botón");//se establece el texto dentro del objeto boton1
        boton1.setBackground(Color.red);//se establece el fondo del boton
        boton1.setForeground(Color.blue);//se establece el color de la letra del boton
        //si setEnabled esta en true se puede interactuar con el boton
        boton1.setEnabled(true);//se establece si se quiere desactivar o activar el objeto boton, haciendolo aun visible
        boton1.setMnemonic('a');//se establece que pulsando la tecla Alt+a hace que se clicqué el boton1 
        
        boton1.setFont(new Font("cooper black",3,12));//se establece la fuente del texto dentro del botón
        
        panel.add(boton1);//se añade el boton al panel
        
        //botón 2 - boton 
        JButton boton2=new JButton();//se crea le objeto boton2 de la clase JButton
        
        boton2.setBounds(400, 100, 100, 40);//establecemos la posicion y el tamaño del boton
        boton2.setOpaque(true);//sirve para habilitar o deshabilitar el diseño de poder colorear el botón
        boton2.setBackground(Color.cyan);//establecemos el color de fondo del boton
        ImageIcon clicaqui=new ImageIcon("click.png");//se crea un objeto ImageIcon donde se guardara a la imagen.
        boton2.setIcon(new ImageIcon(clicaqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //con el metodo setIcon se establece la imagen, convertiendola en una nueva imagen con los ajustes de tamaño necesario para el boton8
        panel.add(boton2);//se agrega al panel el boton2
        
        //boton 3 - boton de bordes
        JButton boton3=new JButton();//se crea un objeto JButton 
        boton3.setBounds(600, 100, 100, 40);// se establece su tamaño y posicion dentro del panel
        boton3.setBorder(BorderFactory.createLineBorder(Color.green,4,false));//se establece los bordes del boton, como color del borde, grueso del borde,si se quiere las puntas de los bordes redondeados o no
        panel.add(boton3);//se añade el objeto boton 3 al panel
    }
    private void colocarRadioBotones(){//metodo para crear radio botones
        JRadioButton radioBoton1=new JRadioButton("Opcion 1",true);//se crea el primer Objeto JRadioButton y este se mostrara marcado por que se le envia como argumento un boolean true
        radioBoton1.setBounds(50, 100, 100, 50);//se establece la posicion y tamaño del Radioboton
        radioBoton1.setEnabled(false);//se desactiva la opcion de marcar al RadioBoton1
        panel.add(radioBoton1);//se agrega al panel
        
        JRadioButton radioBoton2=new JRadioButton("Opcion 2",false);//se crea el segundo Objeto y este es desmarcado por false
        radioBoton2.setBounds(50, 150, 120, 50);
        radioBoton2.setText("Programacion");//se establce el texto
        radioBoton2.setFont(new Font("spring",0,15));//se establece la fuente
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3=new JRadioButton("Opcion 3",false);//igual al segundo objeto JRadioButton
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones=new ButtonGroup();//se crea un grupo de radioBotones para que cuando se de click en uno se desmarque en los demas
        grupoRadioBotones.add(radioBoton1);//se añade al grupo de RsdioBotones
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        
    }
    private void colocarCajasDeTexto(){
        //JTextField cajaTexto=new JTextField("hola",50);
        JTextField cajaTexto=new JTextField();
        //cajaTexto.setBounds(50, 100, 1000, 50);
        //cajaTexto.setText("hola");
        System.out.println("Texto en la caja: "+cajaTexto.getText());
        panel.add(cajaTexto);
    }
    private void colocarAreaDeTexto(){
        JTextArea areaTexto=new JTextArea();//instanciamos a un objeto JTextArea
        
        areaTexto.setBounds(20, 20, 300, 200);//establecemos la posicion y el tamaño del area de texto
        areaTexto.setText("escriba el texto aqui...");//establecemos el texto del area de texto
        areaTexto.append("\nHola..");//agregamos mas texto sin borrar lo introduccido por el metodo seText()
        areaTexto.setEditable(true);//establece si se puede o no editar el area de texto
        
        System.out.println("El texto es: "+areaTexto.getText());//nos sirve para obtener el texto del area de texto
        panel.add(areaTexto);//agregamos el objeto JTextArea al panel
    }
    private void colocarListasDesplegables(){
        //arreglo de paises
        String paises[]={"colombia","argentina","perú","chile","uruguay","canada","españa","francia"};
        
        //se crea el objeto JComboBox y se le pasa como argumento el arreglo de paises
        JComboBox listaDesplegable=new JComboBox(paises);
        listaDesplegable.setBounds(20, 20, 100, 30);//se establece posicion y tamaño
        listaDesplegable.addItem("suiza");//se agrega un objeto a la lista del objeto JComboBox
        listaDesplegable.setSelectedItem("canada");//establece el objeto que primero sera visto de la lista JComboBox
        panel.add(listaDesplegable);//se agrega al panel
    }
}
