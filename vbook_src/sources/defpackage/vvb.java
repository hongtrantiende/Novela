package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vvb  reason: default package */
/* loaded from: classes3.dex */
public abstract class vvb {
    public static final ru2 a;

    static {
        sw2 sw2Var = ab3.a;
        a = ru2.c;
    }

    public static final nn a(rv4 rv4Var) {
        do4 do4Var = (do4) rv4Var.j(dy1.k);
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
        boolean f = rv4Var.f(do4Var) | rv4Var.f(r13Var) | rv4Var.d(tc6Var.ordinal());
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            do4Var.getClass();
            r13Var.getClass();
            P = new nn(do4Var, r13Var, tc6Var);
            rv4Var.o0(P);
        }
        return (nn) P;
    }
}
