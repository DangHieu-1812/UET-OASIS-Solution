public class StudentManagement {
    Student[] students = new Student[200];
    int sizeG = 0;
    String[] groups = new String[200];
    int sizeS = 0;


    /** An especially short bit of Javadoc. */
    public static boolean sameGroup(Student s1, Student s2) {
        String hs1 = s1.getGroup();
        String hs2 = s2.getGroup();
        if (hs1.equals(hs2)) {
            return true;
        } else {
            return false;
        }
    }

    /** An especially short bit of Javadoc. */
    public void addStudent(Student newStudent) {
        students[sizeS] = newStudent;
        sizeS++;
    }

    /** An especially short bit of Javadoc. */
    public String studentsByGroup() {
        String str = "";
        if (sizeS > 0) {
            groups[sizeG] = students[0].getGroup();
            sizeG++;
            for (int i = 1; i < sizeS; i++) {
                boolean check = true;
                for (int j = 0; j < sizeG; j++) {
                    if (students[i].getGroup().equals(groups[j])) {
                        check = false;
                        continue;
                    }
                }
                if (check) {
                    groups[sizeG++] = students[i].getGroup();
                }
            }
            for (int i = 0; i < sizeG; i++) {
                str += groups[i] + "\n";
                for (int j = 0; j < sizeS; j++) {
                    if (students[j].getGroup().equals(groups[i])) {
                        str += students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return str;
    }

    /** An especially short bit of Javadoc. */
    public void removeStudent(String id) {
        for (int i = 0; i < sizeS; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < sizeS - 1; j++) {
                    students[j] = students[j + 1];
                }
                sizeS--;
            }
        }
    }

}
