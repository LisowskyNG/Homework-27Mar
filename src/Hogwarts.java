public class Hogwarts {

    private final Applicant applicant;
    private final int magicPower;
    private final int apparition;

    public Hogwarts(Applicant applicant) {
        this.applicant = applicant;
        this.magicPower = (int) ((Math.random() * (100 - 1)) + 1);
        this.apparition = (int) ((Math.random() * (100 - 1)) + 1);
    }

    //Блок геттеров и сеттеров
    public Applicant getApplicant() {return applicant;}
    public int getMagicPower() {return magicPower;}
    public int getApparition() {return apparition;}

    @Override
    public String toString() {
        return "Факультет " +applicant.getFaculty() +
                ". Студент " +applicant.getName() +
                ". Магическая сила " +magicPower+
                ". Трансгрессия " + apparition;


    }
    public static class Griffyndor extends Hogwarts {
        private int nobility;
        private int honor;
        private int bravery;


        public Griffyndor (Applicant applicant) {
            super (applicant);
            this.nobility = (int) ((Math.random() * (100 - 1)) + 1);;
            this.honor = (int) ((Math.random() * (100 - 1)) + 1);;
            this. bravery = (int) ((Math.random() * (100 - 1)) + 1);;

            //Блок геттеров, сеттеры не нужны


        }

    }

}