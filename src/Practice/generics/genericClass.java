package Practice.generics;

public class genericClass {
    public static void main(String []args){
        Integer []a= {100,38,76,42,24, 98, 36};
        Character[] c = { 'B', 'A', 'L', 'A', 'J', 'I'};
        String[] s = {"Welcome", "Good Morning", "Hello", "Hi", "How are you?", "Who are you?"};

        compare<String> obj=new compare<String>(s);
        compare<Character> obj1=new compare<Character>(c);
        compare<Integer> obj2=new compare<Integer>(a);

        obj.begin();
        obj1.begin();
        obj2.begin();
    }
}

class compare <T extends Comparable<T>>{
    T[] element;
    compare(T[] elem){
        element = elem;
    }

    void begin(){
        for (int i=0; i<element.length - 1; i++){
            for (int j=0; j< element.length -i -1; j++){
                if (element[j].compareTo(element[j+1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }

        for (T i:element){
            System.out.println(i+",");
        }
        System.out.println();
    }

    void swap(int i, int j){
        T t = element[i];
        element[i] = element[j];
        element[j] = t;
    }
}
