package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jt9  reason: default package */
/* loaded from: classes.dex */
public abstract class jt9 {
    public static final ly1 a = new ly1(new pa9(13));
    public static final ly1 b = new ly1(new wr9(2));
    public static final ut9 c;
    public static final ut9 d;

    static {
        long j = zl1.i;
        c = new ut9(true, Float.NaN, j, null, true);
        d = new ut9(false, Float.NaN, j, null, true);
    }

    public static ut9 a(float f, long j, wea weaVar, int i) {
        boolean z;
        float f2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i & 4) != 0) {
            j = zl1.i;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            weaVar = null;
        }
        wea weaVar2 = weaVar;
        if (rg3.b(f2, Float.NaN) && zl1.c(j2, zl1.i) && weaVar2 == null) {
            if (z2) {
                return c;
            }
            return d;
        }
        return new ut9(z2, f2, j2, weaVar2, true);
    }
}
