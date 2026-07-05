package defpackage;

import org.mozilla.javascript.Token;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq7  reason: default package */
/* loaded from: classes.dex */
public final class vq7 {
    public static final kh5 b;
    public static final /* synthetic */ vq7[] c;
    public static final /* synthetic */ qu3 d;
    public final int a;

    /* JADX WARN: Type inference failed for: r0v2, types: [kh5, java.lang.Object] */
    static {
        vq7[] vq7VarArr = {new vq7("PUBLIC", 0, 1), new vq7("PRIVATE", 1, 2), new vq7("PROTECTED", 2, 4), new vq7("STATIC", 3, 8), new vq7("FINAL", 4, 16), new vq7("SYNCHRONIZED", 5, 32), new vq7("VOLATILE", 6, 64), new vq7("TRANSIENT", 7, Token.CASE), new vq7("NATIVE", 8, 256), new vq7("INTERFACE", 9, 512), new vq7("ABSTRACT", 10, 1024), new vq7("STRICT", 11, 2048)};
        c = vq7VarArr;
        d = new qu3(vq7VarArr);
        b = new Object();
    }

    public vq7(String str, int i, int i2) {
        this.a = i2;
    }

    public static vq7 valueOf(String str) {
        return (vq7) Enum.valueOf(vq7.class, str);
    }

    public static vq7[] values() {
        return (vq7[]) c.clone();
    }
}
