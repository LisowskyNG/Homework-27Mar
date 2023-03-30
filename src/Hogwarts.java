public class Hogwarts {

    private Applicants applicants;

    private int magicPower;
    private int apparition;

    public Hogwarts (Applicants applicants) {
            this.applicants = applicants;
            this.magicPower = (int) ((Math.random() * (100 - 1)) + 1);
            this.apparition = (int) ((Math.random() * (100 - 1)) + 1);
    }
    public Applicants getApplicants() {return applicants;}
    public int getMagicPower() {return magicPower;}
    public int getApparition() {return apparition;}




    public Hogwarts() {
    }


    public String toString() {
        return null;
    }
    public void compareGlobalSkills(Hogwarts students) {
    }







}
