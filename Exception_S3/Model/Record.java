package Model;
public class Record {
    private String familyName;
    private String name;
    private String fatherName;
    private String birthday;
    private int phone;
    private char sex;

    public Record(String familyName, String name, String fatherName, String birthday, int phone, char sex) {
        this.familyName = familyName;
        this.name = name;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.phone = phone;
        this.sex = sex;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Фамилия:%s\nИмя:%s\nОтчество:%s\nДата рождения:%s\nНомер телефона:%d\nПол:%c", familyName,
                name, fatherName, birthday, phone, sex);
    }
}
