public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var figter  = 78.2;
        System.out.println(figter);
        var figter2 = 82.7;
        System.out.println(figter2);
        var theTotalWeight = figter + figter2;
        System.out.println(theTotalWeight);

        System.out.println("Задача 7");
        var weightDDifference = figter2 - figter;
        System.out.println(weightDDifference);
        var weightDDifference2 = theTotalWeight % figter;
        System.out.println(weightDDifference2);

        System.out.println("Задача 8");
        var hoursOfOperation = 640;
        System.out.println(hoursOfOperation);
        var hours = 8;
        System.out.println(hours);
        var employee = hoursOfOperation / hours;
        System.out.println("Всего работников в компании - " + employee + " человеек");
        var allEmployee = employee + 94;
        System.out.println(allEmployee);
        var allHours = hoursOfOperation / allEmployee;
        System.out.println(allHours);
        System.out.println("Если в компании работант " + allEmployee + " человека, то всего " + allHours + " часа работы может быть поделено можду сотрудниками");


    }
}