
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
       int size=0;
       Node temp=head,trace=head;
       while(temp!=null){
           temp=temp.next;
           size++;
       }
       if(n>size){
           return -1;
       }
       for(int i=0;i<size-n;i++){
           trace=trace.next;
       }
       return trace.data;
    }
}
