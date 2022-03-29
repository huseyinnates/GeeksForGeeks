
class Solution
{
    Node arr;
    //Function to reverse a linked list.
    Node reverseList(Node head)
    { 
        Node previous=null,current=head,next=null;
        if(head==null){
            return null;
        }
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    
    
    
}
