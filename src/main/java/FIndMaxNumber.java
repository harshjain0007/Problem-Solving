public class FIndMaxNumber {
    public static void main(String[] args) {

        int[] number= {10, 26, 5, 1,98};

        int max=number[0];

        for(int j=0;j<number.length;j++) {
            System.out.println(" "+number[j]);
        }
        for (int  i =0; i<number.length;i++){
            if(number[i] >max){
                    max=number[i];
            }
        }
        System.out.println("Max number is " +max);


        int min=number[0];

        for (int i : number) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Min number is " + min);

    }
}
