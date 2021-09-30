package telusko;
class SelectionDemo
{
    public static void main(String[] args){
        String d = "abc";

        switch(d)
        {
            case "abc":
            System.out.println("one");
            break;

            case "pqr":
            System.out.println("two");
            break;

            default:
            System.out.println("No match");
        }
    }
}