import java.io.File;
import java.io.IOException;

public class FileExist {
	
	public static void main(String[] args) {
		String erpiHFM_App_LogFile = "D:\\Orcl\\mywork\\epmmats\\testdata\\ErpiTestData\\ERPIHFM_APP.log";
        
		File file = new File(erpiHFM_App_LogFile);
        if (file.exists())
            file.delete();
        try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
