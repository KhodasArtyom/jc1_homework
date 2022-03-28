package my.homework;

public class Task31 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for(int i = 0;i < 100_000_000;i++) {
            str = str + "aaabbbccc";

        }
        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i < 100_000_00;i ++) {
            sb.append("aaabbbccc");
        }
        System.out.println(System.currentTimeMillis() - start2);


    }

}


