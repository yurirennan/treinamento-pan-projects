package Entradas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) throws FileNotFoundException{
        String path = "./src/arquivo.txt";
        File arquivo = new File(path);
        Scanner scanner = null;
        scanner = new Scanner(arquivo);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
