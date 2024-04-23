import java.util.HashMap;
import java.util.Map;

public class memDB implements InMemoryDB{
    Map<String, Integer> database = new HashMap<>();
    Map<String, Integer> tempDatabase = new HashMap<>();
    boolean inTransaction = false;

    public Integer get(String key){
        return database.get(key);
    }

    public void put(String key, int val){
        //Check if in transaction
        if(!inTransaction) throw new RuntimeException("not in transaction!");

        //creates new or updates key/val pair
        tempDatabase.put(key, val);
    }

    public void begin_transaction(){
        if(!inTransaction){
            inTransaction = true;
        }else{
            System.out.println("Already in transaction!");
        }
    }

    public void commit(){
        //Check if a transaction is open
        if(!inTransaction) throw new RuntimeException("not in transaction!");
        //Apply changes
        database = new HashMap<>(tempDatabase);
        //close transaction
        inTransaction = false;
    }

    public void rollback(){
        //Check if a transaction is open
        if(!inTransaction) throw new RuntimeException("not in transaction!");
        //reset tempDatabase
        tempDatabase = new HashMap<>(database);
        //close transaction
        inTransaction = false;
    }
}
