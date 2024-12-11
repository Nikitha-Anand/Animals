import java.io.*;

public class Animals {
    public static String[] Animal = new String[20];
    public static String[] Colour = new String[10];

    public static Integer AnimalTopPointer = 0;
    public static Integer ColourTopPointer = 0;

    //Push an animal into the Animal stack implemented using an 1D arary
    public static Boolean PushAnimal(String DataToPush){
        if(AnimalTopPointer == 20){
            return false;
        } else{
            Animal[AnimalTopPointer] = DataToPush;
            AnimalTopPointer = AnimalTopPointer + 1;
            return true;
        }
    }

    //Pop an animal from the Animal stack implemented using an 1D arary
    public static String PopAnimal(){
        String ReturnData;
        if (AnimalTopPointer == 0) {
            return "";
        } else{
            ReturnData = Animal[AnimalTopPointer - 1];
            AnimalTopPointer = AnimalTopPointer - 1;
            return ReturnData;
        }
    }

    //Read animal names from files "Animal.txt" and "Colours.txt", then pushes them into respective stacks
    public static void ReadData(){
        String line;
        File file = new File("AnimalData.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            while((line = reader.readLine()) != null){
                PushAnimal(line);
            }
        } catch(FileNotFoundException notFoundException){
            System.out.println("File not found");
        } catch(IOException ioException){
            System.out.println("IO Exception");
        }

        String line1;
        File file1 = new File("ColourData.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(file1))){
            while((line1 = reader.readLine()) != null){
                PushColour(line1);
            }
        } catch(FileNotFoundException notFoundException){
            System.out.println("File not found");
        } catch(IOException ioException){
            System.out.println("IO Exception");
        }
    }

    //Push the colour of an animal into Colour stack implemented using an 1D arary
    public static Boolean PushColour(String DataToPush){
        if(ColourTopPointer == 10){
            return false;
        } else{
            Colour[ColourTopPointer] = DataToPush;
            ColourTopPointer = ColourTopPointer + 1;
            return true;
        }
    }

    //Pop the colour of an animal from the Colour stack implemented using an 1D arary
    public static String PopColour(){
        String ReturnData;
        if (ColourTopPointer == 0) {
            return "";
        } else{
            ReturnData = Colour[ColourTopPointer - 1];
            ColourTopPointer = ColourTopPointer - 1;
            return ReturnData;
        }
    }

    //Pops the next item from both animal and colour stack and then outputs them in a single line
    public static void OutputItem(){
        String Animal1 = PopAnimal();
        String Colour1 = PopColour();
        if(Animal1 != "" && Colour1 != ""){
            System.out.println(Colour1 + " " + Animal1);
        } else{
            if(Animal1 == ""){
                PushColour(Colour1);
                System.out.println("No Animal");
            } else{
                PushAnimal(Animal1);
                System.out.println("No Colour");
            }
        }
    }

    public static void main(String[] args){
        ReadData();
        for (int i = 0; i < 4; i++) {
            OutputItem();
        }
    }
}
