package com.wrx.js.web.wangrx;

public class Link_Reverse {

    public static void main(String[] args) {
        Node node5 = null;
        Node node4 = new Node("4",node5);
        Node node3 = new Node("3",node4);
        Node node2 = new Node("2",node3);
        Node node1 = new Node("1",node2);

        print(node1);


        //print(reverse(node1));

        print(deleteN(node1,2));

    }

    public static void  print (Node link){

        while (link != null){
            System.out.print(link.data + "->");
            link = link.next;
        }
        System.out.println();
    }


    //链表反转
    public static Node linkReverse(Node link){
        Node pre = null;
        Node curr = link;
        while (curr != null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    /**
     * 删除第n个node
     */
    public static Node deleteNth(Node link,int n){
        //快指针
        Node fast = link;
        int i=0;
        while (i < n){
            fast = fast.next;
            if(fast == null){
                return link;
            }
            i++;
        }

        //慢指针
        Node slow = link;
        Node pre = null;
        while (fast != null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = pre.next.next;
        return link;
    }

    public static class Node{
        private String data;
        public Node next;

        public Node(String data, Node node) {
            this.data = data;
            this.next = node;
        }

        public String  getDate(){
            return data;
        }

    }


    public static Node reverse(Node link){
        Node pre = null;
        Node curr = link;

        while (curr != null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public  static Node deleteN(Node link,int n){
        Node fast = link;
        int i = 0;
        while (i < n){
            fast = fast.next;
            if (fast == null){
                return link;
            }
            i++;
        }

        Node slow = link;
        Node pre = null;

        while (fast != null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = pre.next.next;
        return link;
    }
}


