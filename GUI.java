import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JTextField inputPanjang;
    private JTextField inputLebar;
    private JTextField inputTinggi;
    private JButton hitung;
    private JButton reset;
    private JLabel hasil;

    public GUI() {
        inputPanjang = new JTextField("", 15);
        inputLebar = new JTextField("", 15);
        inputTinggi = new JTextField("", 15);

        hitung = new JButton("Hitung");
        reset = new JButton("Reset");

        hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputTinggi.getText().length() == 0 || inputLebar.getText().length() == 0 || inputPanjang.getText().length() == 0){
                    JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!");
                    return;
                }
                try{
                    int p = Integer.parseInt(inputPanjang.getText());
                    int l = Integer.parseInt(inputLebar.getText());
                    int t = Integer.parseInt(inputTinggi.getText());

                    PersegiPanjang pp = new PersegiPanjang();
                    pp.setLebar(l);
                    pp.setPanjang(p);

                    Balok b = new Balok();
                    b.setPanjang(p);
                    b.setLebar(l);
                    b.setTinggi(t);

                    String result = "<html>Hasil<br>Keliling: " + pp.getBidang()
                    + "<br>Luas Persegi Panjang: " + pp.getRuang() + "<br>Volume: " + b.getRuang()
                    + "<br>Luas Permukaan Balok: " + b.getBidang() + "</html>";
                    hasil.setText(result);
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "Input hanya boleh angka!");
                }
            }
        });

        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inputLebar.setText("");
                inputPanjang.setText("");
                inputTinggi.setText("");
                hasil.setText("<html>Hasil<br>Keliling: 0<br>Luas Persegi Panjang: 0<br>Volume: 0<br>Luas Permukaan Balok: 0</html>");
            }
            
        });

        hasil = new JLabel("<html>Hasil<br>Keliling: 0<br>Luas Persegi Panjang: 0<br>Volume: 0<br>Luas Permukaan Balok: 0</html>");

        Container contentPane = getContentPane();
        SpringLayout layout = new SpringLayout();  
        contentPane.setLayout(layout);  
  
        JLabel panjang = new JLabel("Panjang");
        JLabel lebar = new JLabel("Lebar");
        JLabel tinggi = new JLabel("Tinggi");

        contentPane.add(panjang);
        contentPane.add(inputPanjang);
        contentPane.add(lebar);
        contentPane.add(inputLebar);
        contentPane.add(tinggi);
        contentPane.add(inputTinggi);
        contentPane.add(hitung);
        contentPane.add(reset);
        contentPane.add(hasil);

        layout.putConstraint(SpringLayout.WEST, panjang, 112, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, panjang, 50, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, inputPanjang, 9, SpringLayout.EAST, panjang);
        layout.putConstraint(SpringLayout.NORTH, inputPanjang, 50, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, lebar, 125, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, lebar, 100, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, inputLebar, 9, SpringLayout.EAST, lebar);
        layout.putConstraint(SpringLayout.NORTH, inputLebar, 100, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, tinggi, 125, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, tinggi, 150, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, inputTinggi, 9, SpringLayout.EAST, tinggi);
        layout.putConstraint(SpringLayout.NORTH, inputTinggi, 150, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, hitung, 160, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, hitung, 200, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, reset, 9, SpringLayout.EAST, hitung);
        layout.putConstraint(SpringLayout.NORTH, reset, 200, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, hasil, 125, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, hasil, 250, SpringLayout.NORTH, contentPane);

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
    }
}
