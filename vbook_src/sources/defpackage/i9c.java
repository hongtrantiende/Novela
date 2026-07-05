package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i9c  reason: default package */
/* loaded from: classes3.dex */
public interface i9c {
    default void a(qq2 qq2Var) {
        Integer num;
        if (qq2Var != null) {
            num = Integer.valueOf(qq2Var.a(9));
        } else {
            num = null;
        }
        e(num);
    }

    uc b();

    void d(Integer num);

    void e(Integer num);

    Integer g();

    void h(Integer num);

    default qq2 k() {
        Integer l = l();
        if (l != null) {
            return new qq2(l.intValue(), 9);
        }
        return null;
    }

    Integer l();

    Integer m();

    void p(uc ucVar);

    void u(Integer num);

    Integer v();

    Integer w();

    void x(Integer num);
}
