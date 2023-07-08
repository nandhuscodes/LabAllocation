import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt(), n = scanner.nextInt(), l1 = x - n, l2 = y - n, l3 = z - n, min = Integer.MAX_VALUE;
        if(l1>=0 && min > l1){
            min = l1;
        }
        if(l2>=0 && min > l2){
            min = l2;
        }
        if(l3>=0 && min > l3){
            min = l3;
        }
        if(min == l1){
            System.out.println("L1");
        } else if (min == l2) {
            System.out.println("L2");
        } else if (min == l3) {
            System.out.println("L3");
        }else{
            System.out.println("No Lab is sufficient");
        }
    }
}
