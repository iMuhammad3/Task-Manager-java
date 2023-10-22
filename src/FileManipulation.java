import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManipulation {
    
    FileManipulation(){}

    void createFile(String fileName){

        File file = new File(fileName);

        try{
            if(file.createNewFile()){
                System.out.println("File created : " + file.getName());
            } else {
                System.out.println("File already exists :)");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    String readFile(String fileName){

        String content = "";
        File file = new File(fileName);

        try(FileReader reader = new FileReader(file)){
            int character;
            while((character = reader.read()) != -1){
                content += (char) character;
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return content;
    }

}
