package easy;

public class EasyLList {

    class ListNode{

        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

 /*
  R�mov� Dups! Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

Input list 1 > 2 > 3 > 2
Output >> 1 > 2 >> 3
CTCI >> Page 208
  */

    public static ListNode removeDupWithoutDS(ListNode head){
        ListNode pt1 = head;
        ListNode pt2;
        ListNode previous2 = pt1;//it is a pointer of previous of pt2
        while(pt1.next !=null){ //will go till last second node
            pt2 = pt1.next;
            while(pt2 !=null){ //will go till last node

                if(pt1.val == pt2.val){//dup found, remove pt2
                   previous2.next = pt2.next; //previous wont move to next but its next pointer will now point to another node
                }else{//dup not found
                    previous2 = pt2; //previous will move to next node only if dup not found
                }
                pt2 = pt2.next; //this will always move top next whether or not dup found
            }

           // previous1 = pt1;
            pt1 = pt1.next;

        }

        return head;
    }

//CTCI >> Page 208
    public static ListNode removeDupWithDS(ListNode head){

        ListNode pt1 = head;
        ListNode previous = null;
        Set<Integer> set = new HashSet<Integer>();

        while(pt1 !=null){
            if(set.contains(pt1.val)){ //means dup found
                previous.next = pt1.next; //previous wont move to next but its next pointer will now point to anotheer node

            }else{
                set.add(pt1.val);
                previous = pt1; //previous will move to next node only if dup not found
            }


            pt1 = pt1.next;  //this will always move top next whether or not dup found
        }

        return head;


    }


/*
  R�mov� Dups! Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

Input list 1 > 2 > 3 > 2 [remove all occurances of dup element]
Output >> 1 > >> 3
https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/

  */

    /*
     Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
     */

    /*
     Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
EXAMPLE
lnput:the node c from the linked lista->b->c->d->e->f
Result: nothing is returned, but the new linked list looks likea->b->d->e- >f
     */
}
