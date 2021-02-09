
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Finestra extends JFrame implements ActionListener{
public JMenuBar mb;
public JMenu menu;
public JMenuItem inserisci, cancella, ricerca;
public Finestra() {
initc();

}

public void initc() {
	mb= new JMenuBar();
	menu= new JMenu("Opzioni");
	inserisci= new JMenuItem("Inserisci");
	cancella= new JMenuItem("Cancella");
	ricerca= new JMenuItem("Ricerca");

	inserisci.addActionListener(this);
	cancella.addActionListener(this);
	ricerca.addActionListener(this);
	menu.add(inserisci);
	menu.add(cancella);
	menu.add(ricerca);
	mb.add(menu);
	this.setJMenuBar(mb);
	this.setLayout(new FlowLayout());
	this.setSize(600, 600);

}

public static void main(String[] args) {
	Finestra f=new Finestra();
	f.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	Alunno c = new Alunno("", "", "");
	if(e.getSource().equals(inserisci)) {
	JTextField noome = new JTextField(10);
	JTextField coognome = new JTextField(10);
	JTextField claasse = new JTextField(10);
	int reply;
	Object[]data= {"Nome: ",noome, "Cognome: ",coognome,"Classe: ",claasse};

	reply = JOptionPane.showConfirmDialog(null, data, "Inserisci Dati anagrafici", JOptionPane.OK_CANCEL_OPTION);
	if(reply == JOptionPane.OK_OPTION) {
	c.nome=noome.getText();
	c.cognome=coognome.getText();
	c.classe=claasse.getText();
	}
}
//if(e.getSource().equals()) {


}
}