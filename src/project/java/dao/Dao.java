package project.java.dao;

public class Dao {

    private static Dao instance;

    public RoleDao role;
    public UserDao user;
    public CarDao car;
    public OrderDao order;

    private Dao() {
        role = new RoleDao();
        user = new UserDao();
        car = new CarDao();
        order = new OrderDao();
    }

    public static Dao getDao(){
        if(instance == null){
            synchronized (Dao.class){
                if(instance==null){
                    instance = new Dao();
                }
            }
        }
        return instance;
    }

    public void reset(){
        Reset.main(new String[0]);
    }
}
