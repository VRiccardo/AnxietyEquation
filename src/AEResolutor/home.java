package AEResolutor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class home {
	private static JTextField ProbI;  
	private static JTextField RimI;
	private static JTextField SoppI;
	private static JTextField GravI;
	private static JTextField AddTag;
public static void main(String[] args) {  
	
	// Frame and panels declaration
JFrame f=new JFrame();
f.getContentPane().setBackground(new Color(240, 255, 240));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
f.setSize(400,500);
f.getContentPane().setLayout(null);
f.setVisible(true);
f.setTitle("Anxiety Equation Resolutor");
Panel Home = new Panel();
Panel NewEntry = new Panel();
Panel HistoricData = new Panel();


	// Footer fisso
JPanel Footer = new JPanel();
Footer.setBackground(new Color(255, 255, 240));
Footer.setBounds(0, 446, 400, 26);
f.getContentPane().add(Footer);
JLabel lblNewLabel = new JLabel("PincoPallino s.r.l. \"La vostra soddisfazione è il nostro miglior premio\"");
lblNewLabel.setForeground(Color.LIGHT_GRAY);
lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
Footer.add(lblNewLabel);

	// Panel Home
Home.setVisible(true);
Home.setBounds(0, 0, 400, 440);
f.getContentPane().add(Home);
Home.setLayout(null);
JLabel lblNewLabel_2 = new JLabel("Tracker Ansia");
lblNewLabel_2.setBounds(140, 6, 120, 22);
Home.add(lblNewLabel_2);
lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
JTextPane txtIntro = new JTextPane();
txtIntro.setEditable(false);
txtIntro.setBounds(30, 88, 340, 120);
Home.add(txtIntro);
txtIntro.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
txtIntro.setBackground(new Color(240, 255, 240));
txtIntro.setText("Questa App registra e annota gli stati d'ansia appoggiandosi a un elemento della Cognitive Behavioral Therapy. \n\nDescritta come Equazione dell'ansia, questo trattamento cerca di far visualizzare al paziente alcuni parametri correllati tra loro al fine di razionalizzare meglio lo stato emotivo.");
JTextPane txtAlert = new JTextPane();
txtAlert.setBounds(60, 303, 280, 45);
Home.add(txtAlert);
txtAlert.setEnabled(false);
txtAlert.setText("In questa versione Alpha si può registrare un nuovo stato e vedere lo storico rappresentato in un grafico.");
txtAlert.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
txtAlert.setEditable(false);
txtAlert.setBackground(new Color(240, 255, 240));
Panel ButtonsContainer = new Panel();
ButtonsContainer.setBounds(50, 391, 300, 39);
Home.add(ButtonsContainer);
JButton Insert = new JButton("Inserisci rilevazione");
Insert.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		Home.setVisible(false);
		NewEntry.setVisible(true);
		HistoricData.setVisible(false);
	}
});
ButtonsContainer.add(Insert);
JButton Graph = new JButton("Vedi Storico");
Graph.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		Home.setVisible(false);
		HistoricData.setVisible(true);
		NewEntry.setVisible(false);
	}
});
ButtonsContainer.add(Graph);

	//Panel New Entry
