import java.io.*;
public class ThrowsDemo {
static void readFile() throws IOException {
FileReader fr = new FileReader("data.txt"); 
fr.close();
}
public static void main(String[] args) {
try {
readFile();
} catch (IOException e) {
System.out.println("File handling error: " + e.getMessage());
}
}
}
