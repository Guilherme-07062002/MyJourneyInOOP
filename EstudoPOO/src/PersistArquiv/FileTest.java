
package PersistArquiv;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            boolean exists = (file.exists());
            //metodos da classe file:
            System.out.println("Permissão de leitura? "+file.canRead());
            System.out.println("Path: "+file.getPath());
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("is Directory: "+file.isDirectory());
            System.out.println("Arquivo oculto? "+file.isHidden());
            System.out.println("last Modify? "+new Date(file.lastModified()));
            if(exists){
                System.out.println("Deletado ? "+file.delete()); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