NewEntry.setVisible(false);
NewEntry.setBounds(0, 0, 400, 440);
f.getContentPane().add(NewEntry);
NewEntry.setLayout(null);
JLabel titleNE = new JLabel("New entry");
titleNE.setBounds(155, 5, 90, 22);
NewEntry.add(titleNE);
titleNE.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
JTextPane txtpnEccoloQua = new JTextPane();
txtpnEccoloQua.setBounds(60, 84, 280, 48);
NewEntry.add(txtpnEccoloQua);
txtpnEccoloQua.setEnabled(false);
txtpnEccoloQua.setEditable(false);
txtpnEccoloQua.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
txtpnEccoloQua.setBackground(new Color(255, 255, 255));
txtpnEccoloQua.setText("Inserire nei rispettivi riquadri numeri interi che spazino tra 1 (impossibile) e 100 (certo)");
Panel InputEquation = new Panel();
InputEquation.setBounds(50, 166, 300, 247);
NewEntry.add(InputEquation);
InputEquation.setLayout(null);
Panel Prob = new Panel();
Prob.setBounds(0, 0, 300, 36);
InputEquation.add(Prob);
Prob.setLayout(null);
JLabel lblNewLabel_1 = new JLabel("Probabilità che evento accada");
lblNewLabel_1.setBounds(6, 10, 186, 16);
Prob.add(lblNewLabel_1);
ProbI = new JTextField();
ProbI.setBounds(259, 5, 34, 26);
Prob.add(ProbI);
ProbI.setColumns(2);
Panel Grav = new Panel();
Grav.setBounds(0, 42, 300, 36);
InputEquation.add(Grav);
Grav.setLayout(null);
JLabel lblNewLabel_1_3 = new JLabel("Gravità dell'evento");
lblNewLabel_1_3.setBounds(6, 10, 116, 16);
Grav.add(lblNewLabel_1_3);
GravI = new JTextField();
GravI.setBounds(259, 5, 34, 26);
GravI.setColumns(2);
Grav.add(GravI);
Panel Rim = new Panel();
Rim.setBounds(0, 84, 300, 36);
InputEquation.add(Rim);
Rim.setLayout(null);
JLabel lblNewLabel_1_1 = new JLabel("Capacità di rimediare");
lblNewLabel_1_1.setBounds(6, 10, 133, 16);
Rim.add(lblNewLabel_1_1);
RimI = new JTextField();
RimI.setBounds(259, 5, 34, 26);
RimI.setColumns(2);
Rim.add(RimI);
Panel Sopp = new Panel();
Sopp.setBounds(0, 126, 300, 36);
InputEquation.add(Sopp);
Sopp.setLayout(null);
JLabel lblNewLabel_1_2 = new JLabel("Capacità di sopportare");
lblNewLabel_1_2.setBounds(6, 10, 142, 16);
Sopp.add(lblNewLabel_1_2);
SoppI = new JTextField();
SoppI.setBounds(258, 5, 34, 26);
SoppI.setColumns(2);
Sopp.add(SoppI);
JButton Annulla = new JButton("Annulla e torna alla Home");
Annulla.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		Home.setVisible(true);
		NewEntry.setVisible(false);
		HistoricData.setVisible(false);
	}
});
Panel tag = new Panel();
tag.setBounds(0, 168, 300, 36);
InputEquation.add(tag);
tag.setLayout(null);
AddTag = new JTextField();
AddTag.setBounds(222, 5, 70, 26);
tag.add(AddTag);
JLabel lblNewLabel_3 = new JLabel("tag");
lblNewLabel_3.setBounds(6, 10, 125, 16);
tag.add(lblNewLabel_3);
Annulla.setBackground(Color.WHITE);
Annulla.setBounds(6, 203, 207, 29);
InputEquation.add(Annulla);
JButton Salva = new JButton("Salva");
Salva.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		outputSave s = new outputSave();
		String tP = ProbI.getText();
		String tG = GravI.getText();
		String tR = RimI.getText();
		String tS = SoppI.getText();
		String tT = AddTag.getText();
		s.InsertNewPar(tP, tG, tR, tS, tT);
		ProbI.setText("");
		GravI.setText("");
		RimI.setText("");
		SoppI.setText("");
		AddTag.setText("");
	}
});
Salva.setBounds(218, 203, 76, 29);
InputEquation.add(Salva);

//Panel HistoricData
HistoricData.setVisible(false);
HistoricData.setBounds(0, 0, 400, 447);
f.getContentPane().add(HistoricData);
HistoricData.setLayout(null);
JLabel TitleH = new JLabel("Grafico Stati d'ansia");
TitleH.setBounds(113, 5, 175, 29);
HistoricData.add(TitleH);
TitleH.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
JButton back = new JButton("Torna alla Home");
back.setBounds(130, 400, 140, 29);
HistoricData.add(back);
back.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		Home.setVisible(true);
		NewEntry.setVisible(false);
		HistoricData.setVisible(false);
	}
});
	//table show data
dataviz c = new dataviz();
String[][] datas = c.loadData();
String[] columnNames = { "A", "B","C","D","E" };
JTable DataShow = new JTable(datas, columnNames);
DataShow.setBounds(10, 150, 380, 200);
HistoricData.add(DataShow);
//tag alert
Panel tagAlert = new Panel();
tagAlert.setBounds(10, 55, 380, 50);
tagAlert.setBackground(Color.WHITE);
HistoricData.add(tagAlert);
tagAlert.setLayout(null);
maxAnx rs = maxAnx.tagSearchMax(datas);
JLabel tagAlertLabel = new JLabel(rs.retTagS());
tagAlertLabel.setBounds(6, 26, 100, 16);
tagAlert.add(tagAlertLabel);
JPanel tagColor = new JPanel();

tagColor.setBounds(330, 12, 30, 30);
tagAlert.add(tagColor);
if (rs.retTagF() < 0.82)
	tagColor.setBackground(Color.GREEN);
else if (rs.retTagF() <3)
	tagColor.setBackground(Color.YELLOW);
else
	tagColor.setBackground(Color.RED);
tagColor.setLayout(null);

}
}