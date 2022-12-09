import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Happy birthday to you");
        } else {
            System.out.println("not birthday, little wait");
        }
        int kid = 8;
        if (kid >= 7) {
            System.out.println("kid go to school");
        }
        int human = 25;
        if (human >= 18) {
            System.out.println("Man finished school and need go to University");
        } else {
            System.out.println("stop chill go work");
        }

        int vagonMax = 102;
        int vagonDown = 59;
        if (vagonDown >= 60) {
            System.out.println("Есть только стоячие места");
        } else {
            System.out.println("Есть свободные места");
        }
        if (vagonMax >= 102) {
            System.out.println("Вагон полон");

        }

        int human1 = 4;
        if (human >= 2 && human1 <= 6) {
            System.out.println("Если возраст человека равен " + human1 + ", то ему нужно ходить v sad");
        } else if (human1 >= 7 && human1 <= 18) {
            System.out.println("Если возраст человека равен " + human1 + ", то ему нужно ходить v school");
        } else if (human1 > 18 && human1 <= 24) {
            System.out.println("Если возраст человека равен " + human1 + ", то ему нужно ходить v univer");
        } else if (human1 > 24) {
            System.out.println("Если возраст человека равен " + human1 + ", то ему нужно ходить v WORKJOB");
        }
        int child = 15;
        if (child < 5) {
            System.out.println("не может кататься");
        } else if (child > 5 && child < 14) {
            System.out.println("может кататься только с сопровождением");
        } else if (child >= 14) {
            System.out.println("может катать один");
        }
        int one = 5;
        int two = 10;
        int three = 35;
        if (one > two) {
            if (one >= three) {
                System.out.println("MAX " + one);
            } else {
                System.out.println("MAX " + three);
            }
        } else if (two > one) {
                 if (two >= three) {
                    System.out.println("MAX " + two);
                } else {
                    System.out.println("MAX " + three);
                }
                if (one > three) {
                    System.out.println("MAX " + one);
                }
               else if (three >= one) {
                    System.out.println("MAX " + three);
                } else {
                    System.out.println("end");
                }
            }
        }

}