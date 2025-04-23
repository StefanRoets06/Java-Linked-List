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

        if (cur.index >= 0) {
            newItem.index = cur.index + 1;
        }
        else
        {
            newItem.index = 0;
        }

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
        newItem.index = 0;

        while (cur != null)
        {
            cur.index += 1;
            pre = cur;
            cur = cur.link;
        }
    }

    public void insertInList(int index, Object data)
    {
        ListItem pre = null;
        ListItem cur = headNode;
        ListItem newItem = new ListItem();

        while (cur.link != null)
        {
            pre = cur;
            cur = cur.link;

            if (cur.index == index)
            {
                pre.link = newItem;
                newItem.link = cur;

                newItem.data = data;
                newItem.index = index;

                cur.index += 1;

                while (cur.link != null)
                {
                    pre = cur;
                    cur = cur.link;

                    cur.index += 1;
                }
                return;
            }
        }
    }

    public void delete(int index)
    {
        ListItem pre = null;
        ListItem cur = headNode;

        while (cur.link != null)
        {
            pre = cur;
            cur = cur.link;

            if (cur.index == index)
            {
                pre.link = cur.link;

                ListItem temp = cur.link;
                while (temp != null)
                {
                    temp.index -= 1;
                    temp = temp.link;
                }
                return;
            }
        }
    }

    public Object value(int index)
    {
        ListItem cur = headNode;

        while (cur.link != null)
        {
            cur = cur.link;

            if (cur.index == index)
            {
                return cur.data;
            }
        }

        return null;
    }

    public int searchList(Object data)
    {
        ListItem cur = headNode.link;

        while (cur != null)
        {
            if (cur.data != null && cur.data.equals(data))
            {
                return cur.index;
            }
            cur = cur.link;
        }

        throw new NoSuchElementException("Element '" + data + "' not found in the list.");
    }

    public int size()
    {
        ListItem cur = headNode;

        while (cur.link != null)
        {
            cur = cur.link;
        }

        return cur.index + 1;
    }
}