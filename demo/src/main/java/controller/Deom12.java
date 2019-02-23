package controller;

import constant.Size;
import entity.data.Clothes;
import java.util.Arrays;
import java.util.List;


/**
 * @author Administrator
 */
public class Deom12 {
    public static void main(String[] args) {
        List<Clothes> clothes = Arrays.asList(new Clothes[]{
            new Clothes("阿迪",Size.SMALL),
            new Clothes("耐克",Size.MIDDLE),
            new Clothes("李宁",Size.LAGER),
            new Clothes("美邦",Size.EXTRA_LAGER),
            new Clothes("森马",Size.EXTRA_EXTRA_LAGER),
        });
        System.out.println(clothes);
    }
}
