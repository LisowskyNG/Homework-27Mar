public class Main {

    static Applicant [] applicants = new Applicant[12];
    static Hogwarts[] hogwartsStudents = new Hogwarts[12];

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
            Hogwarts temporary = new Hogwarts(applicants[i]);
            hogwartsStudents[i] = temporary;
            System.out.println(hogwartsStudents[i]);
        }
        // Распределяем студентов согласно выбранных факультетов, тестируем и присваиваем величину уникальных характеристик.

    }
}