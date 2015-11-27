import java.io.File;
import java.io.IOException;


public class TestPath {

	public static void main(String[] args) {
		
	    String erpiHFM_App_BatchFile = "D:\\Orcl\\mywork\\epmmats\\testdata\\ErpiTestData\\ERPIHFM_App.bat";
	    String erpiHFM_App_TextFile = "D:\\Orcl\\mywork\\epmmats\\testdata\\ErpiTestData\\ERPIHFM_APP.txt";
	    String erpiHFM_App_LogFile = "D:\\Orcl\\mywork\\epmmats\\testdata\\ErpiTestData\\ERPIHFM_APP.log";
	    String build_Prop_File = "D:\\Orcl\\mywork\\epmmats\\build_artifacts\\build.properties";
	    executeHat(erpiHFM_App_LogFile, erpiHFM_App_TextFile, build_Prop_File, 75);

	}
	
    public static void executeHat(String logFile, String inputFile, String propertieFile, int delayCount){
        String hatPath = "E:\\DTE\\WORK\\oracle\\Middleware\\EPMSystem11R1\\products\\FinancialManagement\\Common\\HatEx_x64.exe";
        String processString = hatPath + " -E0 -R0 -O\""+ logFile+"\" -I\""+inputFile+"\" -M\""+propertieFile+"\"";
        String procStrg = hatPath;
        System.out.println("*********************HATHATHAT BEGIN");
        System.out.println("LOG FILE : "+logFile);
        System.out.println("INPUT FILE : "+inputFile);
        System.out.println("PROPERTIE FILE : "+propertieFile);
        System.out.println("PROCESS STRING : "+processString);
        System.out.println("*********************HATHATHAT END");
        Process process = null;
        File file = new File(inputFile);
        try {
        	System.out.println("Start process");
            process = new ProcessBuilder(processString).start();
            System.out.println("End process");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            //return false;
        }
        
        
    }

}

//%TEST_HOME%\tests\hfmhat\hatEx.exe -E0 -R0 -O"%TEST_HOME%\tests\hfmhat\erpi\ERPIHFM_App.log" -I"%TEST_HOME%\tests\hfmhat\erpi\ERPIHFM_App.txt" -M%TEST_HOME%\qebuild\build.properties"