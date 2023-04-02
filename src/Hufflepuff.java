public class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    //Блок геттеров, сеттеры не нужны
    public int getDiligence() {return diligence;}
    public int getLoyalty() {return loyalty;}
    public int getHonesty() {return honesty;}

    public Hufflepuff(Hogwarts hogwarts) {
        super(hogwarts.getFaculty(), hogwarts.getName(), hogwarts.getMagicPower(), hogwarts.getApparition());
        this.diligence = (int) ((Math.random() * (100 - 1)) + 1);
        this.loyalty = (int) ((Math.random() * (100 - 1)) + 1);
        this.honesty = (int) ((Math.random() * (100 - 1)) + 1);
    }

    @Override
    public String toString() {
        return "Факультет " + getFaculty() +
                ". Студент " + getName() +
                ". Трудолюбие " + diligence +
                ". Верность " + loyalty +
                ". Честность " + honesty+
                ". Магическая сила " +getMagicPower() +
                ". Трансгрессия " +getApparition();
    }

    public static int skill(Hufflepuff hufflepuff) {
        return hufflepuff.getDiligence() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
    }

    public static void compareHufflepuff (Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (skill(hufflepuff1) > skill(hufflepuff2)) {
            System.out.println(hufflepuff1.getName() +" лучший Пуффендуец чем " +hufflepuff2.getName());
        } else if (skill(hufflepuff1) < skill(hufflepuff2)) {
            System.out.println(hufflepuff2.getName() + " лучший Пуффендуец чем " + hufflepuff1.getName());
        } else {
            System.out.println("Кунг-фу обоих Пуффендуйских дятлов равное");
        }
        System.out.println();
    }

}

