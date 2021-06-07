package b12_Collection.BST;

public class NOde {
    public Student student;
    public NOde left;
    public NOde right;

    public NOde() {
    }

    public NOde(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }
    public boolean checkStudent(int studentId){
        return this.student.getId() == studentId;
    }
    public boolean lessThanOrEqual(Student student){
        return this.student.getId() <= student.getId();
    }
    public boolean lessThanOrEqual(int studentId){
        return this.student.getId() <= student.getId();
    }
    public void printData(){
        student.print();
    }

}
