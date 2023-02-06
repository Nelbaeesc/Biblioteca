public class ListaSE<T> {

    private int size;
    private Nodo<T> head;
    private Nodo<T> tail;

    public ListaSE(){
        size = 0;
        head = null;
        tail = null;
    }

    public void addHead(T info){
        Nodo<T> aux = new Nodo<>(info);
        if (head == null)
            head = aux;
        else {
            aux.setNext(head);
            head = aux;
        }
        size++;
    }

    public void addTail(T info){
        Nodo<T> nodo = new Nodo<>(info);
        if (head == null)
            head = nodo;
        else {
            Nodo<T> aux = head;
            while (aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(nodo);
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    class Nodo<T>{
        private T info;
        private Nodo<T> next;
        private Nodo<T> previous;

        public Nodo(T info){
            this.info = info;
            this.next = null;
        }
        public Nodo<T> getPrevious(){
            return previous;
        }
        public void setNext(Nodo<T> next){
            this.next = next;
        }
        public T getInfo(){
            return info;
        }
        public Nodo<T> getNext(){
            return next;
        }
    }
}
