import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alphabet {
    private String fileName;
    private String letters;
    private String number;

    public Alphabet(String fileName, String letters, String number) {
        this.fileName = fileName;
        this.letters = letters;
        this.number = number;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void fileWriter(){
        try (FileWriter fileWriter = new FileWriter(getFileName() + ".txt")){
            fileWriter.write(getLetters());
            fileWriter.write(getNumber());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void filReader(){
        try (FileReader fileReader = new FileReader(getFileName() + ".txt")){
            Scanner scanner = new Scanner(fileReader);
            int counter = 1;
            while (scanner.hasNextLine()){
                System.out.println(counter + ": " + scanner.nextLine());
                counter++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
