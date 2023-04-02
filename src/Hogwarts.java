public class Hogwarts {

    private final String faculty;
    private final String name;
    private final int magicPower;
    private final int apparition;

    public Hogwarts(String faculty, String name, int magicPower, int apparition) {
        this.faculty = faculty;
        this. name = name;
        this.magicPower = magicPower;
        this.apparition = apparition;
    }
    //Блок геттеров
    public String getFaculty() {return faculty;}
    public String getName() {return name;}
    public int getMagicPower() {return magicPower;}
    public int getApparition() {return apparition;}

    @Override
    public String toString() {
        return "Факультет " + getFaculty() +
                ". Студент " + getName() +
                ". Магическая сила " + magicPower +
                ". Трансгрессия " + apparition;
    }

    public static int totalGlobalskill(Hogwarts hogwarts) {
        return hogwarts.getMagicPower()+hogwarts.getApparition();
    }

    public static void globalyStudentsCompare(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (totalGlobalskill(hogwarts1) > totalGlobalskill(hogwarts2)) {
            System.out.println(hogwarts1.getName() +" Обладает большей мощностью магии чем " +hogwarts2.getName());
        } else if (totalGlobalskill(hogwarts1) < totalGlobalskill(hogwarts2)) {
            System.out.println(hogwarts2.getName() + " Обладает большей мощностью магии чем " + hogwarts1.getName());
        } else {
            System.out.println("Кунг-фу обоих дятлов равное");
        }
        System.out.println();
    }
}