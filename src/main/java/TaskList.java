import java.util.ArrayList;
public class TaskList {

    private ArrayList<Task> list;

    public TaskList (ArrayList<Task> list) {
        this.list = list;
    }
    public TaskList () {
        this.list = new ArrayList<>();
    }
    public void printForList() {
        for(int i = 1; i <= list.size(); i++) {
            System.out.println(i + "." + list.get(i-1));
        }
    }

    public void taskDone(int x) {
        list.get(x).markAsDone();
    }
    public Task taskPrint(int x) {
        return list.get(x);
    }
    public Task printLatest() {
        return list.get(list.size() - 1);
    }
    public int size() {
        return list.size();
    }
    public void remove(int x) {
         list.remove(x);
    }
    public void add(Task newTask) {
        list.add(newTask);
    }
    public Task getLast() {
        return list.get(list.size() -1);
    }
    public ArrayList<Task> getList() {
        return list;
    }

}
