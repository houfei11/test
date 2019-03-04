package staticLx;

/**
 * 银行系统
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        ABCATM atm = new ABCATM();
        UnionPay card = new ABCImpl(); // 银联卡
        atm.insertCard(card);
        atm.payTelBill();// 支付电话费
        UnionPay card1 = new ICBCImpl(); // 工行卡
        atm.insertCard(card1);
    }
}
class ABCATM{ // 农行ATM机
    private UnionPay card; //银联卡
    public void insertCard(UnionPay card){ //插卡
        this.card = card;
    }
    public void payTelBill(){ // 支付电话费
        if (card instanceof ABC){ // 是农行卡
            ABC abc = (ABC) card;
            abc.payTelBill("18792769068",500);
        } else {
            System.out.println("不是农行卡，不能支付电话费");
        }
    }
    public void showBalance(){  // 显示余额
        System.out.println(card.getBalance());
    }
}



/**
 * 工商银行接口
 */
interface ICBC extends UnionPay{
    public void payOnline(double number); // 在线支付功能
}
class ICBCImpl implements ICBC{
    @Override
    public void payOnline(double number) {

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean drawMoney(double number) {
        return false;
    }

    @Override
    public boolean checkPwd(String input) {
        return false;
    } //工行卡

}

/**
 * 农行接口
 */
interface ABC extends UnionPay{
    public boolean payTelBill(String phoneNum, double sum); // 支付电话费
}
class ABCImpl implements ABC{  //农行卡
    @Override
    public boolean payTelBill(String phoneNum, double sum) {
        System.out.println("支付电话费成功");
        return true;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean drawMoney(double number) {
        return false;
    }

    @Override
    public boolean checkPwd(String input) {
        return false;
    }

}

/**
 * 银联接口
 */
interface UnionPay{
    public double getBalance(); // 查询余额
    public boolean drawMoney(double number); //取钱
    public boolean checkPwd(String input); // 检查密码是否正确
}