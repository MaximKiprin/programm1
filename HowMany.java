import java.util.Scanner;

public class HowMany {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Print");
        String input = sc.nextLine();

        int count = 0;

        if(input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("You write:"+count+"word");
        }
}