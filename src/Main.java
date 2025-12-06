public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("==TASK 1==");
        int age = 17; ;
        if (age >=  18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2
        System.out.println("==TASK 2==");
        int temperature = 2;
        if (temperature >= 5){
            System.out.println("Если на улице " + temperature + " градусов, то 'Сегодня тепло, можно идти без шапки.'");
        }else {
            System.out.println("Если на улице " + temperature + " градуса, то 'На улице холодно, нужно надеть шапку.'");
        }

        //Task 3
        System.out.println("==TASK 3==");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }else {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно.");
        }

        //Task 4
        System.out.println("==TASK 4==");
        int personAge = 23;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в садик");
        } else
            if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        }else
            if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        }else
            if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить работу");
        }

        //Task 5
        System.out.println("==TASK 5==");
        int ageKid = 23;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то ему нельзя кататься на аттракционе.");
        }else
            if (ageKid >= 5 && ageKid <= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        }else
            if (ageKid > 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " лет, то ему без сопровождения взрослого.");
        }

        //Task 6
        System.out.println("==TASK 6==");
        int capacityOfTrainCarriage = 102;
        int seat = 60;
        int passengers = 1;
        if (capacityOfTrainCarriage <= passengers){
            System.out.println("Вагон переполнен, свободных мест нет");
        } else if (seat > passengers){
            System.out.println("В вагоне есть сидячие места");
        }else if (passengers > seat && passengers < capacityOfTrainCarriage){
            System.out.println("В вагоне есть стоячие места");
        }

        //Task 7
        System.out.println("==TASK 7==");
        int one = 7;
        int two = 7;
        int three = 7;
        if (one > two && one > three){
            System.out.println("Самое большое число: " + one);
        }else
            if (two > one && two > three){
            System.out.println("Самое большое число: " + two);
        } else
            if (three > one && three > two){
             System.out.println("Самое большое число: " + three);
        }else if (one == two && one == three && two == one && two == three && three == one && three == two){
                System.out.println("Все числа равны");
            }
    }
}