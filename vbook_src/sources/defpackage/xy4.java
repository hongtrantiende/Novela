package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xy4  reason: default package */
/* loaded from: classes.dex */
public interface xy4 {
    Object a(Object obj, lu4 lu4Var);

    boolean b(xt4 xt4Var);

    boolean c();

    default xy4 d(xy4 xy4Var) {
        if (xy4Var == vy4.a) {
            return this;
        }
        return new mo1(this, xy4Var);
    }
}
