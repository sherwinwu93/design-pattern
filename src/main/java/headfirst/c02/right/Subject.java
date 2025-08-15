package headfirst.c02.right;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
