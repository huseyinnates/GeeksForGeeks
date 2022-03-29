
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
           //Your code here
       Node currNode=head;
       String str="";
       while(currNode!=null)
       {
           str=str+currNode.data;
           currNode=currNode.next;
       }
       String rev="";
       for(int i=0;i<str.length();i++)
       {
           rev=str.charAt(i)+rev;
       }
       if(str.equals(rev)){
           return true;
       }
       
       else{
           return false;
       }
       
    }    
}

