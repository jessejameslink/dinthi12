package b12_Collection.BST;

import b10_DanhSach.LinkedList.Node;

public class MethodBSTree {
    private int size;
    public NOde root;

    public MethodBSTree() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private NOde insertAt(NOde nOde, NOde newNOde) {
        if (nOde == null) {
            this.size++;
            return newNOde;
        }
        if (newNOde.lessThanOrEqual(this.root.student)) {
            nOde.left = insertAt(nOde.left, newNOde);
        } else
            nOde.right = insertAt(nOde.right, newNOde);
        return nOde;
    }

    public void add(NOde node) {
        this.root = insertAt(this.root, node);
    }
    public void show(){
        show(this.root);
    }

    private void show(NOde node){
        if (node == null) return;
        node.printData();
        show(node.left);
        show(node.right);
    }

    private NOde search(NOde node,int studentid){
        if (node == null) return null;
    if (node.checkStudent(studentid)){
        return node;
    }
    if (node.lessThanOrEqual(studentid)){
        return search(node.right,studentid);
    }
    return search(node.left,studentid);
    }
    public NOde search(int studentId) {
    return search(this.root,studentId);
    }

    public void delete(int sudentid) {
    }
    private NOde delete(NOde node, int studentid){
        if (node == null) return null;
        if ( node.checkStudent(studentid)){
            node.left = delete(node.left,studentid);
            return node;
        }
        node.right = delete(node.right,studentid);
        return node;
    }


}
