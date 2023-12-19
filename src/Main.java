
public class Main {
    public static void main(String[] args) {
        Student student =  new Student();

        student.setName("Maksat");
        student.setSurname("Alimzhanov");
        student.setAge(22);
        student.setGpa(3.5);

        System.out.println(student.toString());
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
        System.out.println(student1.toString());
    }

    public class Student {
    /*
    public - accessible everywhere
    private - accessible only inside of class
    protected - accessible only inside same package
    no modifiers - accessible only inside same package
    */

    /*
    static - belongs to class creates once
    non-static -  belongs to object creates to every object
     */
        //fields - param of the class

        private static int id_gen = 1;
        private int id;

        private String surname;
        private int age;
        private double gpa;
        private String name;

        public Student(){  //no arg constructor
            id = id_gen++;
        }

        public Student(String name, String surname, int age, double gpa){
            this();
            setName(name);
            setSurname(surname);
            setAge(age);
            setGpa(gpa);
        }
        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return "Student with id: " + getId()
                    + "\nFullname: " + getName() + " " +getSurname()
                    + "\nAge: " + getAge()
                    + "\nGPA: " + getGpa();
        }
    }

}














