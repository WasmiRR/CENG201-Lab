package project;

public class Node <T>{

    T data;
    Node<T> next;

    //<T> ( generic ) yapıyoruz çünkü ileride aynı node yapısını tekrar tekrar farklı classlarda kullanabiliriz.
    public Node(T data){
        this.data = data;
        this.next = null;
        //Yeni bir düğüm oluştururken veriyi alırız, sonraki düğümü şimdilik null yaparız.
    }
}
