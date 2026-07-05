package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = sj2.class)
/* renamed from: qj2  reason: default package */
/* loaded from: classes3.dex */
public abstract class qj2 {
    public static final hj2 Companion = new Object();
    public static final lj2 a;
    public static final nj2 b;
    public static final nj2 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [hj2, java.lang.Object] */
    static {
        new pj2(1L).b(1000).b(1000).b(1000).b(60).b(60);
        a = new lj2(1);
        new lj2(Math.multiplyExact(1, 7));
        b = new nj2(1);
        new nj2(Math.multiplyExact(1, 3));
        int multiplyExact = Math.multiplyExact(1, 12);
        c = new nj2(multiplyExact);
        new nj2(Math.multiplyExact(multiplyExact, 100));
    }

    public static String a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
