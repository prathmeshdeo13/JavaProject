package encapsulation;

public class Student {

    int id;
    String name;
    Integer Contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContact() {
        return Contact;
    }

    public void setContact(Integer contact) {
        Contact = contact;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(12);
        student.setName("Bhakti");
        student.setContact(962339);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getContact());

    }
}
