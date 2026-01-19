package new_lesson.lesson_2;

import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
//    CompletableFuture.supplyAsync(() -> "Hello")
//            .thenApply(s -> s + " World")
//            .thenAccept(System.out::println)
//            .exceptionally(e -> {
//              System.out.println("Error: " + e);
//              return null;
//            });

    ExecutorService executor2 = Executors.newCachedThreadPool();
    ExecutorService executor = Executors.newSingleThreadExecutor();

    // Создаем Callable задачу
    Callable<String> task = () -> {
      Thread.sleep(1000);
      return "Результат из Callable";
    };

    // Запускаем задачу и получаем Future
    Future<String> future = executor.submit(task);

    // Делаем что-то еще, пока задача выполняется
    System.out.println("Ждем результат...");

    // Получаем результат (блокируется, пока задача не завершится)
    String result = future.get();
    System.out.println("Получен результат: " + result);

    executor.shutdown();
  }
}
