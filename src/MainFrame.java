
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame{
    private JTextField tfPeso;
    private JButton btnApilar;
    private JButton btnClear;

    private JPanel mainPanel;
    private JTextField tfContenido;
    private JTextField tfPrioridad;
    private JTextField tfPais;
    private JTextField tfEmisor;
    private JTextField tfReceptor;
    private JTextField tfId;
    private JTextArea tfResultado;
    private JButton btnDesapilar;
    private JTextField tfColumna;
    private JTextField tfNhub;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Bienvenido");
        setSize(750,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Puerto puerto = new Puerto();

        btnApilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = tfContenido.getText();
                int weight = Integer.parseInt(tfPeso.getText());
                int priority = Integer.parseInt(tfPrioridad.getText());
                String nation = tfPais.getText();
                String em = tfEmisor.getText();
                String re = tfReceptor.getText();
                int ident = Integer.parseInt(tfId.getText());

                Contenedor c = new Contenedor(ident,weight,priority,content,nation,em,re);
                puerto.apilar(c);
                tfResultado.setText(puerto.mostrar_puerto());

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPeso.setText("");
                tfContenido.setText("");
                tfPrioridad.setText("");
                tfPais.setText("");
                tfEmisor.setText("");
                tfId.setText("");
                tfReceptor.setText("");


            }
        });
        btnDesapilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int colum = Integer.parseInt(tfColumna.getText());
                int nhub = Integer.parseInt(tfNhub.getText());
                puerto.desapilar(colum,nhub);
                tfResultado.setText(puerto.mostrar_puerto());

            }
        });
    }



    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();



   }


}