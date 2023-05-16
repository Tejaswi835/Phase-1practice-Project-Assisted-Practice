package filehandling;
import java.io.*;
public class filehandling {
	public static void main(String[] args) {
	        String filename = "tejudoc.text";
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
	            writer.write("file handling:doc1,doc2,doc3");
	            writer.newLine();
	            writer.write("document1:this is my file program in file handling");
	            writer.newLine();
	            writer.write("document2:excited to do more problems");
	            writer.newLine();
	            writer.write("document3:ready to challenge new logics");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
	            writer.newLine();
	            writer.write("Appending to above doc");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	}



