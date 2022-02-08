public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /** An especially short bit of Javadoc. */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /** An especially short bit of Javadoc. */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        group = "K62CB";
        this.email = email;
    }

    /** An especially short bit of Javadoc. */
    public Student(Student s) {
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }

}