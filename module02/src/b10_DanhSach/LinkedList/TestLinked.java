package b10_DanhSach.LinkedList;


    public class TestLinked {
        public static void main(String[] args) {
            MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
            Student a = new Student("tủn", 21);
            Student b = new Student("tèo", 18);
            Student c = new Student("bủn", 1);
            Student d = new Student("bấm", 14);
            Student e = new Student("đại", 28);

            studentMyLinkedList.addFirst(a);
            studentMyLinkedList.addFirst(b);

            studentMyLinkedList.remove(a);
            studentMyLinkedList.clear();
            System.out.println(studentMyLinkedList.indexOf(a));
            for (int i = 0; i < studentMyLinkedList.size(); i++) {
                System.out.println(studentMyLinkedList.get(i).toString());
            }
        }
    }

