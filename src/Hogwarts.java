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

    public static class Griffyndor extends Hogwarts {
        private final int nobility;
        private final int honor;
        private final int bravery;

        //Блок геттеров, сеттеры не нужны
        public int getNobility() {return nobility;}
        public int getHonor() {return honor;}
        public int getBravery() {return bravery;}

        public Griffyndor(Hogwarts hogwarts) {
            super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
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
                    ". Храбрость " + bravery;
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

            public Hufflepuff(Hogwarts hogwarts) {
                super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
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
                        ". Честность " + honesty;
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

            public RawenClow(Hogwarts hogwarts) {
                super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
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
                        ". Творчество " + creative;
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

            public Slytherin(Hogwarts hogwarts) {
                super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
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
                        ". Жажда власти " + powerthirst;
            }
        }

    }











