public class Main {


    public static void main(String[] args) {
        Applicants a = new Applicants(null, null);
    // Создаем абитурьентов распределяя их сразу по факультетам
        a.addApplicants("Gryffindor", "Harry Potter");
        a.addApplicants("Gryffindor", "Hermione Granger");
        a.addApplicants("Gryffindor", "Ron Weasley");
        a.addApplicants("Hufflepuff", "Zacharias Smith");
        a.addApplicants("Hufflepuff", "Cedric Diggory");
        a.addApplicants("Hufflepuff", "Justin Finch Fletchley");
        a.addApplicants("Raven claw", "Cho Chang");
        a.addApplicants("Raven claw", "Padma Patil");
        a.addApplicants("Raven claw", "Marcus Belby");
        a.addApplicants("Slytherin", "Draco Malfoy");
        a.addApplicants("Slytherin", "Graham Montague");
        a.addApplicants("Slytherin", "Gregory Goyle");

    // Зачисляем абитурьентов в Хогвардс тестируя и присваивая им общие для всех качества: силу магиии


        int c = (int) ((Math.random() * (100 - 1)) + 1);
        System.out.println("c = " + c);
    }
}