package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pq6  reason: default package */
/* loaded from: classes.dex */
public final class pq6 {
    public static sz5 a(Object obj, long j) {
        int i;
        sz5 sz5Var = (sz5) exc.c.h(obj, j);
        if (!((a99) sz5Var).a) {
            a99 a99Var = (a99) sz5Var;
            int i2 = a99Var.c;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            a99 c = a99Var.c(i);
            exc.o(obj, j, c);
            return c;
        }
        return sz5Var;
    }
}
