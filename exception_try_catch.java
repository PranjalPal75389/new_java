public class exception_try_catch {
    public static void main(String[]args){
        System.out.println("hello world");
int arrays[]={3,4,5};
        try {
            System.out.println(arrays[3]);
        }
        catch (Exception zoro){
            System.out.println("Hello zoro");

        }
        finally{
            System.out.println("this is the result that will print what ever the result is");
        }
    }
}
