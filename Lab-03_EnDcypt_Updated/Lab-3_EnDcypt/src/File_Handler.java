import java.io.*;

public class File_Handler
{

    public String readFile(String inputFilePath)
    {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                content.append(line).append("\n");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        return content.toString();
    }

    public void createFile(String outputFilePath, String content)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath)))
        {
            writer.write(content);  // Write the entire content to the file
            System.out.println("File created successfully at: " + outputFilePath);
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}