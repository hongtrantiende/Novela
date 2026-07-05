package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ny  reason: default package */
/* loaded from: classes.dex */
public interface ny {
    void c(int i, Object obj);

    void e(Object obj);

    default void f() {
        ew1 ew1Var;
        Object r = r();
        if (r instanceof ew1) {
            ew1Var = (ew1) r;
        } else {
            ew1Var = null;
        }
        if (ew1Var != null) {
            ew1Var.h();
        }
    }

    void i(int i, int i2, int i3);

    default void j(Object obj, lu4 lu4Var) {
        lu4Var.invoke(r(), obj);
    }

    void k(int i, int i2);

    void n();

    void p(int i, Object obj);

    Object r();

    default void q() {
    }
}
