public class RawenClow extends Hogwarts {
    private final int intellect;
    private final int wisdom;
    private final int wit;
    private final int creative;

    //Блок геттеров, сеттеры не нужны
    public int getIntellect() {return intellect;}
    public int getWisdom() {return wisdom;}
    public int getWit() {return wit;}
    public int getCreative() {return creative;}

    public RawenClow(Hogwarts hogwarts) {
        super(hogwarts.getFaculty(), hogwarts.getName(), hogwarts.getMagicPower(), hogwarts.getApparition());
        this.intellect = (int) ((Math.random() * (100 - 1)) + 1);
        this.wisdom = (int) ((Math.random() * (100 - 1)) + 1);
        this.wit = (int) ((Math.random() * (100 - 1)) + 1);
        this.creative = (int) ((Math.random() * (100 - 1)) + 1);
    }

    @Override
    public String toString() {
        return "Факультет " + getFaculty() +
                ". Студент " + getName() +
                ". Ум " + intellect +
                ". Мудрость " + wisdom +
                ". Остроумие " + wit +
                ". Творчество " + creative+
                ". Магическая сила " +getMagicPower() +
                ". Трансгрессия " +getApparition();
    }

    public static int skill(RawenClow rawenClow) {
        return rawenClow.getIntellect() + rawenClow.getWisdom() + rawenClow.getWit() + rawenClow.getCreative();
    }

    public static void compareRawenclow (RawenClow rawenclow1, RawenClow rawenclow2) {
        if (skill(rawenclow1) > skill(rawenclow2)) {
            System.out.println(rawenclow1.getName() +" лучший Когтеврановец чем " +rawenclow2.getName());
        } else if (skill(rawenclow1) < skill(rawenclow2)) {
            System.out.println(rawenclow2.getName() + " лучший Когтеврановец чем " + rawenclow1.getName());
        } else {
            System.out.println("Кунг-фу обоих Когтевранских дятлов равное");
        }
        System.out.println();
    }


}