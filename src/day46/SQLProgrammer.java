package day46;

public class SQLProgrammer extends Programmer{

    @Override
    void code(){
        System.out.println("Writing SQL Query!!!");
    }

    @Override
    void test(){
        super.test();
        System.out.println("We do test SQL Query");
    }

    public void writeSQLQuery(){
        System.out.println("Writing SQL Query");
    }
}
