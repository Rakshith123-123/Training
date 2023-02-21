public class ObjectCreation {

    private static int objCount = 0;
    private static ObjectCreation object;
    private ObjectCreation(){
        objCount++;
        System.out.println("Restricted object creation "+objCount);
    }

    public static ObjectCreation getInstance(){
        if(objCount < 5){
            object = new ObjectCreation();
        }else{
            System.out.println("Instance are restricted for creation up to 5");
        }
        return object;
    }
}
