
import java.util.Arrays;


public class Medium_100_Questions {

    private static int num[] = {9, 3, 3, 1, 6, 5, 4, 2, 7, 8};

    private static String str[] = {"Manday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void solution_01(int num[]){

        System.out.println("Find the Sum of All Elements in a List");

        Integer sum = Arrays.stream(num).reduce(0, (m,n)->m+n);

        System.out.println("Sum of elements :"+sum);
    }

    public static void solution_02(int num[]){

        System.out.println("Find the Product of All Elements in a List");

        Integer product = Arrays.stream(num).reduce(1, (a,b)->a*b);

        System.out.println("Product of elements :"+ product);
    }

    // public static void solution_03(int num[]){

    //     System.out.println("Find the Average of All Elements in a List");

        
    //     Double average = Arrays.asList(num).stream().mapToInt(Integer::intValue)

    //     System.out.println("Average of elements :"+ average);
    // }





    public static void main(String[] args) {
        System.out.println("*****Medium 100 Questions*****");

        Medium_100_Questions.solution_01(num);
        Medium_100_Questions.solution_02(num);
        // Medium_100_Questions.solution_03(num);



        
    }
}