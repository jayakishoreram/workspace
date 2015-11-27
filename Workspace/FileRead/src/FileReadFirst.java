import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class FileReadFirst {

	public static void main(String[] args) {
		System.out.println("Mail: ***");
		FileReadFirst first = new FileReadFirst();
		String fileString = "D:\\Orcl\\ERPIHFM_APP.log";
		File file = new File(fileString);
		System.out.println("IS FILE EXISTS: "+file.exists());
		try {
			int ctr = first.delay(file, 75);
			System.out.println("AFTER RETURN DELAY: "+ctr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    /**
     * Delaying the process , waitng for the file to have some content
     * 
      * @param f
     * @param loop
     * @return
     * @throws IOException
     */
     public int delay(File f, int loop) throws IOException {
                     // 10 minutes==600 seconds. Loop 60 times with 10 seconds waits
                     int ctr = 1;
                     long lengthBefore = 0;
                     long length = 0;
                     final String checkStr = "Elapsed time:";
                     boolean breakloop = false;
                     System.out.println("IN DELAY BEFORE LOOP");
                     while (ctr++ <= loop) {
                         if(breakloop){
                                       return ctr;
                                     }
                         			 System.out.println("BEFORE INT DELAY");
                                     delay(10);
                                     System.out.println("AFTER INT DELAY");
                                     RandomAccessFile reader = null;
                                     length = f.length();
                                     System.out.println("LENGTH:  "+length);
                                     if (length > lengthBefore) {                                              
                                                     reader = new RandomAccessFile(f, "r");
                                                     reader.seek(lengthBefore);
                                                     String line = null;
                                                     System.out.println("CTR: "+ctr);
                                                     while (!((line = reader.readLine()) == null)) {
                                                    	 			 if (line.contains(checkStr)) {
                                                                        System.out.println("Success FOUND ELAPSED");
                                                                        delay(3);
                                                                        breakloop = true;
                                                                        break;
                                                                     }
                                                     }  
                                                     lengthBefore = length;
                                     }
                     }
                     System.out.println("CTR  :"+ctr);
                     return ctr;
     }
         
  /**
   *
   * @param sec
   */
  private void delay(int sec) {
      try {
          Thread.sleep(sec * 1000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
