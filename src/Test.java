
public class Test {

    // Простой тест
    public void test1() {
        TestData in = new TestData();
        in.setPrice(new int[]{5,100,20,66,16});
        in.setDiscount(50);
        in.setOffset(1);
        in.setReadLength(3);
        in.setAnswer(new int[]{50,10,33});
        runTest(in);
    }

    // Тест нулей
    public void test2() {
        TestData in = new TestData();
        in.setPrice(new int[]{0,0,0,0,0});
        in.setDiscount(50);
        in.setOffset(1);
        in.setReadLength(3);
        in.setAnswer(new int[]{0,0,0});
        runTest(in);
    }

    // Нулл тест
    public void test3() {
        TestData in = new TestData();
        in.setPrice(null); // incorrect value
        in.setDiscount(50);
        in.setOffset(1);
        in.setReadLength(3);
        in.setAnswer(null);
        runTest(in);
    }

    // Тест discount
    public void test4() {
        TestData in = new TestData();
        in.setPrice(new int[]{1,2,3,4});
        in.setDiscount(134); // incorrect value
        in.setOffset(1);
        in.setReadLength(3);
        in.setAnswer(null);
        runTest(in);
    }

    // Тест readLength
    public void test5() {
        TestData in = new TestData();
        in.setPrice(new int[]{1,2,3});
        in.setDiscount(38);
        in.setOffset(2);
        in.setReadLength(10); // incorrect value
        in.setAnswer(null);
        runTest(in);
    }

    private void runTest(TestData data) {
        data.setResult(
            new Task().decryptData(
                data.getPrice(),
                data.getDiscount(),
                data.getOffset(),
                data.getReadLength())
        );
        System.out.println(data);
    }
}
