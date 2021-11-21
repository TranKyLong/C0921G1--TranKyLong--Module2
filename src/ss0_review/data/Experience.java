package ss0_review.data;

public class Experience extends Candidates {
    Integer expInYear;
    String proSkill;
    final Integer TYPE = 0;

    public Experience() {
    }

    public Experience(String id, String firstName, String lastName, Integer birth, String address, String phone, String email, Integer type, Integer expInYear, String proSkill) {
        super(id, firstName, lastName, birth, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Integer getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(Integer expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public Integer getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "ExpInYear=" + expInYear +
                ", ProSkill='" + proSkill + '\'' +
                '}';
    }
}

