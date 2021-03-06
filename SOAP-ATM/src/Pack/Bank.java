package Pack;

import javax.xml.namespace.QName;

import Pack.Balance;
import Pack.BalanceResponse;
import Pack.Deposit;
import Pack.DepositResponse;
import Pack.Withdraw;
import Pack.WithdrawResponse;

public class Bank {

    private final static QName _Balance_QNAME = new QName("http://service.server.com/", "balance");
    private final static QName _BalanceResponse_QNAME = new QName("http://service.server.com/", "balanceResponse");
    private final static QName _Deposit_QNAME = new QName("http://service.server.com/", "deposit");
    private final static QName _DepositResponse_QNAME = new QName("http://service.server.com/", "depositResponse");
    private final static QName _Withdraw_QNAME = new QName("http://service.server.com/", "withdraw");
    private final static QName _WithdrawResponse_QNAME = new QName("http://service.server.com/", "withdrawResponse");

    public Bank() {
    }

    public Balance createBalance() {
        return new Balance();
    }

    public BalanceResponse createBalanceResponse() {
        return new BalanceResponse();
    }

    public Deposit createDeposit() {
        return new Deposit();
    }

    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }
}
