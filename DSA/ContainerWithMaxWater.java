public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0;
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int width =j-i;
        //         int height = Math.min(arr[i], arr[j]);
        //         int area = width*height;
        //         maxWater = Math.max(maxWater, area);
        //     }
        // }

        //optimal Solution
        int left = 0;
        int right = height.length-1;

        for(int i=0;i<height.length;i++){
            int width = right-left;
            int ht = Math.min(height[right],height[left]);
            if(ht == height[right]){
                right--;
            }else{
                left++;
            }
            int area = width*ht;
            maxWater = Math.max(maxWater, area);
        }


        System.out.println(maxWater);
    }
}
