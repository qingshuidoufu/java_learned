package arrys;

public class TestArrys01 {
    public static void main (String[] args){
        int[] arr01=new int[10];
        String[] arr02=new String[5];
        User[] arr03=new User[3];
        arr01[0]=13;
        arr01[1]=15;
        arr01[2]=20;
        for (int i=0;i<10;i++){
            arr01[i]=10*i;
        }
        for (int i=0;i<10;i++){
            System.out.println(arr01[i]);
        }
    }
}
class User{
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
