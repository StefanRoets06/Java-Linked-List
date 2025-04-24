package utils.linkedlist;

import java.util.NoSuchElementException;

public class List<T> {
    private ListItem<T> headNode;
    private int size;

    public List() {
        headNode = null;
        size = 0;
    }

    public void appendToList(T data) {
        ListItem<T> newItem = new ListItem<>();
        newItem.data = data;

        if (headNode == null) {
            headNode = newItem;
        } else {
            ListItem<T> cur = headNode;
            while (cur.link != null) {
                cur = cur.link;
            }
            cur.link = newItem;
        }
        size++;
    }

    public void prependToList(T data) {
        ListItem<T> newItem = new ListItem<>();
        newItem.data = data;
        newItem.link = headNode;
        headNode = newItem;
        size++;
    }

    public void insertInList(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        ListItem<T> newItem = new ListItem<>();
        newItem.data = data;

        if (index == 0) {
            newItem.link = headNode;
            headNode = newItem;
        } else {
            ListItem<T> cur = headNode;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.link;
            }
            newItem.link = cur.link;
            cur.link = newItem;
        }
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        if (index == 0) {
            headNode = headNode.link;
        } else {
            ListItem<T> cur = headNode;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.link;
            }
            cur.link = cur.link.link;
        }
        size--;
    }

    public T value(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        ListItem<T> cur = headNode;
        for (int i = 0; i < index; i++) {
            cur = cur.link;
        }
        return cur.data;
    }

    public int searchList(T data) {
        ListItem<T> cur = headNode;
        int index = 0;

        while (cur != null) {
            if (cur.data != null && cur.data.equals(data)) {
                return index;
            }
            cur = cur.link;
            index++;
        }

        throw new NoSuchElementException("Element '" + data + "' not found in the list.");
    }

    public int size() {
        return size;
    }
}