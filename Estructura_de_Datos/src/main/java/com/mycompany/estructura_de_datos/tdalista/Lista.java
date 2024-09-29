package com.mycompany.estructura_de_datos.tdalista;

public class Lista {

    private Nodo head;
    private int size;

    public Lista() {//Metodo contructor Lista - Crear
        this.head = null;
        this.size = 0;
    }

    public int getSize() {//Metodo tamaño o dimension
        return size;
    }

    public boolean isEmpty() {//Metodo esta Vacio
        return head == null;
    }

    public void addFirst(Object data) {//Metodo agregar primero
        Nodo newNode = new Nodo(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(Object data) {//Metodo agregar ultimo
        Nodo newNode = new Nodo(data);
        if (isEmpty()) {
            head = newNode;

        } else {
            Nodo current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next =newNode;
        }
        size++;
    }
    
    public void insert(Object data, int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Indice fuera de los Limites");
        }
        if (index == 0){
            addFirst(data);
        }else{
            Nodo newNode = new Nodo(data);
            Nodo current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }
    
    public Object removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("La lista esta vacia");
        }
        Object data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    public Object removeLast(){
        if (isEmpty()){
            throw new IllegalStateException("La lista esta Vacia");
        }
        if(head.next == null){
            return removeFirst();
        }
        Nodo current = head;
        
        while(current.next.next != null){
            current = current.next;
        }
        Object data = current.next.data;
        current.next = null;
        size--;
        return data;
    }
    
    public Object remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Indice fuera de los Limites");
        }
        if(index == 0){
            return removeFirst();
        }
        Nodo current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Object data = current.next.data;
        current.next = current.next.next;
        size--;
        return data;
    }
    
    public Object get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Indice fuera de los limites");
        }
        Nodo current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    
    public boolean contains(Object data){
        Nodo current = head;
        while (current != null){
            if (current.data.equals(data)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void printList(){
        Nodo current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
