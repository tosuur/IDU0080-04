package ttu.idu0080.order.logid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	String logPath = null;
	
	public Logger(String path) {
		logPath = path;
	}

	public void WriteToFile(String args) {
		System.out.println("Writing to file");
		try (FileWriter fw = new FileWriter(logPath, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(args);
			// more code
			out.println(args + " 2");
			// more code
		} catch (IOException e) {
			System.out.println(e);// exception handling left as an exercise for the reader
		}
		System.out.println("-------Writed");

	}
	
	public static void main(String[] args){
		Logger logg = new Logger("C://services_log.txt");
		logg.WriteToFile("poop");
	}

}
