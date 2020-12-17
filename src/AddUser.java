import Resources.MotherBase;
import Resources.User;

public class AddUser implements Command {
    MotherBase base;

    public AddUser(MotherBase base){
        this.base = base;
    }
    public void execute() {
        User user = new User();
        user.createUser(base);
        base.AddUser(user);
    }
}
