public class linearSearch {
    public static void main(String[] args) {
        
        // search in the array
        // return the index if found if not then return -1

        int[] numbers = { 23, 45, 6, -23, 56, 6, -43, 87, 96 };
            int target = 87;
            int ans = linearsearch(numbers, target);
            System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                System.out.println(element);
                return index;
                
            }
            
        }

        return -1;
    }

    
}



// So this is linear Search algorithm. so simple
