package classes;

import interfaces.Humanoid;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.Random;

public class RandomExplosion implements Subject {

    ArrayList<Context> humanoids = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
     humanoids.add((Context) o);
    }

    @Override
    public void removeObserver(Observer o) {
        humanoids.remove(o);
    }

    private int getRandomExplosion(int damage, Observer observer) {
        switch (damage) {
            case 1:
                System.out.println(String.format("Неожиданное падение штукатурки на %s наносит %s урона", ((Context) observer).getName(), damage));
                break;
            case 2:
                System.out.println(String.format("Незапланированное падение для %s наносит %s урона", ((Context) observer).getName(), damage));
                break;
            case 3:
                System.out.println(String.format("Кто закрыл эту дверь?!! %s наносится %s урона", ((Context) observer).getName(), damage));
                break;
            case 4:
                System.out.println(String.format("Неожиданный взрыв горючих материалов?!! наносит для %s %s урона",((Context) observer).getName(),  damage));
                break;
            case 5:
                System.out.println(String.format("На %s обвалился потолок, наносит %s урона",((Context) observer).getName(),  damage));
                break;
        }
        return damage;
    }

    @Override
    public void notifyObservers() {
        int randomDamage = new Random().nextInt(5) + 1;
        for(Observer observer : humanoids) {
            observer.update(getRandomExplosion(randomDamage, observer));
        }
    }

    public void generateRandomEvent() {
        if(new Random().nextInt(20) == 19) {
            notifyObservers();
        }
    }
}
