public class Main {

    static Applicant [] applicants = new Applicant[12];
    static Hogwarts[] hogwartsStudents = new Hogwarts[12];
    static Hogwarts.Griffyndor[] griffyndorsStudents = new Hogwarts.Griffyndor[3];
    static Hogwarts.Hufflepuff[] hufflepuffsStudents = new Hogwarts.Hufflepuff[3];
    static Hogwarts.RawenClow[] rawenClowsStudents = new Hogwarts.RawenClow[3];
    static Hogwarts.Slytherin[] slytherinsStudents = new Hogwarts.Slytherin[3];

    public static void main(String[] args) {

    // Создаем абитурьентов распределяя их сразу по факультетам
        applicants[0] = new Applicant("Gryffindor", "Harry Potter");
        applicants[1] = new Applicant("Gryffindor", "Hermione Granger");
        applicants[2] = new Applicant("Gryffindor", "Ron Weasley");
        applicants[3] = new Applicant("Hufflepuff", "Zacharias Smith");
        applicants[4] = new Applicant("Hufflepuff", "Cedric Diggory");
        applicants[5] = new Applicant("Hufflepuff", "Justin Finch Fletchley");
        applicants[6] = new Applicant("Raven claw", "Cho Chang");
        applicants[7] = new Applicant("Raven claw", "Padma Patil");
        applicants[8] = new Applicant("Raven claw", "Marcus Belby");
        applicants[9] = new Applicant("Slytherin", "Draco Malfoy");
        applicants[10] = new Applicant("Slytherin", "Graham Montague");
        applicants[11] = new Applicant("Slytherin", "Gregory Goyle");

        // Зачисляем абитурьентов в Хогвардс тестируя и присваивая им общие для всех качества: силу магиии и трансгресии
        for (int i = 0; i < hogwartsStudents.length; i++) {
            hogwartsStudents[i] = new Hogwarts(applicants[i]);
            //System.out.println(hogwartsStudents[i]);
        }
        // Распределяем студентов согласно выбранных факультетов, тестируем и присваиваем величину уникальных характеристик.
        griffyndorsStudents[0] = new Hogwarts.Griffyndor(applicants[0]);
        System.out.println("griffyndorsStudents[0] = " + griffyndorsStudents[0]);

        //for (int i = 0; i < applicants.length; i++) {
        //int j = 0;
        //    int k = 0;
        //    int l = 0;
        //    int m = 0;
        //    if (applicants[i].getFaculty().equals("Gryffindor")) {
        //        griffyndorsStudents[j] = new Hogwarts.Griffyndor(applicants[i]);
        //        j++;
        //        System.out.println(j);
        //
        //  } else if (applicants[i].getFaculty().equals("Hufflepuff")) {
        //       hufflepuffsStudents[k] = new Hogwarts.Hufflepuff(applicants[i]);
        //      k++;
        //
        //    } else if (applicants[i].getFaculty().equals("Raven claw")) {
        //        rawenClowsStudents[l] = new Hogwarts.RawenClow(applicants[i]);
        //        l++;
        //
        //    } else if (applicants[i].getFaculty().equals("Slytherin")) {
        //        slytherinsStudents[m] = new Hogwarts.Slytherin(applicants[i]);
        //        m++;
        //    }
            //System.out.println("griffyndorsStudents[2] = " + griffyndorsStudents[2]);


        //}

    }
}