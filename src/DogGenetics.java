import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        Scanner input = new Scanner(System.in);

        System.out.println("What's your dogs name? ");
        String name = input.nextLine();
        System.out.println();

        System.out.println("Here is the report for your dog: " + name);
        System.out.println(name + " is:");
        System.out.println();

        int[] report = generateReport();
        for(int i=0; i<breeds.length; i++){
            System.out.println(report[i] + "% " + breeds[i]);
        }

        System.out.println();
        System.out.println("Amazing dog right there!");
        input.close();
    }

    /**
     * generates a fake report for the program.
     * @return an array with length 5 where all elements sum upto 100.
     */
    public static int[] generateReport(){
        Random rng = new Random();
        int[] report = new int[5];
        int total = 100;

        for(int i=0; i<5; i++){
            if(total>0){
                report[i] = rng.nextInt(total)+1;
                total -= report[i];
            }else{
                report[i] = 0;
            }   
        }

        return report;
    }
}