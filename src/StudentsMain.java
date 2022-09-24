import java.util.*;
public class StudentsMain{
    public static void main(String args[]){
        ArrayList<Students> xy=new ArrayList<Students>();
        xy.add(new Students(10,"Ajin",87));
        xy.add(new Students(9,"Binu",90));
        xy.add(new Students(55,"Kevin",10));

        Collections.sort(xy);
        for(Students st:xy){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
