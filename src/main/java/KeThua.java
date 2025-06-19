public class KeThua {
    public static void main(String[] args) {
        Student hocsinh1=new Student("meo meo",12,"male",1,111);
        System.out.println(hocsinh1.getName());



    }
    public static class Human{
        private String name;
        private int age;
        private String gender;

        public Human(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void sayHello(){
            System.out.println("Hello");
        }

    }
    public static class Student extends Human{
        private int lop;
        private int diem;

        public Student(String name, int age, String gender, int lop, int diem) {
            super(name, age, gender);
            this.lop = lop;
            this.diem = diem;
        }

        public int getLop() {
            return lop;
        }

        public void setLop(int lop) {
            this.lop = lop;
        }

        public int getDiem() {
            return diem;
        }

        public void setDiem(int diem) {
            this.diem = diem;
        }
    }

}
