package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fd2  reason: default package */
/* loaded from: classes3.dex */
public abstract class fd2 {
    public static final mfb a = new mfb(new cd1(26));
    public static final tza b = new f99(new cd1(27));
    public static final List c;
    public static final List d;
    public static final ArrayList e;
    public static final List f;

    /* JADX WARN: Type inference failed for: r1v3, types: [f99, tza] */
    static {
        List B = tl1.B(new y78((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L)), new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)), new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L)), new y78((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)));
        c = B;
        List B2 = tl1.B(new y78((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L)), new y78((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L)), new y78((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)), new y78((Float.floatToRawIntBits(0.5f) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32)));
        d = B2;
        e = sl1.n0(B, B2);
        f = tl1.B(new e00(1, 1), new e00(16, 9), new e00(4, 3));
    }

    public static ed2 a(int i, List list, List list2) {
        long j = zl1.b;
        long j2 = zl1.e;
        dd2 dd2Var = new dd2();
        long b2 = zl1.b(0.5f, j);
        if ((i & Token.CASE) != 0) {
            list = yc2.c;
        }
        List list3 = list;
        if ((i & 256) != 0) {
            list2 = f;
        }
        List list4 = list2;
        list3.getClass();
        list4.getClass();
        return new ed2(j, b2, list3, list4, dd2Var, j2);
    }
}
