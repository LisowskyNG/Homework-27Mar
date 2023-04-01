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

    public static class Gryffindor extends Hogwarts {
        private final int nobility;
        private final int honor;
        private final int bravery;
        private final int skill;

        //Блок геттеров, сеттеры не нужны
        public int getNobility() {return nobility;}
        public int getHonor() {return honor;}
        public int getBravery() {return bravery;}
        public int getSkill() {return skill;}

        public Gryffindor(Hogwarts hogwarts) {
            super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
            this.nobility = (int) ((Math.random() * (100 - 1)) + 1);
            this.honor = (int) ((Math.random() * (100 - 1)) + 1);
            this.bravery = (int) ((Math.random() * (100 - 1)) + 1);
            this.skill = nobility+honor+bravery;
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

        public void compareGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
            int temporary1 = gryffindor1.getNobility()+gryffindor1.getHonor()+gryffindor1.getBravery();
            int temporary2 = gryffindor2.getNobility()+gryffindor2.getHonor()+gryffindor2.getBravery();
            if (temporary1 > temporary2) {
                System.out.println(gryffindor1.getName() +" лучший Гриффиндорец чем " +gryffindor2.getName());
            } else if (temporary1 < temporary2) {
                System.out.println(gryffindor2.getName() + " лучший Гриффиндорец чем " + gryffindor1.getName());
            } else {
                System.out.println("Кунг-фу обоих Гриффиндорских дятлов равное");
            }
        }
    }

        public static class Hufflepuff extends Hogwarts {
            private final int diligence;
            private final int loyalty;
            private final int honesty;
            private final int skill;

            //Блок геттеров, сеттеры не нужны
            public int getDiligence() {return diligence;}
            public int getLoyalty() {return loyalty;}
            public int getHonesty() {return honesty;}
            public int getSkill() {return skill;}

            public Hufflepuff(Hogwarts hogwarts) {
                super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
                this.diligence = (int) ((Math.random() * (100 - 1)) + 1);
                this.loyalty = (int) ((Math.random() * (100 - 1)) + 1);
                this.honesty = (int) ((Math.random() * (100 - 1)) + 1);
                this.skill = diligence+loyalty+honesty;
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
            public void compareHufflepuff (Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
                int temporary1 = hufflepuff1.getDiligence()+hufflepuff1.getLoyalty()+hufflepuff1.getHonesty();
                int temporary2 = hufflepuff2.getDiligence()+hufflepuff2.getLoyalty()+hufflepuff2.getHonesty();
                if (temporary1 > temporary2) {
                    System.out.println(hufflepuff1.getName() +" лучший Пуффендуец чем " +hufflepuff2.getName());
                } else if (temporary1 < temporary2) {
                    System.out.println(hufflepuff2.getName() + " лучший Пуффендуец чем " + hufflepuff1.getName());
                } else {
                    System.out.println("Кунг-фу обоих Пуффендуйских дятлов равное");
                }
            }

        }

        public static class RawenClow extends Hogwarts {
            private final int intellect;
            private final int wisdom;
            private final int wit;
            private final int creative;
            private final int skill;

            //Блок геттеров, сеттеры не нужны
            public int getIntellect() {return intellect;}
            public int getWisdom() {return wisdom;}
            public int getWit() {return wit;}
            public int getCreative() {return creative;}
            public int getSkill() {return skill;}

            public RawenClow(Hogwarts hogwarts) {
                super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
                this.intellect = (int) ((Math.random() * (100 - 1)) + 1);
                this.wisdom = (int) ((Math.random() * (100 - 1)) + 1);
                this.wit = (int) ((Math.random() * (100 - 1)) + 1);
                this.creative = (int) ((Math.random() * (100 - 1)) + 1);
                this.skill = intellect+wisdom+wit+creative;
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
            public void compareRawenclow (RawenClow rawenclow1, RawenClow rawenclow2) {
                int temporary1 = rawenclow1.getIntellect()+rawenclow1.getWisdom()+rawenclow1.getWit()+rawenclow1.getCreative();
                int temporary2 = rawenclow2.getIntellect()+rawenclow2.getWisdom()+rawenclow2.getWit()+rawenclow2.getCreative();
                if (temporary1 > temporary2) {
                    System.out.println(rawenclow1.getName() +" лучший Когтеврановец чем " +rawenclow2.getName());
                } else if (temporary1 < temporary2) {
                    System.out.println(rawenclow2.getName() + " лучший Когтеврановец чем " + rawenclow1.getName());
                } else {
                    System.out.println("Кунг-фу обоих Когтевранских дятлов равное");
                }
            }


        }

        public static class Slytherin extends Hogwarts {
            private final int trick;
            private final int resolute;
            private final int ambition;
            private final int resourcefulness;
            private final int powerthirst;
            private final int skill;

            //Блок геттеров, сеттеры не нужны
            public int getTrick() {return trick;}
            public int getResolute() {return resolute;}
            public int getAmbition() {return ambition;}
            public int getResourcefulness() {return resourcefulness;}
            public int getPowerthirst() {return powerthirst;}
            public int getSkill() {return skill;}

            public Slytherin(Hogwarts hogwarts) {
                super(hogwarts.faculty, hogwarts.name, hogwarts.magicPower, hogwarts.apparition);
                this.trick = (int) ((Math.random() * (100 - 1)) + 1);
                this.resolute = (int) ((Math.random() * (100 - 1)) + 1);
                this.ambition = (int) ((Math.random() * (100 - 1)) + 1);
                this.resourcefulness = (int) ((Math.random() * (100 - 1)) + 1);
                this.powerthirst = (int) ((Math.random() * (100 - 1)) + 1);
                this.skill = trick+resolute+ambition+resourcefulness+powerthirst;
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
            public void compareSlytherin (Slytherin slytherin1, Slytherin slytherin2) {
                int temporary1 = slytherin1.getTrick() + slytherin1.getResolute()+slytherin1.getAmbition()+slytherin1.getResourcefulness()+slytherin1.getPowerthirst();
                int temporary2 = slytherin2.getTrick() + slytherin2.getResolute()+slytherin2.getAmbition()+slytherin2.getResourcefulness()+slytherin2.getPowerthirst();
                if (temporary1 > temporary2) {
                    System.out.println(slytherin1.getName() +" лучший Слизеринец чем " +slytherin2.getName());
                } else if (temporary1 < temporary2) {
                    System.out.println(slytherin2.getName() + " лучший Слизеринец чем " + slytherin1.getName());
                } else {
                    System.out.println("Кунг-фу обоих Слизеринских дятлов равное");
                }
            }




        }

    public void globalyStudentsCompare(Hogwarts hogwarts1, Hogwarts hogwarts2) {
            int temporary1 = hogwarts1.getMagicPower()+hogwarts1.getApparition();
            int temporary2 = hogwarts2.getMagicPower()+hogwarts2.getApparition();
            if (temporary1 > temporary2) {
                System.out.println(hogwarts1.getName() +" Обладает большей мощностью магии чем " +hogwarts2.getName());
            } else if (temporary1 < temporary2) {
                System.out.println(hogwarts2.getName() + " Обладает большей мощностью магии чем " + hogwarts1.getName());
            } else {
                System.out.println("Кунг-фу обоих дятлов равное");
            }
    }
}











