package midterm;
/*
 *  Time complexity:O(n+m)
 *  Space complexity:O(1)
 */
class ListNode{
    
	int val;
    ListNode next;
    ListNode(){
    	
    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class q1 {
	public static void main(String[] args) {
		 ListNode n1 = new ListNode(45,new ListNode(77,new ListNode(88,new ListNode(90,new ListNode(95)))));
	     ListNode n2 = new ListNode(23,new ListNode(85,new ListNode(88,new ListNode(93,new ListNode(95)))));

	     System.out.println("Given example is: " + areConverging(n1,n2));
	}
	private static int getLength(ListNode node){
        int count = 0;
        ListNode head = node;
        while(head != null){
            count += 1;
            head = head.next;
        }
        return count;
    }
	public static boolean areConverging(ListNode n1, ListNode n2){

        int len1 = 0, len2 = 0;
        len1 = getLength(n1);
        len2 = getLength(n2);
        ListNode p1 = n1, p2 = n2;

        int difference = Math.abs((len1-len2));
        for(int i = 0; i < difference;i++){
            if(len1 > len2) {
                p1 = p1.next;
            }
            else if(len2 > len1){
                p2 = p2.next;
            }
        }

        while(p1!= null && p2 != null){
            if(p1 == p2){
                return true;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return false;
    }

}
