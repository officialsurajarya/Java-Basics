package DSA_Solutions;

public class Trapping_RainWater {

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int leftMaxBon[] = new int[height.length];
        int rightMaxBon[] = new int[height.length];
        int waterLevel[] = new int[height.length];
        int trapped_Water[] = new int[height.length];

        //Left Max Boundary
        for (int i=1; i<height.length; i++){
            leftMaxBon[0] = height[0];
            if(leftMaxBon[i-1]<height[i]) {
                leftMaxBon[i] = height[i];
            }else{
                leftMaxBon[i] = leftMaxBon[i-1];
            }
        }

        //Right Max Boundary
        for(int i=height.length-2; i>-1; i--) {
            rightMaxBon[height.length-1] = height[height.length-1];
            if(rightMaxBon[i+1]<height[i]){
                rightMaxBon[i] = height[i];
            }else{
                rightMaxBon[i] = rightMaxBon[i+1];
            }
        }

        //Water Level
        for (int i = 0; i < height.length; i++) {
            if(leftMaxBon[i]>rightMaxBon[i]){
                waterLevel[i] = rightMaxBon[i];
            }else{
                waterLevel[i] = leftMaxBon[i];
            }
        }

        //Trapped Water
        for (int i = 0; i < height.length; i++) {
            trapped_Water[i] = waterLevel[i] - height[i];
        }

        //Output
        for (int i = 0; i < height.length; i++) {
            System.out.print(trapped_Water[i]+" ");
        }
    }
}

