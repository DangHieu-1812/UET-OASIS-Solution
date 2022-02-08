public class Person {
    private String name;
    private String address;

    /** An especially short bit of Javadoc. */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
    public static void main(String[] args){
        Person p = new Person("Hieu","Ha Noi");
        Student stu = new Student("Nhi","VietNam","College",2020,28.5);
        Staff sta = new Staff("Quang","ThanhHoa","Hust",10.5);
        System.out.println(p.toString());
        System.out.println(stu.toString());
        System.out.println(sta.toString());
    }

}

