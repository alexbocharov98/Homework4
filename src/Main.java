public class Main {
    public static void main(String[] args) {
        byte age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temp = 7;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        byte speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int age2 = 45;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }

        int age1 = 4;
        if (age1 <= 5) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на атракционе");
        }
        if (age1 > 5 && age1 <= 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на атракционе в сопровождении взрослого");
        }
        if (age1 > 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на атракционе без сопровождении взрослого");
        }


        int place = 60;
        if (place <= 102) {
            System.out.println("В вагоне есть сидячие или стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }

        int one = 1;
        int two = 7;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}