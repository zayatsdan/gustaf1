
public class qw {
    private static int x = 9;
    private static int y =13;
    private static int [] mass;

    public static void main(String[] args) {
        change();
    }

    private static void change(){
        mass =new int[x];

        for (int i = 0; i < x; i++) {
            mass[i]=i+1;
        }
        System.out.println();
        int total=0;
        int big = 0;

        for(big=x-1;big>=-1;big--){

            if(total<y&&big>0){
                int b = 0;
                int a = 0;
                int counter=0;
                for (int z = x-big-1; z < x ; z++) {
                    if (counter == 0) {
                        b = mass[z + 1];
                        mass[z + 1] = mass[z];
                        counter++;
                    } else if ((z < x - 1)) {
                        a = mass[z + 1];
                        mass[z + 1] = b;
                        b = a;
                    } else {
                        mass[x - big - 1] = b;
                    }
                }
            }
            else if(total>=y&&big>=0){
                if(total==y){
                    for (int p = 0; p < x; p++) {
                        System.out.print(mass[p] + " ");
                    }
                    System.out.println();
                    System.out.print(big);
                    break;
                }
                else{
                    int a=0;
                    int b=0;

                    for(int j=0;;j++){
                        a= mass[x-big-1+j];
                        mass[x-big-1+j]= mass[x-big-2+j];
                        mass[x-big-2+j]=a;
                        if(total-j-1==y){
                            for (int p = 0; p < x; p++) {
                                System.out.print(mass[p] + " ");
                            }
                            System.out.println();
                            break;
                        }
                    }
                    break;
                }

            }
            else if (big<0){
                System.out.print(-1);
                break;
            }
            total=total+big;
        }


    }
}
