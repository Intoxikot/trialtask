
import java.util.Arrays;

public class TestData {

    private int[] price;  // исходные цены
    private int[] result; // результирующие цены
    private int[] answer; // ожидаемый ответ с ценами (задается вручную)
    private int discount;
    private int offset;
    private int readLength;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("input: ");
        if (price != null)
            sb.append(Arrays.toString(price));
        else
            sb.append("null");
        sb.append("\n");

        sb.append("discount = " + discount + "\n");
        sb.append("offset = " + offset + "\n");
        sb.append("readLength = " + readLength + "\n");

        sb.append("output: ");
        if (result != null)
            sb.append(Arrays.toString(result));
        else
            sb.append("null");
        sb.append("\n");

        String check = checkAnswer() ? "correct!": "incorrect!";
        sb.append(check);
        sb.append("\n");

        return sb.toString();
    }

    // Проверка соответствия результата и ожидаемого ответа
    private boolean checkAnswer() {
        if (result == null && answer == null)
            return true;

        if (result == null || answer == null)
            return false;

        if (result.length != answer.length)
            return false;

        for (int i = 0; i < answer.length; i++)
            if (answer[i] != result[i])
                return false;

        return true;
    }

    public void setPrice(int[] price) { this.price = price; }
    public void setResult(int[] result) { this.result = result; }
    public void setAnswer(int[] answer) { this.answer = answer; }
    public void setDiscount(int discount) { this.discount = discount; }
    public void setOffset(int offset) { this.offset = offset; }
    public void setReadLength(int readLength) { this.readLength = readLength; }

    public int[] getPrice() { return price; }
    public int[] getResult() { return result; }
    public int[] getAnswer() { return answer; }
    public int getDiscount() { return discount; }
    public int getOffset() { return offset; }
    public int getReadLength() { return readLength;}
}