public class Applicant {
    private final String faculty;
    private final String name;
    //Конструктор
    public Applicant(String faculty, String name) {
        this.faculty = faculty;
        this.name = name;
    }
    //Блок геттеров и сеттеров
    public String getFaculty() {return faculty;}
        public String getName() {return name;}
    //Переопределяем toString
    @Override
    public String toString() {
        return "Факультет " +faculty + ". Абитуриент " + name;
    }

}
