package ss0_review.data;

public class Intership extends Candidates {

    String majors; //chuyen nganh`
    String semester; // hoc ky
    String uniName; //ten truong dai hoc
    final Integer TYPE = 2;
    public Intership() {
    }

    public Intership(String majors, String semester, String uniName) {
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;

    }

    public Intership(String id, String firstName, String lastName, Integer birth, String address, String phone, String email, Integer type, String majors, String semester, String uniName) {
        super(id, firstName, lastName, birth, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Integer getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Intership{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", uniName='" + uniName + '\'' +
                '}';
    }
}
