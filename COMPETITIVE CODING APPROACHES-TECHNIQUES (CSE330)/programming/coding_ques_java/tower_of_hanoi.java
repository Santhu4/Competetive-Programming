public class tower_of_hanoi {
    void static TOH(int n,char beg,char aux,char end){
        if(n == 1){
            System.out.println("Move Disk "+n+"from"+beg+"to"+end);
            return;
        }else{
            TOH(n-1,beg,end,aux);
            System.out.println("Move Disk "+n+"from"+beg+"to"+end);

        }
    }
    public static void main(String[] args) {
        
    }
}
