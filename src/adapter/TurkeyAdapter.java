package adapter;

/**
 * Adapter
 */
public class TurkeyAdapter implements Duck {
    private Turkey mTurkey;

    TurkeyAdapter(Turkey turkey) {
        mTurkey = turkey;
    }

    @Override
    public void quack() {
        mTurkey.gobble();
    }

    @Override
    public void fly() {
        // 1 Duck's fly = 3 Turkey's fly
        for (int i = 0; i < 3; i++) {
            mTurkey.fly();
        }
    }
}
