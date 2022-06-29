package AEResolutor;

public class maxAnx {
	private float maxAnxietyTagF;
	private String maxAnxietyTagS;
	
	public maxAnx(String etTag, float maxTag) {
		this.maxAnxietyTagF = maxTag;
		this.maxAnxietyTagS = etTag;
	}
	
	static maxAnx tagSearchMax(String [][] dd){
		String etTag = "";
		float maxTag = 0;
		float conTag = 0;
		int i=0;
		while (i<10) {
			if(dd[i][6] != null) {
				//ciclo if per evitare errore da array
				if(i!=0) {
					conTag = Float.parseFloat(dd[i][0]);
					if (maxTag < conTag)
						maxTag = conTag;
						etTag = dd[i][6];
				}
			}
		i++;
		}
		return new maxAnx(etTag, maxTag);
		
	}
	
	public void printEl() {
		System.out.println(this.maxAnxietyTagF + "," + this.maxAnxietyTagS);
	}

	public String retTagS() {
		return this.maxAnxietyTagS;
	}

	public Float retTagF() {
		return this.maxAnxietyTagF;
	}
	
}
