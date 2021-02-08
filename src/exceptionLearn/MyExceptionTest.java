package exceptionLearn;

public class MyExceptionTest {
    public void regist(int num) throws MyException {
        if (num < 0)
            throw new MyException("人数为负值，不合理", 3);
        else
            System.out.println("登记人数" + num);
    }
    public void manager() {
        try {
            regist(-1);
        } catch (MyException e) {
            System.out.print("登记失败，出错种类" + e.getMessage()+e.getId()+" "+"\n");
        }
        System.out.print("本次登记操作结束");
    }
    public static void main(String args[]) {
        MyExceptionTest t = new MyExceptionTest();
        t.manager();
    }

}
