import java.util.*;
import java.io.*;

public class JavaCSV {
	
	private int[][] Data;
	private String[] stringData;
	private String stringDataFinal;
	private String fileName = "test.csv";
	
	public JavaCSV(int[][] data) {
		this.Data = data;
	}
	
	private void format() {
		for (int i = 0; i < Data.length; i++) {
		   	stringData[i] = Data[i].toString();
		   	stringData[i] = stringData[i].substring(1,stringData[i].length());
		}
		
		for (int i = 0; i < stringData.length; i++) {
			stringDataFinal+=stringData[i];
			stringDataFinal+="\n";

		   	stringData[i] = stringData[i]getClass().substring(1, stringData[i].length());
		}
		
		for (int i = 0; i < stringData.length(); i++) {
			stringDataFinal += stringData[i];
			stringDataFinal += "\n";
		}
		
		FileWriter document = new FirleWriter(fileName);
		BufferedWriter bufDocument = new BufferedWriter(document);
		bufDocument.write(stringDataFinal);
		bufDocument.close();
	}
}

