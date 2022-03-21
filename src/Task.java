import com.sun.istack.internal.Nullable;

import java.io.IOException;

public class Task {

    public static void main(String[] args) throws IOException {

        Test test = new Test();

        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();

        System.out.println("Press any key...");
        System.in.read();

    }

    /**
     * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset
     * на количество позиций readLength. Новые цены округляем “вниз”,
     * до меньшего целого числа.
     * @param price - исходные цены.
     * @param discount - % скидки, от 1 до 99.
     * @param offset - номер позиции, с которой нужно применить скидку.
     * @param readLength - количество позиций, к которым нужно применить скидку.
     * @return - массив новых цен.
     */
    public @Nullable int[] decryptData(@NonNull int[] price, @IntRange(from = 1) int discount, @IntRange(from = 0) int offset, @IntRange(from = 1) int readLength) {
        if (price == null)
            return null;

        if (discount < 1 || discount > 100)
            return null;

        if (readLength < 1 || readLength + offset > price.length)
            return null;

        int[] result = new int[readLength];
        for (int i = 0; i < readLength; i++)
            result[i] = (int) Math.floor((double) price[offset + i] * (100 - discount) / 100);
        return result;
    }
}