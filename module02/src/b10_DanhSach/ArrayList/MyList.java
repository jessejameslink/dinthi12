package b10_DanhSach.ArrayList;

import java.util.Arrays;

public class MyList<E> {
        private int size = 0;
        private static final int DEFAULT = 10;
        private Object[] elements;

        public MyList() {
            System.out.println("khởi tạo thành công myarrayList có kích thước " + DEFAULT);
            elements = new Object[DEFAULT];
        }
        public MyList(int number){
            if (number > 0){
                System.out.println("khởi tạo thành công myarrayList có kích thước " + number);
                elements = new Object[number];
            }else
                System.out.println("lỗi tham số");
        }
        public MyList<E> clone(){
            MyList<E> clone = new MyList<>();
            clone.elements = Arrays.copyOf(elements,size);
            clone.size = size;
            return clone;
        }
        public int indexOf(E e){
            int index = -1;
            for (int i = 0; i <size ; i++) {
                if (this.elements[i].equals(e)){
                    index = i;
                    break;
                }

            }
            return index;

        }
        public boolean contains(E e){
            return this.indexOf(e) >= 0;
        }
        public void TangKichThuoc(int KichThuoc){
            if(KichThuoc >=0){
                int newKichThuoc = this.elements.length+KichThuoc;
                elements = Arrays.copyOf(elements, newKichThuoc);
                System.out.println("khởi tạo thành công myarrayList có kích thước " + newKichThuoc);
            }else
                System.out.println("lỗi tham số");
        }
        public E get (int index){
            return (E) elements[index];
        }
        public int size(){
            return size;
        }
        public boolean add(E e){
            if (size == elements.length){
                TangKichThuoc(1);
            }
            elements[size] = e;
            size++;
            return true;
        }
        public void  add(E e, int index){
            if (index > elements.length){
                System.out.println("lỗi tham số");
            }else if (elements.length == index +1){
                TangKichThuoc(1);
            }
            if (elements[index] == null){
                size ++;
                elements[index] = e;
            }else {
                if (size == elements.length){
                    TangKichThuoc(1);
                }
                System.arraycopy(elements,index,elements,index+1,size -index);
                elements[index] = e;
                size++;
            }

        }
        public E remove( int index){
            if(index < 0|| index > elements.length){
                System.out.println("lỗi tham số");
            }
            E element = (E) elements[index];
            for (int i = index; i < size; i++){
                elements[i] = elements[i+1];
            }
            elements[size - 1] = null;
            size--;
            return element;
        }

    }

