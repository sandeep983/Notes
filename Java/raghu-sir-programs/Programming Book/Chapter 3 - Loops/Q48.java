class Student {
    private String firstName, lastName, birthDate;
    private int id;

    private static int idCounter = 0;
    public Student(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return id+" "+firstName+" "+lastName+" "+birthDate;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Riya", "Mishra", "12/07");
        Student s2 = new Student("Sandeep", "Patel", "13/07");
        Student s3 = new Student("Jyoti", "Patel", "13/07");
        Student s4 = new Student("Shaheen", "Khan", "14/07");
 
        Student student[] = {s1, s2, s3, s4};

        for (Student s : student) {
            System.out.println(s);
        }
    }
}
