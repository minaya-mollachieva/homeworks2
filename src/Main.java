public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        //присвоить переменной cat значение 3.6;
        var cat = 3.6;
        System.out.println(cat);
        // переменной paper значение 763789
        var paper = 763789;
        System.out.println(paper);
        //Увеличить значение каждой перечисленной переменной на 4
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        //Уменьшение каждой переменной
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Инициализировать (присвоить значение) переменную friend значением 19
        var friend=19;
        System.out.println(friend);
        //Увеличить значение переменной на 2
        friend=friend+2;
        System.out.println(friend);
        //Поделить значение переменной на 7
        friend=friend/7;
        System.out.println(friend);
        //Инициализировать переменную frog значением 3.5.
        var frog=3.5;
        System.out.println(frog);
        //Увеличить переменную в 10 раз и поделите на 3.5. Добавить к последнему значению переменной 4.
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        //Масса боксеров
        var FighterWeight1=78.2;
        System.out.println("Масса одного боксера-"+FighterWeight1+"кг");
        var FighterWeight2=82.7;
        System.out.println("Масса второго боксера-"+FighterWeight2+"кг");
        var TotalWeight=FighterWeight1+FighterWeight2;
        //Общая масса обоих бойцов
        System.out.println("Общая масса двух бойцов-"+TotalWeight+"кг");
        //Разница между массами бойцов
        var DifferenceWeight=FighterWeight2-FighterWeight1;
        System.out.println("Разница между массами бойцов-"+DifferenceWeight+"кг");
        //Остаток от деления двух масс
        var FruitWeight=17;
        System.out.println("Фруктов-"+FruitWeight+"кг");
        var VegitableWeight=30;
        System.out.println("Овощей-"+VegitableWeight+"кг");
        var Overload=VegitableWeight%FruitWeight;
        System.out.println("Перегруз-"+Overload+"кг");
        //Рабочие часы поделены между сотрудниками
        var workingHours=640;
        System.out.println("Общее количество часов-"+workingHours+"ч");
        var timeForOneEmployee=8;
        System.out.println("Часы работы одного сотрудника-"+timeForOneEmployee+"ч");
        var numberOfEmployees=workingHours/timeForOneEmployee;
        System.out.println("Всего работников в компании —"+numberOfEmployees+"человек");
        numberOfEmployees=numberOfEmployees+94;
        workingHours=numberOfEmployees*timeForOneEmployee;
        System.out.println("Если в компании работает "+numberOfEmployees + " человека, то всего "+workingHours+" часов работы может быть поделено между сотрудниками");
    }
}