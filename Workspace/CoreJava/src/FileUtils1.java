import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;


public class FileUtils1 {

	public static void main(String[] args) {
		String exportedDataFilePath = "D:\\Orcl\\sdm\\EXPORTS\\formDataExport.csv";
		String exportedDataControlFilePath = "D:\\Orcl\\sdm\\CONTROLFILES\\formDataExport_Control.csv";
		
		/*boolean contentMatched =
                FileUtils.contentEquals(new File(exportedDataFilePath), new File(exportedDataControlFilePath));*/
				File genaratedFile = new File(exportedDataFilePath);
				File controlFile = new File(exportedDataControlFilePath);
				String genaratedFileString = null;
				String controlFileString = null;
				
				try {
					genaratedFileString = FileUtils.readFileToString(genaratedFile);
					controlFileString = FileUtils.readFileToString(controlFile);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				genaratedFileString = genaratedFileString.replaceAll("[\\r\\n]", "");
				controlFileString = controlFileString.replaceAll("[\\r\\n]", "");
				System.out.println("genaratedFileString: "+genaratedFileString);
				System.out.println("controlFileString: "+controlFileString);
				System.out.println("C: "+ genaratedFileString.equals(controlFileString));
				
	}
}
