import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        
        //Catch block
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        }

        catch (IOException e) {
            System.out.println("Could not find file E://file.txt");
        }

        System.out.println("This will print. The program will not crash.");
        //Unreported exception FileNotFoundException; must be caught or declared to be thrown

        //If we do a throws exception block the program will crash

        //When your program detects an error, you have to create the error object and manually throw it
        //throw new theException();

        //finally keyword always executes the code no matter what
    }
}