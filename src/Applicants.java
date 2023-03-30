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


}
