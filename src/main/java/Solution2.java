import java.util.Arrays;

class Solution2 {
    public int solution(int[] array) {
        int answer = 0;

        for(int i=0;i<array.length;i++){
            for(int j=0; j<array.length; j++){
                if(array[i]>array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        answer = array[array.length/2];

        return answer;
    }
}