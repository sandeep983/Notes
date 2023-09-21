class StudentQ47 {
    private String name, id, stream;

    public StudentQ47(String name, String id, String stream) {
        this.name = name;
        this.id = id;
        this.stream = stream;
    }

    @Override
    public String toString() {
        return name +" "+ id +" "+ stream;
    }

    public static void main(String[] args) {
        StudentQ47 s = new StudentQ47("Name", "id", "stream");
        System.out.print(s);
    }
}
