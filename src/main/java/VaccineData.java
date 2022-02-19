public class VaccineData {
    private int nid;
    private String name;
    private String gender;
    private int age;

    public VaccineData(int nid, String name, String gender, int age) {
        this.nid = nid;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
