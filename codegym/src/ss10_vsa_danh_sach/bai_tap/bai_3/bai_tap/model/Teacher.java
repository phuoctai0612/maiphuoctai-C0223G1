package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model;

public class Teacher extends Person {
    private String bangCap;
    private String kinhNghiem;

    public Teacher() {
    }

    public Teacher(int id, String name, String dayOfBirth, boolean gender, String bangCap, String kinhNghiem) {
        super(id, name, dayOfBirth, gender);
        this.bangCap = bangCap;
        this.kinhNghiem = kinhNghiem;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "bangCap='" + bangCap + '\'' +
                ", kinhNghiem='" + kinhNghiem + '\'' +
                '}';
    }
}
