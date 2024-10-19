import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Encryption Algorithm\n1 - AES\n2 - DES\n3 - CaesarCipher");
        int algo = scanner.nextInt();
        scanner.nextLine();
        System.out.println(algo);

        Algorithm_Handler algoHandler = new Algorithm_Handler();
        switch (algo)
        {
            case 1:
                algoHandler.setAlgorithm(new AES());
                break;
            case 2:
                algoHandler.setAlgorithm(new DES());
                break;
            case 3:
                algoHandler.setAlgorithm(new Caesar_Cipher(5));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        File_Handler fileHandler = new File_Handler();
        System.out.println("Input File path:\n");
        String inputFilePath = scanner.nextLine();

        String fileContent = fileHandler.readFile(inputFilePath);
        System.out.println("Read from input file:\n" + fileContent);

        String encryptedContent = algoHandler.encrypt(fileContent);
        System.out.println("Encrypted content:\n" + encryptedContent);

        System.out.println("Output File path:\n");
        String outputFilePath = scanner.nextLine();
        fileHandler.createFile(outputFilePath, encryptedContent);

        scanner.close();
    }
}