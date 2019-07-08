package inputOutput;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ConsoleToFile {

    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter("from_console.txt");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();

        out.print("My name is");
        out.print(" ");
        out.print(name);
        out.print(". I am ");
        out.print(age);
        out.print(" years old.");
        out.flush();

        List<String> lines = Files.readAllLines(Paths.get("from_console.txt") , Charset.defaultCharset());

        System.out.println("Input: ");
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println(" has been written to the file from_console.txt");
    }
}
