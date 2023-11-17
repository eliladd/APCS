public class ArrayDemo {
    public static void main(String[] args){
        System.out.println("demo1: ");
        int[] nums = new int[5];
        nums[0] = (int)Math.floor(Math.random() * (15 - 1 + 1) + 1);
        nums[1] = (int)Math.floor(Math.random() * (15 - 1 + 1) + 1);
        nums[2] = (int)Math.floor(Math.random() * (15 - 1 + 1) + 1);
        nums[3] = (int)Math.floor(Math.random() * (15 - 1 + 1) + 1);
        nums[4] = (int)Math.floor(Math.random() * (15 - 1 + 1) + 1);
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3] + " " + nums[4]);
        System.out.println("demo2: ");
        int[] nums2 = new int[25];
        for (int index = 0; index < nums2.length; index++){
            nums2[index] = (int)Math.floor(Math.random() * (9 - 1 + 1) + 1);
        }
        for(int index=0; index<nums2.length; index++){
            System.out.print(nums2[index] + " ");   	
        }
        System.out.println("demo3: ");
        String[] words = {"HI", "My name is ELI", "i have come to fry", "and eat the pie,", "in the sky"}; 
        for(int index=0; index<words.length; index++){
            System.out.println(words[index]);   	
        }

    }    
}
