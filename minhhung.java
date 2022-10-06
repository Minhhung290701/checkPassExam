import java.util.Scanner;
public class minhhung {

    /**
     * @param writep
     * @param listenp
     * @return
     */
    public static String checkPasstExam(int writep, int listenp) {
        if(writep < 0 || writep > 70 || listenp < 0 || listenp > 30) {
            return "error";
        }
        if(writep + listenp >= 40) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
 
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input write point: ");
        num1 = sc.nextInt();
 
        System.out.println("Intput listen point: ");
        num2 = sc.nextInt();
 
        sc.close();
        System.out.println(checkPasstExam(num1, num2));
    }
}
