public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public int getNobility() {return nobility;}
    public int getHonor() {return honor;}
    public int getBravery() {return bravery;}

    public Gryffindor(Hogwarts hogwarts) {
        super(hogwarts.getFaculty(), hogwarts.getName(), hogwarts.getMagicPower(), hogwarts.getApparition());
        this.nobility = (int) ((Math.random() * (100 - 1)) + 1);
        this.honor = (int) ((Math.random() * (100 - 1)) + 1);
        this.bravery = (int) ((Math.random() * (100 - 1)) + 1);
    }

    @Override
    public String toString() {
        return "Факультет " + getFaculty() +
                ". Студент " + getName() +
                ". Благородство " + nobility +
                ". Честь " + honor +
                ". Храбрость " + bravery +
                ". Магическая сила " +getMagicPower() +
                ". Трансгрессия " +getApparition();
    }

    public static int skill(Gryffindor gryffindor) {
        return gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
    }


    public static void compareGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (skill(gryffindor1) > skill(gryffindor2)) {
            System.out.println(gryffindor1.getName() +" лучший Гриффиндорец чем " +gryffindor2.getName());
        } else if (skill(gryffindor1) < skill(gryffindor2)) {
            System.out.println(gryffindor2.getName() + " лучший Гриффиндорец чем " + gryffindor1.getName());
        } else {
            System.out.println("Кунг-фу обоих Гриффиндорских дятлов равное");
        }
        System.out.println();
    }
}