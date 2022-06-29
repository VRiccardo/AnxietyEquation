package AEResolutor; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dataviz {  
	//variable
	private int xArray;
	private int yArray;
	private String [][] dataStore ;
	private String fileLoc = "recordAnxietyStatus.txt";
	
	
	//interfaccia con classe
	
	public String[][] loadData() {
		try {
			this.xArray = lineCount();
			this.yArray = 7; 		//default columns inside the csv file
		      File myObj = new File(this.fileLoc);
		      Scanner myReader = new Scanner(myObj);
			  this.dataStore = new String[xArray][yArray];
			  int x = 0;
		      while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          int l = data.indexOf(';');
		          int y = 0;
		          while (l != -1) {
		        	  String cmd = data.substring(0, l);
		        	  dataStore[x][y] = cmd;
		        	  data = data.substring(l+1);
		        	  l = data.indexOf(';');
		        	  y++;
		          }
		        dataStore[x][y] = data;
		        x++;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	return this.dataStore;
}

	private int lineCount() {

		    int count = 0;
		    try {
		      File file = new File(fileLoc);
		      Scanner sc = new Scanner(file);

		      while(sc.hasNextLine()) {
		        sc.nextLine();
		        count++;
		      }

		      sc.close();
		    } catch (Exception e) {
		      e.getStackTrace();
		    }
		    return count;
		  }
	
}