package baidu.lac.jni;

public final class NativeToken {
    public final String tag;
    public final String word;

    public NativeToken(String word, String tag) {
        if (word == null) throw new NullPointerException("word == null");
        if (tag == null) throw new NullPointerException("tag == null");
        this.word = word;
        this.tag = tag;
    }
}
