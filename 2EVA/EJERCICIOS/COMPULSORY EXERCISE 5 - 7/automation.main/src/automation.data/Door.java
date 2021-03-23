package automation.data;

public class Door extends AutomationElement implements Locker {
  String status;
  GarageDoor garageDoor;

  public Door(String name, String status){

    super(name);
    this.status = status;

  }

  public String getStatus() {
    return status;
  }

  public GarageDoor getGarageDoor() {
    return garageDoor;
  }

  @Override
  public void lock() {

    status = "Door is currently close";
  }

  @Override
  public void unLock() {

   status = "Door is currently open";

  }

  @Override
  public String toString() {
    return super.toString() + " " + status;

  }
}
