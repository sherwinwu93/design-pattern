package headfirst.c01;

import java.util.Optional;
import java.util.Random;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        Child child = new Child();
        Arm arm = new Arm();
        arm.setLength(10);
        child.setArm(arm);
        family.setChild(child);
        Integer length = Optional.ofNullable(family)
                .map(Family::getChild)
                .map(Child::getArm)
                .map(Arm::getLength)
                .orElse(randomInt());
        System.out.println(length);
    }
    public static Integer randomInt() {
        System.out.println("randomInt...");
        Random random = new Random(47);
        return random.nextInt(1000);
    }
}
