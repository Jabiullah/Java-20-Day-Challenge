package array_week_1;

public class arrayBasic_2 {
    public static void main(String[] args) {
        String names []= {"Sadia", "Sufia", "Sahajanaz" , "Safia", "Shah Poran"};
        for(String s: names){
            System.out.println(s);
        }

        Character vowels [] ={'a','e','i','o','u'};
        System.out.print("Vowels -> ");
        for(Character ch: vowels){
            System.out.print(ch+" ");
        }
        //-----------------------------------------------------------
        //A : 65 Z : 90                                a : 97 z: 122
        System.out.println();
        char a = 'A';
        char b = 'B';
        int c = a+b;            // 65+66 = 131
        System.out.println(c);

    }
}
