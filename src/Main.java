public class Main {

    static Hogwarts[] hogwartsStudents = new Hogwarts[12];
    static Gryffindor[] gryffindorsStudents = new Gryffindor[3];
    static Hufflepuff[] hufflepuffsStudents = new Hufflepuff[3];
    static RawenClow[] rawenClowsStudents = new RawenClow[3];
    static Slytherin[] slytherinsStudents = new Slytherin[3];

    public static void main(String[] args) {

        // Зачисляем абитурьентов в Хогвардс тестируя и присваивая им общие для всех качества: силу магиии и трансгресии
        hogwartsStudents[0] = new Hogwarts("Gryffindor", "Harry Potter", 33, 55);
        hogwartsStudents[1] = new Hogwarts("Gryffindor", "Hermione Granger", 65, 100);
        hogwartsStudents[2] = new Hogwarts("Gryffindor", "Ron Weasley", 14, 96);
        hogwartsStudents[3] = new Hogwarts("Hufflepuff", "Zacharias Smith", 11, 44);
        hogwartsStudents[4] = new Hogwarts("Hufflepuff", "Cedric Diggory", 68, 74);
        hogwartsStudents[5] = new Hogwarts("Hufflepuff", "Justin Finch Fletchley", 46, 38);
        hogwartsStudents[6] = new Hogwarts("Raven claw", "Cho Chang", 64, 18);
        hogwartsStudents[7] = new Hogwarts("Raven claw", "Padma Patil", 85, 54);
        hogwartsStudents[8] = new Hogwarts("Raven claw", "Marcus Belby", 29, 68);
        hogwartsStudents[9] = new Hogwarts("Slytherin", "Draco Malfoy", 66, 99);
        hogwartsStudents[10] = new Hogwarts("Slytherin", "Graham Montague", 33, 88);
        hogwartsStudents[11] = new Hogwarts("Slytherin", "Gregory Goyle", 44, 99);

        // Распределяем студентов согласно выбранных факультетов, тестируем и присваиваем величину уникальных характеристик.
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        for (Hogwarts hogwartsStudent : hogwartsStudents) {
            switch (hogwartsStudent.getFaculty()) {
                case "Gryffindor":
                    gryffindorsStudents[j] = new Gryffindor(hogwartsStudent);
                    j++;

                    break;
                case "Hufflepuff":
                    hufflepuffsStudents[k] = new Hufflepuff(hogwartsStudent);
                    k++;

                    break;
                case "Raven claw":
                    rawenClowsStudents[l] = new RawenClow(hogwartsStudent);
                    l++;

                    break;
                case "Slytherin":
                    slytherinsStudents[m] = new Slytherin(hogwartsStudent);
                    m++;
                    break;
            }
        }
        //Распечатываем студентов всех факультетов со всеми характеристиками используя методы факультетных класов
        for (int i = 0; i < gryffindorsStudents.length; i++) {
            System.out.println();
        }
        for (Hufflepuff hufflepuffsStudent : hufflepuffsStudents) {
            System.out.println(hufflepuffsStudent);
        }
        for (RawenClow rawenClowsStudent : rawenClowsStudents) {
            System.out.println(rawenClowsStudent);
        }
        for (Slytherin slytherinsStudent : slytherinsStudents) {
            System.out.println(slytherinsStudent);
        }
        System.out.println();

        // сравнение мощности магии среди всех студентов
        System.out.println("Сравнение студентов Хогвартса");
        Hogwarts.globalyStudentsCompare(hogwartsStudents[1],hogwartsStudents[10]);

        // сравнение учеников внутри каждого факультета
        //Гриффиндор
        System.out.println("Сравнение студентов факультета Гриффиндор");
        Gryffindor.compareGryffindor(gryffindorsStudents[2], gryffindorsStudents[0]);

        //Пуффендуй
        System.out.println("Сравнение студентов факультета Пуффендуй");
        Hufflepuff.compareHufflepuff(hufflepuffsStudents[1], hufflepuffsStudents[2]);

        //Когтевран
        System.out.println("Сравнение студентов факультета Когтевран");
        RawenClow.compareRawenclow(rawenClowsStudents[1], rawenClowsStudents[2]);

        // Слизерин
        System.out.println("Сравнение студентов факультета Слизерин");
        Slytherin.compareSlytherin(slytherinsStudents[0], slytherinsStudents[1]);

    }
}
