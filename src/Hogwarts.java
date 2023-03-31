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
        private final int nobility;
        private final int honor;
        private final int bravery;

        //Блок геттеров, сеттеры не нужны
        public int getNobility() {return nobility;}
        public int getHonor() {return honor;}
        public int getBravery() {return bravery;}

        public Griffyndor (Applicant applicant) {
            super (applicant);
            this.nobility = (int) ((Math.random() * (100 - 1)) + 1);;
            this.honor = (int) ((Math.random() * (100 - 1)) + 1);;
            this. bravery = (int) ((Math.random() * (100 - 1)) + 1);;

        }
    }
    public static class Hufflepuff extends Hogwarts {
        private final int diligence;
        private final int loyalty;
        private final int honesty;

        //Блок геттеров, сеттеры не нужны
        public int getDiligence() {return diligence;}
        public int getLoyalty() {return loyalty;}
        public int getHonesty() {return honesty;}

        public Hufflepuff (Applicant applicant) {
            super (applicant);
            this.diligence = (int) ((Math.random() * (100 - 1)) + 1);;
            this.loyalty = (int) ((Math.random() * (100 - 1)) + 1);;
            this.honesty = (int) ((Math.random() * (100 - 1)) + 1);;

        }
    }
    public static class RawenClow extends Hogwarts {
        private final int intellect;
        private final int wisdom;
        private final int wit;
        private final int creative;

        //Блок геттеров, сеттеры не нужны
        public int getIntellect() {return intellect;}
        public int getWisdom() {return wisdom;}
        public int getWit() {return wit;}
        public int getCreative() {return creative;}

        public RawenClow (Applicant applicant) {
            super (applicant);
            this.intellect = (int) ((Math.random() * (100 - 1)) + 1);;
            this.wisdom = (int) ((Math.random() * (100 - 1)) + 1);;
            this. wit = (int) ((Math.random() * (100 - 1)) + 1);;
            this. creative = (int) ((Math.random() * (100 - 1)) + 1);

        }
    }

    public static class Slytherin extends Hogwarts {
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

        public Slytherin (Applicant applicant) {
            super (applicant);
            this.trick = (int) ((Math.random() * (100 - 1)) + 1);;
            this.resolute = (int) ((Math.random() * (100 - 1)) + 1);;
            this.ambition = (int) ((Math.random() * (100 - 1)) + 1);;
            this.resourcefulness = (int) ((Math.random() * (100 - 1)) + 1);
            this.powerthirst = (int) ((Math.random() * (100 - 1)) + 1);

        }
    }













}