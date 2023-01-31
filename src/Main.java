import java.util.Arrays;

public class Main {
    public static String removeDuplicatesAndConcatenate(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result += arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] arr = new String[]{"ab", "ef", "cd", "ef", "gh", "ij", "kl", "ab", "mn"};
        Arrays.sort(arr);
        System.out.println(removeDuplicatesAndConcatenate(arr));
    }
}