package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
        // return new ImmutableObj(value + addValue);  // 위 두 줄과 동일
    }

    public int getValue() {
        return value;
    }
}
