
public class FileRead {

	public static void main(String[] args) {
		
	}
	
    /*public int doPool_VerifyOutput(String fileName, int loop, String chkStr) throws Exception {
        //10 minutes==600 seconds.  Loop 60 times with 10 seconds waits
        File file = new File(fileName);
        //if (file.exists())
        //    file.delete();
        //file.createNewFile();
        chkStr = chkStr.toLowerCase();
        int ctr = 1;
        while ((true) && (ctr++ <= loop)) {
            delay(10);
            String logFileContent = FileUtils.readFileToString(file);
			   System.out.println("LOG FILE CONTENT: "+logFileContent+ " CTR: "+ctr);
            if (logFileContent.toLowerCase().indexOf(chkStr) > -1) {
                delay(3);
                return ctr;
            } else
                continue;
        }
        return ctr;
    }*/
    
    private void delay(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	
}
