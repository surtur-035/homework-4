
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задание 2");
        byte temperature = 14;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        System.out.println("Задание 3");
        short speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ехать спокойно");
        }

        System.out.println("Задание 4");
        byte transferAge = 1;
        boolean transferAgeToKindergarten = transferAge >= 2 && transferAge <= 6;
        boolean transferAgeToSchool = transferAge >= 7 && transferAge <= 17;
        boolean transferAgeToUniversity = transferAge >= 18 && transferAge <= 24;
        boolean transferAgeToWork = transferAge > 24;
        if (transferAgeToKindergarten) {
            System.out.println("Если возраст человека равен " + transferAge + " то ему нужно ходить в детский сад");
        } else if (transferAgeToSchool) {
            System.out.println("Если возраст человека равен " + transferAge + " то ему нужно ходить в школу");
        } else if (transferAgeToUniversity) {
            System.out.println("Если возраст человека равен " + transferAge + " то ему нужно ходить в университет");
        } else if (transferAgeToWork) {
            System.out.println("Если возраст человека равен " + transferAge + " то ему нужно ходить на работу");
        } else {
            System.out.println("вы еще только родились, не торопитесь..");
        }

        System.out.println("Задание 5");
        byte childAge = 14;
        boolean notAcceptableAge = childAge < 5;
        boolean halfAcceptableAge = childAge >= 5 && childAge < 14;
        boolean acceptableAge = childAge >= 14;
        if (notAcceptableAge) {
            System.out.println("Если возраст ребенка равен " + childAge + " то он не может кататься на аттракционе");
        } else if (halfAcceptableAge) {
            System.out.println("Если возраст ребенка равен " + childAge + " то он может кататься на аттракционе только в сопровождении взрослого");
        } else if (acceptableAge) {
            System.out.println("Если возраст ребенка равен " + childAge + " то может самостоятельно кататься на аттракционе");
        }

        System.out.println("Задание 6");
        short passengers = 59;
        byte trainCapacity = 102;
        byte numberOfSeats = 60;
        boolean freeSeats = passengers < numberOfSeats;
        boolean freeStandingSeats = passengers >= numberOfSeats && passengers < trainCapacity;
        boolean exceedingTrainCapacity = passengers >= trainCapacity;
        if (freeSeats) {
            System.out.println("В вагоне есть сидячее место");
        } else if (freeStandingSeats) {
            System.out.println("В вагоне есть стоячее место");
        } else if (exceedingTrainCapacity) {
            System.out.println("Вагон полностью забит");
        }

        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }
    }
}