
public class AppProblem3 {

    public static void main(String[] args) {

        int number = 33;
        int answer = 0;

        String numbers = "";

        for (int i = 1; i <= number; i++) {
            numbers += String.valueOf(i);
        }

        System.out.println(numbers);

        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '3') {
                answer++;
            }
            if (numbers.charAt(i) == '6') {
                answer++;
            }
            if (numbers.charAt(i) == '9') {
                answer++;
            }
        }
        System.out.println(answer);
    }

}
