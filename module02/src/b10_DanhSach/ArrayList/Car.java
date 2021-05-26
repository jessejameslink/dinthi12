package b10_DanhSach.ArrayList;


public class Car {
        String name;
        String color;
        int namSanXuat;

        public Car() {
        }

        public Car(String name, String color, int namSanXuat) {
            this.name = name;
            this.color = color;
            this.namSanXuat = namSanXuat;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", namSanXuat=" + namSanXuat +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            Car car = (Car) obj;
            return this.name.equals(((Car) obj).name) && this.color == ((Car) obj).color&&this.
                    namSanXuat == ((Car) obj).namSanXuat;
        }

        public static void main(String[] args) {
            MyList<Car> myList = new MyList<>();
            myList.add(new Car("vinfast","black",1789));
            myList.add(new Car("toyota","yellow",1232));
            myList.add(new Car("mitsubishi","red",3923));
            myList.add(new Car("mec","pink",2133));
            myList.remove(2);
            for (int i = 0; i< myList.size();i++){
                System.out.println(myList.get(i).toString());
            }
        }
    }

