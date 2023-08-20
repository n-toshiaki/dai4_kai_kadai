import java.util.List;

public class dai4_kai_kadai{

    public static void main(String[] args){

    //ストリーム

        List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,8,9);

        //リストの中の奇数を抽出
        List<Integer> odd_numbers = numbers.stream().filter(odd -> isOdd(odd)).toList();
        System.out.println(odd_numbers);

        //リストの中の奇数の個数を数える
        long odds_count = numbers.stream().filter(odd -> isOdd(odd)).count();
        System.out.println(odds_count);

        //リストの中に0があるか判定
        boolean hasZero = numbers.stream().anyMatch(num -> num == 0);
        System.out.println(hasZero);

    }

    //奇数を判定するメソッド
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }
}