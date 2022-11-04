//A Pentagonal Number corresponds to dots arranged in pentagon.
//The First four pentagonal numbers are 1, 5, 12, 22
//The Formula is (n(3n-1)/2)

public class nov_4_2022_2 {
    public static void main(String[] args) {
        findPentagonalNumber(10);
    }
    public static void findPentagonalNumber(int depth){
        if(depth < 111) {
            System.out.print("This is the " + depth + " Pentagonal number: ");
            System.out.println((depth * ((3 * depth) - 1) / 2));
            depth++;
            findPentagonalNumber(depth);
        }
    }
}
