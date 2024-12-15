import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class FilesDemo
{
    public static void main(String[] args) {
        
        Path path = Paths.get("example.txt");
        Path destination = Path.of("copy_example.txt");
        if(Files.notExists(path))
        {
            try {
                Files.createFile(path);
                System.out.println("File Created");
                Files.copy(path, destination);
                System.out.println("File Copied");
                Files.delete(destination);
                System.out.println("File Deleted");

                Files.writeString(Path.of("data.txt"), "Hello, Modern Java!", StandardOpenOption.CREATE);
                String content = Files.readString(Path.of("data.txt"));
                System.out.println(content);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("File Created");
        }
    }
}