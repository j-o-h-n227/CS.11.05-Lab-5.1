public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1]);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {sum += i;}
        return sum;
    }

    public static double average(int[] array) {
        double avg = (double) sum(array) / (double) array.length;
        double a = avg * 100;
        int b = (int) a;
        return (double) b / 100;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {min = i;}
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {max = i;}
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {count += 1;}
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] arr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            arr[array.length - 1 - i] = array[i];
        }
        return arr;
    }

    public static void reverseTwo(int[] array) {
        int s = 0;
        int e = array.length - 1;
        while (s < e) {
            int temp = array[s];
            array[s] = array[e]; array[e] = temp;
            s++; e--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i : array) {
            if (i == num) {return true;}
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String i : array) {
            if (i.equals(str)) {return true;}
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String output = "";
        for (int i = 0; i < array.length-1; i++) {
            output += array[i] + ", ";
        }
        return output + array[array.length - 1];
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == num) {return true;}
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }
    }


}
