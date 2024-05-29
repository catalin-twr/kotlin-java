package demo.entity;

public record Employee(int id, String name, int departmentId) {

  @Override
  public String toString() {
    return String.format("id: %d, name: %s, department: %d", id, name, departmentId);
  }

}
