package liked_list;

import java.util.LinkedList;

public class JosephusProblem {
    public static void josephus(int n, int k) {
        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        System.out.println("约瑟夫环问题解决方案:");
        while (!people.isEmpty()) {
            System.out.print(index+"+"+k+"-1%"+people.size()+ "="+(index + k -1) % people.size()+" ");
            index = (index + k - 1) % people.size();
            int eliminatedPerson = people.remove(index);
            System.out.println("出局的人: " + eliminatedPerson);
        }
    }

    public static void main(String[] args) {
        int n = 8; // 8个人
        int k = 5; // 报数为5

        josephus(n, k);
    }
}
