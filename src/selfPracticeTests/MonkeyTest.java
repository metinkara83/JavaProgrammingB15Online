package selfPracticeTests;

public class MonkeyTest {

    public static void main(String[] args) {

        int monkey = 5;
        while (monkey > 1) {
            System.out.println(monkey+" little monkeys jumping on the bed,"+"\nOne fell down and bumped his head,"+
                    "\nMama called the doctor and the doctor said,"+"\nNo more monkeys jumping on the bed!");
            --monkey;
        }
        while (monkey == 1) {
            System.out.println(monkey+" little monkey jumping on the bed,"+"\nOne fell down and bumped his head,"+
                    "\nMama called the doctor and the doctor said,"+"\nNo more monkeys jumping on the bed!");
            --monkey;
        }
        System.out.println("Put those monkeys right to bed!");
    }

    /*
    5 little monkeys jumping on the bed,
    One fell down and bumped his head,
    Mama called the doctor and the doctor said,
    No more monkeys jumping on the bed!
            4 little monkeys jumping on the bed,
    One fell down and bumped his head,
    Mama called the doctor and the doctor said,
    No more monkeys jumping on the bed!
            3 little monkeys jumping on the bed,
    One fell down and bumped his head,
    Mama called the doctor and the doctor said,
    No more monkeys jumping on the bed!
            2 little monkeys jumping on the bed,
    One fell down and bumped his head,
    Mama called the doctor and the doctor said,
    No more monkeys jumping on the bed!
            1 little monkey jumping on the bed,
    One fell down and bumped his head,
    Mama called the doctor and the doctor said,
    No more monkeys jumping on the bed!
    Put those monkeys right to bed!

     */
}
