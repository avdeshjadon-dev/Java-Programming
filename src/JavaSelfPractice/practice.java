package JavaSelfPractice;

public class practice {

    static int uniqueNumber(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return index;
    }

    static int repeat(int[] arr) {
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    num = arr[i];

                    break;
                }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(repeat(arr));
    }
}
