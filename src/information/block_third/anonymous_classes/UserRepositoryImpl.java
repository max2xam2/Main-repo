package information.block_third.anonymous_classes;

public class UserRepositoryImpl implements UserRepository {
  @Override
  public void addUser(String name) {
    System.out.println("User save in cache");
  }
}
