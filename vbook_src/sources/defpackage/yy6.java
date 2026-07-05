package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yy6  reason: default package */
/* loaded from: classes.dex */
public interface yy6 {
    sc6 a(sc6 sc6Var);

    default long g(sc6 sc6Var, sc6 sc6Var2) {
        sc6 a = a(sc6Var);
        sc6 a2 = a(sc6Var2);
        if (a instanceof uy6) {
            return ((uy6) a).l0(a2, 0L, true);
        }
        if (a2 instanceof uy6) {
            return ((uy6) a2).l0(a, 0L, true) ^ (-9223372034707292160L);
        }
        return a.l0(a, 0L, true);
    }
}
