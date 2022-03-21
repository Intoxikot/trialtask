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
     * ����� "������". ��������� ������ discount � ���� price, ������� � ������� offset
     * �� ���������� ������� readLength. ����� ���� ��������� �����,
     * �� �������� ������ �����.
     * @param price - �������� ����.
     * @param discount - % ������, �� 1 �� 99.
     * @param offset - ����� �������, � ������� ����� ��������� ������.
     * @param readLength - ���������� �������, � ������� ����� ��������� ������.
     * @return - ������ ����� ���.
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