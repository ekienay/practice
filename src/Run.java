import model.Member;
import model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        User user = new Member("roma","backend");
        User user1 = new Member("alex","front");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);


        System.out.println(Arrays.toString(conv(User.class, list)).replace("[","").replace("]",""));
    }

    public static <Obj> Obj[] conv(Class<Obj> obClass, List<Obj> objList){
        Obj[] objArray = (Obj[]) Array.newInstance(obClass,objList.size());
        for(int it = 0; it < objList.toArray().length; it++){
            objArray[it] = objList.get(it);
        }
        return objArray;
    }
}
