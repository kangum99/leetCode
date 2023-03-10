/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        int val = 0;
        
        if(head.next == null) {
            return head;
        }
        ListNode copy = new ListNode(head.val, head.next);
        while (true) {
            val = copy.val;
            cnt++;
            //다음노드의 다음이 없을 때 cnt에 한번더 +1 하고 break
            //다음노드의 다음이 없음 = 다음노드가 마지막 노드임
            if(copy.next.next == null) {
                cnt++;
                break;
            }
            copy = new ListNode(copy.next.val, copy.next.next);            
        }
        //ans의 시작이 될 노드 값
        int middleNode = cnt/2 + 1;
        ListNode ans = new ListNode(head.val, head.next);
        //뒤에 노드부터 넣어주기
        for(int i = 2; i <= middleNode; i++) {
            ans = new ListNode(ans.next.val, ans.next.next);
            //System.out.println(ans.val);
        }
        return ans;
    }
}