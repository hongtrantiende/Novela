package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nq7  reason: default package */
/* loaded from: classes.dex */
public interface nq7 {
    Object a(Object obj, lu4 lu4Var);

    default nq7 a0(nq7 nq7Var) {
        if (nq7Var == kq7.a) {
            return this;
        }
        return new no1(this, nq7Var);
    }

    boolean m(xt4 xt4Var);
}
