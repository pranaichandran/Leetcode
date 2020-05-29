package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //9th May - 3pm
        /*LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] input = {"apple","applebee","a"};
        System.out.println("Output is : "+ obj.CommonPrefix(input));*/
        //9th May - 11pm
        /*RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
        int[] input = {1,1,1,1,2,2,2,3,4,5,5,6,6,6,6,7};
        System.out.println("Output is : "+ obj.removeDuplicates(input));*/
        //10th May - 1pm
        /*RemoveElementArray obj = new RemoveElementArray();
        int[] input = {1,1,1,1,2,2,2,3,4,5,5,6,6,6,6,7};
        System.out.println("Output is : "+ obj.removeElement(input,1));*/
        //10th May - 2pm
        /*ImplementFindaSubstring obj = new ImplementFindaSubstring();
        System.out.println("Output is : "+ obj.strStr("","a"));*/
        //10th May - 8.30pm
        /*SearchInsertPosition obj = new SearchInsertPosition();
        int[] input = {1,3,5,6};
        System.out.println("Output is : "+ obj.searchInsert( input,2));*/
        //24th May 4.45pm
        /*RegexTrials rObj = new RegexTrials();
        Matcher m = rObj.createPatternAndReturnMatch("(\\d{3})-(\\d{3})-(\\d{4})","sdfsdjfhsdjfhsjdfhkhj 224-795-1461 sdfsdfdfdsf 479-268-0362");
        //System.out.println("Find Method : "+m.find());
        //System.out.println("Find Method with a start position :"+m.find(50));
        if(m.lookingAt())
        {
            System.out.println("Start : "+m.start());
        }
        while(m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
        System.out.println(m.replaceFirst("XXX-XXX-XXXX"));
        System.out.println(m.replaceAll("YYY-XXX-YYYY"));*/
        //24th May 8.10pm
        /*LengthOfLastWord l = new LengthOfLastWord();
        int x = l.funclengthOfLastWord("Hello World");
        System.out.println("The length of the Last word is : "+x);*/
        //25th May 7:40pm
        /*PlusOne obj = new PlusOne();
        int[] arr = {9,9};
        System.out.println("Output : "+(obj.plusOne(arr)).toString());*/
        /*LinkedList list = new LinkedList();
        list.printList(list);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(6);
        list.prepend(0);
        list.insertafterbyData(4,5);

        list.deletebyData(4);
        list.printList(list);*/

        // Doubly LinkedList Implementation

        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.append(1);
        dlist.append(2);
        dlist.printList(dlist);
        dlist.prepend(0);
        dlist.printList(dlist);
        dlist.deletebyValue(2);
        dlist.printList(dlist);
    }
}
