package b12_Collection.BST;

public class Main {
    public static void main(String[] args) {
        MethodBSTree bsTree = new MethodBSTree();
        bsTree.add(new NOde(new Student("Ngạn", 21)));
        bsTree.add(new NOde(new Student("Hà Lan", 20)));
        bsTree.add(new NOde(new Student("Dũng", 23)));

        bsTree.show();
        System.out.println("------------");
        int studentId = 2;
        NOde nOde = bsTree.search(studentId);
        if (nOde == null){
            System.out.println("not found");
        }else
            nOde.printData();
    }
}
