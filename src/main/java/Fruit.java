import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Getter
@Setter
public class Fruit {
    private String name;
    private String color;

    Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }

    List<Fruit> extractRed(List<Fruit> fruitList){
        List<Fruit> resultList = new ArrayList<>();
        for(Fruit fruit : fruitList){
            if("red".equals(fruit.getColor())){
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    List<Fruit> extractApple(List<Fruit> fruitList){
        List<Fruit> resultList = new ArrayList<>();
        for(Fruit fruit : fruitList){
            if("apple".equals(fruit.getName())){
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    List<Fruit> extractFruitList(List<Fruit> fruits, Predicate<Fruit> predicate){
        List<Fruit> resultList = new ArrayList<>();
        for(Fruit fruit : fruits){
            if(predicate.test(fruit)){
                resultList.add(fruit);
            }
        }
        return resultList;
    }

    List<Fruit> fruitList = Arrays.asList(new Fruit("apple","red"),new Fruit("banana","yello"),new Fruit("pineApple","white"));
    List<Fruit> appleList = extractFruitList(fruitList, new Predicate<Fruit>() {
        @Override
        public boolean test(Fruit fruit) {
            return "apple".equals(fruit.getName());
        }
    });

    List<Fruit> apples = extractFruitList(fruitList, fruit -> "apple".equals(fruit.getName()));

    public static void main(String[] args) {

    }
}
