package com.datastructuredemo;

public class MyLinkedList<K> {
    public INode<K> tail;
    public INode<K> head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public void printMyNodes() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + head + '}';
    }


    public INode<K> search(K key) {
        if (head == null)
            return null;

        INode<K> tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key))
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;

    }

    public INode pop() {
        if(head==null) {
            System.out.println("Linked List is empty");
            head=null;
        }
        else {
            INode<K> temp=head.getNext();
            head=temp;

        }
        return head;
    }
}
