package entity.data;

import constant.Size;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Clothes {
    String name;
    Size size;

    public Clothes(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
    public static Map<Size, String> countBySize(List<Clothes> Clothes){
        Map<Size, String> map = new EnumMap<>(Size.class);
        for (Clothes c : Clothes ){
            Size size = c.getSize();
            String count = map.get(size);
            if (count != null){
                map.put(size, count + 1);
            } else {
                map.put(size, "1");
            }
        }
        return map;
    }
}
