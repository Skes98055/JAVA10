class Caaa{
    public int num1;
    public int num2;
    public Caaa(int a,int b){
            num1=a;num2=b;
    }
}
class Cbbb extends  Caaa{
    //public Cbbb() {
    //}
    public  Cbbb(int a,int b){
        super(a,b);
    }
    public void show(){
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
public class Class03 {
    public static void main(String[] args) {
        Cbbb bb=new Cbbb();
        bb.set_num(5,10);
        bb.show();bb.show();
    }
}