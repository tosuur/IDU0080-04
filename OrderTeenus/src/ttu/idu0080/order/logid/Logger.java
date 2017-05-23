package ttu.idu0080.order.logid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

	public void WriteToFile(String args) {
		try (FileWriter fw = new FileWriter("src/ttu/idu0080/order/logid/services_log.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(args);
			// more code
			out.println(args + " 2");
			// more code
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}

	}
	
	public static void main(String[] args){
		Logger logg = new Logger();
		logg.WriteToFile("poop");
	}

}
