package high_precision_calculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeCheck {
    public static void init(List<Integer> a) {
        String s = "921";
        a.clear();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                a.add(Character.getNumericValue(c));
            } else {
                a.add(c - 'A' + 10);
            }
        }
    }

    public static boolean check(List<Integer> a) {
        List<Integer> copy = new ArrayList<>(a);
        Collections.reverse(copy);
        return a.equals(copy);
    }

    public static void jia(List<Integer> a) {
        List<Integer> b = new ArrayList<>(a);
        Collections.reverse(b);

        int carry = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = a.get(i) + b.get(i) + carry;
            a.set(i, sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            a.add(carry);
        }
    }

    public static void printArray(List<Integer> a) {
        int size = a.size();
        System.out.println("size: " + size);
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        init(a);
        System.out.println("init:");
        printArray(a);

        if (check(a)) {
            System.out.println(0);
        } else {
            int ans = 0;
            while (ans <= 30) {
                ans++;
                jia(a);
                System.out.print("Test: " + ans + "  ");
                printArray(a);
                if (check(a)) {
                    System.out.println(ans);
                    break;
                }
            }
            if (ans > 30) {
                System.out.println("impossible");
            }
        }
    }
}
