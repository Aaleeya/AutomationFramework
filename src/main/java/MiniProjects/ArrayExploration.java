package MiniProjects;

public class ArrayExploration {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int total = 0;

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        System.out.println(total);
    }
}
