import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.StandardOpenOption;


public class FavouriteAnimals {

    public static void main(String[] args) {
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them
        writeAnimals();

        if (args == null){
            System.out.println("Here you will write animals");
        }
        if(args.length == 1){
            System.out.println("No animals");
        }

        if(args.length > 0 && args[0].equals("w")){
            writeAnimals();
        }
    }
    public static void writeAnimals(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the animal!");
        String animal = sc.nextLine();

        List <String> content = new ArrayList<>();
        content.add(animal);
        content.add("spider");
        int lines = sc.nextInt();
        try{
            Path myPath = Paths.get("src/favourites.txt");
            for (int i = 0; i <lines ; i++) {
                Files.write(myPath, content, StandardOpenOption.APPEND);
            }

        }catch (IOException e){

            System.out.println("Unable to write");
        }
    }

}

