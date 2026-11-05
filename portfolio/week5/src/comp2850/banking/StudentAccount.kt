package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String, balance: Int = 0) : BankAccount(holder) {

    init {
        this.balance = balance
    }

    var overdraft: Int = 0
        set(value) {
            require(value in 0..MAX_OVERDRAFT) { "Overdraft must be between 0 and $MAX_OVERDRAFT" }
            field = value
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance - amount >= -overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance - 1 >= -overdraft
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}