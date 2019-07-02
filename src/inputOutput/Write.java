package inputOutput;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Write {

    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter("file.txt");
        String name = "Ja";
        String surName = "Kowalska";
        double salary = 1234567;

        out.print(name);
        out.print(" ");
        out.println(surName);
        out.print(salary);
        out.print("cos tam");
        out.flush();

        List<String> lines = Files.readAllLines(Paths.get("file.txt") , Charset.defaultCharset());

        for (String line : lines) {
            System.out.println(line);
        }

        long size = Files.size(Paths.get("file.txt"));

        System.out.println(lines.size());
        System.out.println(size);

    }
}
