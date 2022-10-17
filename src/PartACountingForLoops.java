import java.util.Scanner;

public class PartACountingForLoops {
    public static void main(String[] args) {
        for(int counter = 0; counter <= 30; counter++){
            System.out.print(counter + " ");
        }

        System.out.println();

        for(int counter = 30; counter >= 0; counter--){
            System.out.print(counter + " ");
        }

        System.out.println();

        for(int counter = 0; counter <= 18; counter+=3){
            System.out.print(counter + " ");
        }

        System.out.println();

        for(int counter = 10; counter >= 0; counter-=2){
            System.out.print(counter + " ");
        }

        System.out.println();
    }
}
