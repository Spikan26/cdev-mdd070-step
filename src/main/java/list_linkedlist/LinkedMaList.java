package list_linkedlist;

import java.util.Iterator;

public class LinkedMaList implements MaList {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (first == null) {
            first = new Node();
            first.setValeur(valeur);
            last = first;
        } else {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            last.setNext(newLast);

            this.last = newLast;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
        Integer currentPosition = 1;
        Node currentNode = first;

        //On crée notre nouvelle node avec la valeur
        Node newNode = new Node();
        newNode.setValeur(valeur);

        //On parcourt la chaine
        while (currentNode.getNext() != null){
            //On trouve la node situé avant notre insertion
            if(currentPosition+1 == position){
                Node prevNode = currentNode;
                Node afterNode = currentNode.getNext();

                prevNode.setNext(newNode);
                newNode.setNext(afterNode);
                size++;
            }

            currentNode = currentNode.getNext();
            currentPosition++;
        }

    }

    @Override
    public String get(int position) {
        Node currentNode = first;

        for (int i = 0; i < size; i++) {
            if(i == position){
                return currentNode.getValeur();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public Iterator<String> iterator() {
        //TODO
        return null;
    }

}
