import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class FileReadLast {

	public static void main(String[] args)  {
	    java.io.RandomAccessFile fileHandler = null;
	    int lines = 3;
	    try {
	        fileHandler = 
	            new java.io.RandomAccessFile( "D:\\JK\\Workspace\\FileRead\\src\\ERPIHFM_VerifyData.log", "r" );
	        long fileLength = fileHandler.length() - 1;
	        StringBuilder sb = new StringBuilder();
	        int line = 0;

	       // for(long filePointer = fileLength; filePointer != -1; filePointer--){
	            fileHandler.seek( fileLength );
	            String readLine = fileHandler.readLine();

	            /*if( readByte == 0xA ) {
	                if (line == lines) {
	                    if (filePointer == fileLength) {
	                        continue;
	                    } else {
	                        break;
	                    }
	                }
	            } else if( readByte == 0xD ) {
	                line = line + 1;
	                if (line == lines) {
	                    if (filePointer == fileLength - 1) {
	                        continue;
	                    } else {
	                        break;
	                    }
	                }
	            }
	           sb.append( ( char ) readByte );*/
	           System.out.println("READ LINE: "+readLine);
	      //  }

	        /*sb.deleteCharAt(sb.length()-1);
	        String lastLine = sb.reverse().toString();
	        System.out.println("LAST TWO LINES: "+lastLine);*/
	    } catch( java.io.FileNotFoundException e ) {
	        e.printStackTrace();
	    } catch( java.io.IOException e ) {
	        e.printStackTrace();
	    }finally {
	        if (fileHandler != null )
	            try {
	                fileHandler.close();
	            } catch (IOException e) {
	                /* ignore */
	            }
	    }
	    }
	
	public static void main1(String[] args)  {
	    java.io.RandomAccessFile fileHandler = null;
	    int lines = 3;
	    try {
	        fileHandler = 
	            new java.io.RandomAccessFile( "D:\\JK\\Workspace\\FileRead\\src\\abc.txt", "r" );
	        long fileLength = fileHandler.length() - 1;
	        StringBuilder sb = new StringBuilder();
	        int line = 0;

	        for(long filePointer = fileLength; filePointer != -1; filePointer--){
	            fileHandler.seek( filePointer );
	            int readByte = fileHandler.readByte();

	            if( readByte == 0xA ) {
	                if (line == lines) {
	                    if (filePointer == fileLength) {
	                        continue;
	                    } else {
	                        break;
	                    }
	                }
	            } else if( readByte == 0xD ) {
	                line = line + 1;
	                if (line == lines) {
	                    if (filePointer == fileLength - 1) {
	                        continue;
	                    } else {
	                        break;
	                    }
	                }
	            }
	           sb.append( ( char ) readByte );
	        }

	        sb.deleteCharAt(sb.length()-1);
	        String lastLine = sb.reverse().toString();
	        System.out.println("LAST TWO LINES: "+lastLine);
	    } catch( java.io.FileNotFoundException e ) {
	        e.printStackTrace();
	    } catch( java.io.IOException e ) {
	        e.printStackTrace();
	    }finally {
	        if (fileHandler != null )
	            try {
	                fileHandler.close();
	            } catch (IOException e) {
	                /* ignore */
	            }
	    }
	    }
	
 /*   *//**
    * Delaying the process , waitng for the file to have some content
    * 
     * @param f
    * @param loop
    * @return
    * @throws IOException
    *//*
    public int delay(File f, int loop) throws IOException {
                    // 10 minutes==600 seconds. Loop 60 times with 10 seconds waits
                    int ctr = 1;
                    long lengthBefore = 0;
                    long length = 0;
                    final String checkStr = "Elapsed time:";
                    boolean breakloop = false;
                    while ((true) && (ctr++ <= loop)) {
                        if(breakloop){
                                      return ctr;
                                    }
                                    delay(10);
                                    RandomAccessFile reader = null;
                                    String logFileContent = FileUtils.readFileToString(f);
                                    if ((length = f.length()) > lengthBefore) {                                              
                                                    reader = new RandomAccessFile(f, "r");
                                                    reader.seek(lengthBefore);
                                                    lengthBefore = length;
                                                    String line = null;
                                                    while (!((line = reader.readLine()) == null)) {
                                                                    if (line.contains(checkStr)) {
                                                                       delay(3);
                                                                       breakloop = true;
                                                                       break;
                                                                    }
                                                    }                                                              
                                    }
                    }
                    return ctr;
    }*/

	}