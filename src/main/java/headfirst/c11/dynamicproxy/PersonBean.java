package headfirst.c11.dynamicproxy;

/**
 * @author Wusd
 * @date 2025/9/5
 * @description
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
