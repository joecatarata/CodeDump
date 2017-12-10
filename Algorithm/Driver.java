import java.util.Scanner;

public class Driver{

    public static void main(String[] args){

        int m=0, n=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input m: ");
        m = sc.nextInt();
        System.out.print("Input n: ");
        n = sc.nextInt();

        System.out.print(m);
        Algorithm a = new Algorithm(m,n);
        a.showGrid();

        int choice = -1;
        do{
            a.showMenu();
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: a.floodFill(0,0,'X');
                        break;
                case 2: //a.floodFill(0,0,'X');
                        break;
            }
            a.initializeGrid(a.getWidth(), a.getLength());
        }while(choice != 0);
    }
}
