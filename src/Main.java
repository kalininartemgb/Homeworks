//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8.0;
        var cat =  3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

//Task 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);

//Task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("dog - 3.5 = " + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);

//Task 4
        var friends = 19;
        System.out.println("friends = " + friends);

        friends += 2;
        System.out.println("friends + 2 = " + friends);

        friends /= 7;
        System.out.println("friends / 7 = " + friends);

//Task 5
        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog *= 10;
        System.out.println("frog * 10 = " + frog);

        frog /= 3.5;
        System.out.println("frog / 3.5 = " + frog);

        frog += 4;
        System.out.println("frog + 4 = " + frog);

//Task 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        System.out.println("Общая масса 2х боксёров равна: " + (firstBoxerWeight+secondBoxerWeight));
        System.out.println("Разница массы бойцов равна: " + (secondBoxerWeight - firstBoxerWeight));

//Task 7
        var differentBoxersWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двемя весами равен: " + differentBoxersWeight);

//Task 8
        var workTime = 640;
        var workers = workTime / 8;
        System.out.println("Всего работников в компании - " + workers + " человек." );

        var allWorkers = workers + 94;
        var newWorkTime = allWorkers * 8;
        System.out.println("Если в компании работает " + allWorkers  + " человек, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками.");


    }
}