public class Main {
    public static void main(String[] args) {
        //задание 1
        double dog = 8;
        double cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задание 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задание 3

        dog =  dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задание 4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задание 5

        double frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //задание 6

        var sportsmanOne = 78.2;
        var sportsmanTwo = 82.7;
        var weightSportsmans = sportsmanTwo + sportsmanOne;
        System.out.println(weightSportsmans);
        //задание 7

        var differenceWeight = sportsmanTwo%sportsmanOne;//остаток от деления
        System.out.println(differenceWeight);
        var diffWeight = sportsmanTwo - sportsmanOne;
        System.out.println(diffWeight);
        //задание 8

        var hours = 640;
        var hoursMans = 8;

        var allMans = hours/hoursMans;
        System.out.println(allMans);

        allMans = allMans + 94;
        var allHours = allMans * hoursMans;
        System.out.println("Если в компании работает " + allMans + " человек, то всего " + allHours + " часов работы может быть поделено между сотрудниками");
    }
}