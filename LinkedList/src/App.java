import org.w3c.dom.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Linked List");

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        // printLL(addFirst(n1, 15));
        // printLL(addLast(n1, 15));
        // printLL(addAt(n1, 13, 2));
        // printLL(removeFirst(n1));
        // printLL(removeLast(n1));
        // printLL(removeAt(n1, 1));
        printLL(n1);
        System.out.println();
        // System.out.println(searchK(n1, 40));
        System.out.println(findMid(n1));
        
    }

    public static class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
        }

        Node(Node node){
            this.data = node.data;
            this.next = node.next;
        }
    }

    public static void printLL(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static Node addFirst(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    public static Node addLast(Node head, int value){
        Node newNode = new Node(value);
        Node curr = new Node(head);
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

     public static Node addAt(Node head, int value, int index){
        Node newNode = new Node(value);
        if(head == null){
            return null;
        }
        Node prev = new Node(head);
        Node curr = new Node(head);
        int i = 0;
        int length = 0;
        if(index == 0){
            addFirst(head, value);
        }
        while(curr != null){
            curr = curr.next;
            length++;
        }
        curr = head;
        // System.out.println(length);
        if(length < index){
            System.out.println("Index out of bounds");
            return null;
        }
        while(curr != null){
            // System.out.println(curr.data);
            if(i == index){
                newNode.next = curr;
                prev.next = newNode;
                break;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        return head;
    }

    public static Node removeFirst(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    public static Node removeLast(Node head){
        Node prev = new Node(head);
        Node curr = new Node(head);
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return head;
    }

    public static Node removeAt(Node head, int index){
        if(head == null){
            return null;
        }
        Node prev = new Node(head);
        Node curr = new Node(head);
        int i = 0;
        int length = 1;
        if(index == 0){
            removeFirst(head);
        }
        while(curr != null){
            curr = curr.next;
            length++;
        }
        curr = head;
        // System.out.println(length);
        if(length <= index){
            System.out.println("Index out of bounds");
            return null;
        }
        if(index == length-1){
            removeLast(head);
        }
        while(curr != null){
            // System.out.println(curr.data);
            if(i == index){
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }
        return head;
    }

    public static boolean searchK(Node head, int K){
        System.out.println("Search K:" + K + " in LL");
        Node curr = head;
        while(curr != null){
            if(curr.data == K){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static int findMid(Node head){
        System.out.println("Find mid in LL");
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
