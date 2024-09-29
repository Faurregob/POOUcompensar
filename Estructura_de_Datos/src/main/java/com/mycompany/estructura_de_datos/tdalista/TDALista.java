package com.mycompany.estructura_de_datos.tdalista;
public class TDALista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        //Agregar elementos
        lista.addFirst("B");
        lista.addLast("C");
        lista.addFirst("A");
        lista.insert("D",3);
        
        //Imprimir Lista
        lista.printList(); //Output A -> B -> C -> D -> null
        
        //Obtener elementos
        System.out.println("Element at index 2: "+lista.get(2)); //Output: c
        
        //Verificar si contiene un elemento
        System.out.println("Contains 'B': "+lista.contains("B")); //Output: true
        
        //Remover elementos
        lista.removeFirst();
        lista.removeLast();
        lista.remove(1);
        
        //Imprimir lista despues de remover
        lista.printList();//Output: B -> null
        
        //Tamaño de la lista
        System.out.println("Size of list: "+lista.getSize());
        
        
              
        
    }
}
