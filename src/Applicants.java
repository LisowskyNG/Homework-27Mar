public class Applicants {
    private String faculty;
    private final String name;

    public Applicants(String faculty, String name) {
        this.faculty = faculty;
        this.name = name;
    }

    public String getFaculty() {return faculty;}
    public void setFaculty(String faculty) {this.faculty = faculty;}

    public String getName() {return name;}

    @Override
    public String toString() {
        return "Факультет " +faculty + ". Абитуриент " + name;
    }
    Applicants [] applicants = new Applicants[12];

    public void addApplicants(String faculty, String name) {
        Applicants appl = new Applicants(faculty, name);
        for (int i = 0; i < applicants.length; i++) {
            if (applicants[i] == null) {
                applicants[i] = appl;
                //System.out.println("applicants[i] = " + applicants[i] + " " +i);
                return;
            }
        }

    }
}
