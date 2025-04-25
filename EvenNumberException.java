public class EvenNumberException {
    public static void CheckNumber(int number)throws Exception{
        if (number % 2 == 0){
            throw new Exception("Even number is not allowed" + number);
                }else{
                    System.out.println("valid odd number:" + number);
                }
    }
    public static void main(String[]args){
        try{
            CheckNumber(4);
        }catch(Exception e){
            System.out.println("Exception caught" +e.getMessage());
        }
    }
}
