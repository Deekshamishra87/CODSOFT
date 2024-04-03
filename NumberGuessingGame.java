import java.util.Scanner;

import java.util.Random;
class Game {
    int attempts = 0;
    int num;
    int computer;

    Game() {
        Scanner scc = new Scanner(System.in);
        Random c = new Random();
        computer = c.nextInt(100);
    }
    void UserInput() {
        System.out.println("guess number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }
    boolean check() {
        attempts++;
         if(num==computer){
             System.out.println("Hurahhhhh!!!!"+"you guessed it right in " + attempts + " attempts ");
             return true;

         }
          else  if (num > computer) {
                System.out.println("it's Too large guess smaller no. ");
          } else if (num < computer) {
                System.out.println("it's Too small guess larger no. : ...");
          }
             return false;
    }
    void score(){
        if(attempts>10 && attempts<20)
        {
            System.out.println("your score is : 50");
        }
        else if(attempts<7)
        {
            System.out.println("wow your score is :90");
        }
        else if(attempts<2)
        {
            System.out.println("your score is : 100");
        }
    }

    }

        class NumberGame {
        public static void main(String[] arr) {
            Game g = new Game();
            boolean b=false;
            while(!b){
                g.UserInput();
                b = g.check();
                System.out.println(b);

            }
            g.score();

        }
    }