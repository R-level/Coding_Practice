package Add_2_Numbers;

public class Add_2_numbers {

    // Definition for singly-linked list.
     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     @Override
        public String toString(){
              ListNode head = this;
              StringBuilder s = new StringBuilder();
              do {
             s.append(head.val);
             head = head.next;
         }while(head!=null);
              return s.toString();
     }
     }

    public static void main(String[] args) {
         ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3,null)));
         ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
       System.out.println(addTwoNumbers(l1,l2).toString());
       System.out.println(improvedAddTwoNumbers(l1,l2).toString());
        System.out.println(recursiveAddTwoNumbers(l1,l2).toString());
    }

    private static ListNode improvedAddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
     }
    public static ListNode recursiveAddTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l1 == null) return l2;
        else if (l2 == null) return l1;

        int a = l1.val + l2.val;
        ListNode p = new ListNode(a % 10);
        p.next = recursiveAddTwoNumbers(l1.next, l2.next);
        if (a >= 10) p.next = recursiveAddTwoNumbers(p.next, new ListNode(1));
        return p;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            StringBuilder number1 = getListNumbers(l1);
            StringBuilder number2 = getListNumbers(l2);

            int n1= Integer.parseInt(number1.toString());
            int n2= Integer.parseInt(number2.toString());

            int sum = n1 + n2;

            return createList(sum);
        }

        public static StringBuilder getListNumbers(ListNode list){
            StringBuilder s = new StringBuilder();

            do{ s.append(list.val);
                list = list.next;
            }while(list!=null);

            return s.reverse();
        }

        public static ListNode createList(int sum){
            String sumString =  String.valueOf(sum);

            int i =0;
            ListNode head = null;
            while(i<=sumString.length()-1){
                if(i==0)
                { head = new ListNode(Integer.parseInt(String.valueOf(sumString.charAt(i))),null);
                }
                else{
                    ListNode node1 = new ListNode(Integer.parseInt(String.valueOf(sumString.charAt(i))),head);
                    head = node1;
                }
                i++;
            }
            return head;
        }
    }


