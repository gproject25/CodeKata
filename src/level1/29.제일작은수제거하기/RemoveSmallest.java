public class RemoveSmallest {
    public int[] solution(int[] arr) {
        if(arr.length == 1)
            return new int[]{-1};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }    

        int[] answer = new int[arr.length - 1];
        int j = 0;
        for (int k=0; k<arr.length; k++) {
            if (arr[k] != min) {
                answer[j] = arr[k];
                j++;
            }
        }
        return answer;
    }    

    public static void main(String[] args) {
        RemoveSmallest removeSmallest = new RemoveSmallest();
        int[] answer = removeSmallest.solution(new int[] {4,3,2,1});
        System.out.println(answer[2]);
    }
    
}
