
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
        int size=0;
        Node temp=head,trace=head;
        while(temp!=null){
           temp=temp.next;
           size++;
       }
        size/=2;
        size++;
      
       
        for(int i=0;i<size-1;i++){
           trace=trace.next;
       }
        return trace.data;
    }
}
