public class Main {

    static Hogwarts[] hogwartsStudents = new Hogwarts[12];
    static Hogwarts.Gryffindor[] gryffindorsStudents = new Hogwarts.Gryffindor[3];
    static Hogwarts.Hufflepuff[] hufflepuffsStudents = new Hogwarts.Hufflepuff[3];
    static Hogwarts.RawenClow[] rawenClowsStudents = new Hogwarts.RawenClow[3];
    static Hogwarts.Slytherin[] slytherinsStudents = new Hogwarts.Slytherin[3];

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
            if (hogwartsStudent.getFaculty().equals("Gryffindor")) {
                gryffindorsStudents[j] = new Hogwarts.Gryffindor(hogwartsStudent);
                j++;

            } else if (hogwartsStudent.getFaculty().equals("Hufflepuff")) {
                hufflepuffsStudents[k] = new Hogwarts.Hufflepuff(hogwartsStudent);
                k++;

            } else if (hogwartsStudent.getFaculty().equals("Raven claw")) {
                rawenClowsStudents[l] = new Hogwarts.RawenClow(hogwartsStudent);
                l++;

            } else if (hogwartsStudent.getFaculty().equals("Slytherin")) {
                slytherinsStudents[m] = new Hogwarts.Slytherin(hogwartsStudent);
                m++;
            }
        }
    //Распечатываем студентов всех факультетов со всеми характеристиками используя методы факультетных класов
        for (int i = 0; i < gryffindorsStudents.length; i++) {
            System.out.println();
        }
        for (int i = 0; i < hufflepuffsStudents.length; i++) {
            System.out.println(hufflepuffsStudents[i]);
        }
        for (int i = 0; i < rawenClowsStudents.length; i++) {
            System.out.println(rawenClowsStudents[i]);
        }
        for (int i = 0; i < slytherinsStudents.length; i++) {
            System.out.println(slytherinsStudents[i]);
        }
        System.out.println();
        // сравнение мощности магии среди всех студентов
        Hogwarts a = hogwartsStudents[1];
        Hogwarts b = hogwartsStudents[9];
        a.globalyStudentsCompare(a,b);

        // сравнение учеников внутри каждого факультета
        Hogwarts c = hogwartsStudents[9];
        Hogwarts d = hogwartsStudents[10];
        //a.facultyStudentsCompare(c, d);











    }
}
