public class Slytherin extends Hogwarts {
    private final int trick;
    private final int resolute;
    private final int ambition;
    private final int resourcefulness;
    private final int powerthirst;

    //Блок геттеров, сеттеры не нужны
    public int getTrick() {return trick;}
    public int getResolute() {return resolute;}
    public int getAmbition() {return ambition;}
    public int getResourcefulness() {return resourcefulness;}
    public int getPowerthirst() {return powerthirst;}

    public Slytherin(Hogwarts hogwarts) {
        super(hogwarts.getFaculty(), hogwarts.getName(), hogwarts.getMagicPower(), hogwarts.getApparition());
        this.trick = (int) ((Math.random() * (100 - 1)) + 1);
        this.resolute = (int) ((Math.random() * (100 - 1)) + 1);
        this.ambition = (int) ((Math.random() * (100 - 1)) + 1);
        this.resourcefulness = (int) ((Math.random() * (100 - 1)) + 1);
        this.powerthirst = (int) ((Math.random() * (100 - 1)) + 1);
    }

    @Override
    public String toString() {
        return "Факультет " + getFaculty() +
                ". Студент " + getName() +
                ". Хитрость " + trick +
                ". Решительность " + resolute +
                ". Амбициозность " + ambition +
                ". Находчивость " + resourcefulness +
                ". Жажда власти " + powerthirst+
                ". Магическая сила " +getMagicPower() +
                ". Трансгрессия " +getApparition();
    }

    public static int skill (Slytherin slytherin) {
        return slytherin.getTrick() + slytherin.getResolute() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getPowerthirst();
    }


    public static void compareSlytherin (Slytherin slytherin1, Slytherin slytherin2) {
        if (skill(slytherin1) > skill(slytherin2)) {
            System.out.println(slytherin1.getName() +" лучший Слизеринец чем " +slytherin2.getName());
        } else if (skill(slytherin1) < skill(slytherin2)) {
            System.out.println(slytherin2.getName() + " лучший Слизеринец чем " + slytherin1.getName());
        } else {
            System.out.println("Кунг-фу обоих Слизеринских дятлов равное");
        }
        System.out.println();
    }




}