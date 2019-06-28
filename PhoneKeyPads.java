package phonekeypads;

import java.util.Scanner;

public class PhoneKeyPads {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter:\t");
        char letter = input.next(".").charAt(0);
        byte digit = 0;

        switch (Character.toLowerCase(letter)) {

            case 'a':
            case 'b':
            case 'c':
                digit = 2;
                break;

            case 'd':
            case 'e':
            case 'f':
                digit = 3;
                break;

            case 'g':
            case 'h':
            case 'i':
                digit = 4;
                break;

            case 'j':
            case 'k':
            case 'l':
                digit = 5;
                break;

            case 'm':
            case 'n':
            case 'o':
                digit = 6;
                break;

            case 'p':
            case 'q':
            case 'r':
            case 's':
                digit = 7;
                break;

            case 't':
            case 'u':
            case 'v':
                digit = 8;
                break;

            case 'w':
            case 'x':
            case 'y':
            case 'z':
                digit = 9;
                break;

            default:
                System.out.println("Invalid input!");
                System.exit(0);
        }
        System.out.printf("The corresponding number is:\t%d\n", digit);
    }

}
