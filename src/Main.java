public class Main {


    public static void main(String[] args) {
        Applicants [] applicants = new Applicants[12];
        applicants[0] = new Applicants("Gryffindor", "Harry Potter");
        applicants[1] = new Applicants("Gryffindor", "Hermione Granger");
        applicants[2] = new Applicants("Gryffindor", "Ron Weasley");
        applicants[3] = new Applicants("Hufflepuff", "Zacharias Smith");
        applicants[4] = new Applicants("Hufflepuff", "Cedric Diggory");
        applicants[5] = new Applicants("Hufflepuff", "Justin Finch Fletchley");
        applicants[6] = new Applicants("Raven claw", "Cho Chang");
        applicants[7] = new Applicants("Raven claw", "Padma Patil");
        applicants[8] = new Applicants("Raven claw", "Marcus Belby");
        applicants[9] = new Applicants("Slytherin", "Draco Malfoy");
        applicants[10] = new Applicants("Slytherin", "Graham Montague");
        applicants[11] = new Applicants("Slytherin", "Gregory Goyle");

        for (int i = 0; i < applicants.length; i++) {
            System.out.println(applicants[i]);
        }


        int a = (int) ((Math.random() * (100 - 1)) + 1);
        System.out.println("a = " + a);
    }
}