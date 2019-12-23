package day27;

import java.util.Scanner;

public class Task_2DArrayVersion {

    public static void main(String[] args) {

//        Excel Task 2D Array Version:
//        You have Excel sheet with 6 rows and 4 columns
//        and it contains below data:
//        First store those data in 2 dimensional array
//        then write a logic to print out in below format.
//        Below output is expected from your program:
//        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
//        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
//        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
//        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
//        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
//        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34

//        Additional Task on this :
//        1, Write a program to ask user row and column number and return the value in that cell.
//        if it's invalid row or column number , it should print invalid input.
//        for example : row 1 and column 4 has 84
//        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
//        Optionally : keep asking user until the user input row and column are not out of range.
//        2, Write a program to search a value in excel and print the all location of the value :
//        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)
//        3, Write a program to ask user for column number and print only that column data :
//        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33

        int[][] numbers = { {78,54,100,84} , {33,44,77,123} , {12,88,52,76} , {67,33,98,67} , {12,88,52,45} , {67,33,98,34}};

        // TASK START
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print("Cell("+(i+1)+","+(j+1)+")= "+numbers[i][j]+"  ");
            }
            System.out.println();
        }

        // TASK-1
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        do {
            System.out.println("Please enter row number:");
            i = scan.nextInt();
            System.out.println("Please enter column number:");
            j = scan.nextInt();
            if (i-1 >= numbers.length || j-1 >= numbers[i-1].length){
                System.out.println("Invalid input");
            }
            else {
                System.out.println("The number stored in cell("+i+","+j+") is "+numbers[i-1][j-1]);
            }
        } while (i-1 < numbers.length && j-1 < numbers[i-1].length);

        // TASK-2
            System.out.println("Please enter a number that you want to find in which cell it is:");
            int number = scan.nextInt();
            for (int k = 0; k < numbers.length; k++) {
                for (int l = 0; l < numbers[k].length; l++) {
                    if (numbers[k][l] == number) {
                        System.out.print(number + " is found in Cell(" + (k + 1) + "," + (l + 1) + ")  ");
                    }
                }
            }
        System.out.println();

        // TASK-3
        System.out.println("Please enter a column number:");
        int column = scan.nextInt();
        for (int m = 0; m < numbers.length; m++) {
            System.out.print(numbers[m][column-1]+" ");
        }
    }
}

