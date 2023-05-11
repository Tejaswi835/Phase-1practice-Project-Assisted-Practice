package assistedprojects;
import java.io.*;
public class operations {
	    public static void main(String[] args) {
	        String fileName = "tippu.txt";
	        createFile(fileName);
	        writeToFile(fileName, "hi guys");
	        String content = readFromFile(fileName);
	        System.out.println("Content: " + content);
	        updateFile(fileName, "my name");
	        content = readFromFile(fileName);
	        System.out.println("Content: " + content);
	        deleteFile(fileName);
	    }
	    public static void createFile(String fileName) {
	        File file = new File(fileName);
	        if (file.exists()) {
	            System.out.println("File already exists");
	            return;
	        }try {
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating file");
	            e.printStackTrace();
	        }
	    }public static void writeToFile(String fileName, String content) {
	        try (FileWriter writer = new FileWriter(fileName)) {
	            writer.write(content);
	            System.out.println("written to the file");
	        } catch (IOException e) {
	            System.out.println("error occurred while writing");
	            e.printStackTrace();
	        }
	    }
	    public static String readFromFile(String fileName) {
	        StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line);
	            }
	        } catch (IOException e) {
	            System.out.println("error occurred while reading");
	            e.printStackTrace();
	        }
	        return content.toString();
	    }
	    public static void updateFile(String fileName, String content) {
	        try (FileWriter writer = new FileWriter(fileName)) {
	            writer.write(content);
	            System.out.println("File updated successfully");
	        } catch (IOException e) {
	            System.out.println("error occurred while updating");
	            e.printStackTrace();
	        }
	    }
	    public static void deleteFile(String fileName) {
	        File file = new File(fileName);
	        if (file.delete()) {
	            System.out.println("File deleted: " + file.getName());
	        } else {
	            System.out.println("Failed to delete the file");
	        }
	    }
	}
