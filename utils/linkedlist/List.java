package utils.linkedlist;

import java.util.NoSuchElementException;

public class List {
    ListItem headNode = null;

    public List()
    {
        headNode = new ListItem();
    }

    public void appendToList(Object data)
    {
        ListItem cur = headNode;
        ListItem newItem = new ListItem();

        while (cur.link != null)
        {
            cur = cur.link;
        }

        newItem.data = data;

        cur.link = newItem;
    }

    public void prependToList(Object data)
    {
        ListItem pre = headNode;
        ListItem cur = headNode.link;
        ListItem newItem = new ListItem();

        pre.link = newItem;
        newItem.link = cur;

        newItem.data = data;
    }

    public void insertInList(int index, Object data)
    {
        ListItem pre = null;
        ListItem cur = headNode;
        ListItem newItem = new ListItem();

        int i = 0;

        while (cur.link != null)
        {
            pre = cur;
            cur = cur.link;

            if (i == index)
            {
                pre.link = newItem;
                newItem.link = cur;

                newItem.data = data;

                return;
            }

            i++;
        }
    }

    public void delete(int index)
    {
        ListItem pre = null;
        ListItem cur = headNode;

        int i = 0;

        while (cur.link != null)
        {
            pre = cur;
            cur = cur.link;

            if (i == index)
            {
                pre.link = cur.link;
                return;
            }

            i++;
        }
    }

    public Object value(int index)
    {
        ListItem cur = headNode;

        int i = 0;

        while (cur.link != null)
        {
            cur = cur.link;

            if (i == index)
            {
                return cur.data;
            }

            i++;
        }

        return null;
    }

    public int searchList(Object data)
    {
        ListItem cur = headNode.link;

        int i = 0;

        while (cur != null)
        {
            if (cur.data != null && cur.data.equals(data))
            {
                return i;
            }
            cur = cur.link;

            i++;
        }

        throw new NoSuchElementException("Element '" + data + "' not found in the list.");
    }

    public int size()
    {
        ListItem cur = headNode;

        int i = -1;

        while (cur.link != null)
        {
            cur = cur.link;

            i++;
        }

        return i + 1;
    }
}