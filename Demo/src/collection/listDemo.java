package collection;
import java.util.*;

public class listDemo {
    public static void main(String[] args){
        List<Note> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Note note = new Note(input.nextInt(),input.next());
        list.add(note);
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        String[] p = {"i","am","okay","thank","you"};
        String[] q = {"thank","you"};
        for(String x : p)
            a.add(x);
        for(String y : q)
            b.add(y);
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");

        editedList(a,b);
        System.out.println();

        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
        for(Note x:list)
        {
            System.out.println(x.getId()+" "+x.getTitle());
        }
        System.out.println(deleteNote(1,list));
        System.out.println(exists(1, list));
    }



public static void editedList(Collection<String> x, Collection<String> y){
    Iterator<String> it = x.iterator();
    while(it.hasNext()){
       if(y.contains(it.next()))
           it.remove();
    }

 }
    public static boolean deleteNote(int noteId,List<Note> list) {
        /* Use list iterator to find matching note id and remove it from the list */
       // List<Note> list = new ArrayList<>();
        Iterator<Note> it = list.iterator();
        while(it.hasNext())
        {   int n = it.next().getId();
            System.out.println(n);
            if(noteId == n) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    public static boolean exists(int noteId,List<Note> list) {
        Iterator<Note> it = list.iterator();
        while(it.hasNext())
        {
            if(noteId == it.next().getId())
                return true;
        }
        return false;
    }
}