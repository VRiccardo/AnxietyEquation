package AEResolutor;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.time.LocalDate; 

public class outputSave {
	
	//stato interno
		private float Prob = 0;
		private float Grav = 0;
		private float Rime = 0;
		private float Sopp = 0;

	//costruttori

	public void InsertNewPar(String _Prob, String _Grav, String _Rime, String _Sopp, String _tag)
	{
		try {
		this.Prob = Integer.parseInt(_Prob);
		this.Grav = Integer.parseInt(_Grav);
		this.Rime = Integer.parseInt(_Rime);
		this.Sopp = Integer.parseInt(_Sopp);
		LocalDate TimeReg = LocalDate.now();
		JOptionPane.showMessageDialog(null, "Parametri registrati con successo");
			try {
				String filename= "recordAnxietyStatus.txt";
				FileWriter fw = new FileWriter(filename,true);
				fw.write(CalcEqAn() + ";" + _Prob + ";" + _Grav + ";" + _Rime + ";" + _Sopp + ";" + TimeReg + ";" + _tag + "\n");
				fw.close();
				System.out.println("Successfully wrote to the file.");
		    	} catch (IOException e) {
		    		System.out.println("An error occurred.");
		    		e.printStackTrace();
		    	}
		} catch (NumberFormatException e1) {
			System.out.println("wrong format!");
			JOptionPane.showMessageDialog(null, "Parametri non registrati causa errori di immissione");
		}
	}

	public float CalcEqAn()
	{
		float EqAn = (this.Prob*this.Grav)/(this.Rime*this.Sopp);
		return EqAn;
		//System.out.println();
	}

	public void print()
	{
		System.out.println(Prob);
	}
	}  


	  