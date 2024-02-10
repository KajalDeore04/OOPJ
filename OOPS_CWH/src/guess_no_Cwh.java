import java.util.Random;
import java.util.Scanner;
class Gamee{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    Gamee() {
        Random r=new Random();
        this.number = r.nextInt(100);
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes u guessed it right,it was %d\n You guessed it in %d attempts",number,noOfGuesses);
            System.out.println("true");
        } else if (inputNumber<number) {
            System.out.println("too less....");
        } else if (inputNumber>number) {
            System.out.println("too high");
        }
        return false;
    }
}


public class guess_no_Cwh {
    public static void main(String[] args) {
        Gamee g=new Gamee();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
