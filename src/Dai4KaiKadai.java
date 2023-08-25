import java.util.List;

public class Dai4KaiKadai {

    public static void main(String[] args){

        //ストリーム

        List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,8,9);

        //リストの中の奇数を抽出
        List<Integer> oddNumbers = numbers.stream().filter(odd -> isOdd(odd)).toList();
        System.out.println(oddNumbers);

        //リストの中の奇数の個数を数える
        long oddsCount = numbers.stream().filter(odd -> isOdd(odd)).count();
        System.out.println(oddsCount);

        //リストの中に0があるかを判定
        boolean hasZero = numbers.stream().anyMatch(num -> num == 0);
        System.out.println(hasZero);

    }

    //奇数を判定するメソッド
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }
}