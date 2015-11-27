import java.io.IOException;


public class CallBat {

	public static void main(String[] args) {
		try {
			Process process = Runtime.getRuntime().exec("E:\\JK_Basu_test\\epmmats\\testdata\\files\\ERPI\\Execute_ARM_DataLoad_Snapshot.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
