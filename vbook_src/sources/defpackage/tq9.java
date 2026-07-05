package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tq9  reason: default package */
/* loaded from: classes3.dex */
public final class tq9 {
    public static sq9 a(rv4 rv4Var) {
        h6c h6cVar;
        v13 v13Var;
        rv4Var.e0(1808039825);
        nv6 a = gx8.a.z().a();
        boolean p = nae.p(rv4Var);
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        boolean f = rv4Var.f(a) | rv4Var.g(p) | rv4Var.f(r13Var);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            ub6 ub6Var = new ub6(a.a.getLanguage());
            km9 km9Var = new km9(a.a.getCountry());
            h6c.a.getClass();
            if (p) {
                h6cVar = h6c.c;
            } else {
                h6cVar = h6c.b;
            }
            float f2 = r13Var.f();
            v13.b.getClass();
            double d = f2;
            if (d <= 0.75d) {
                v13Var = v13.c;
            } else if (d <= 1.0d) {
                v13Var = v13.d;
            } else if (d <= 1.5d) {
                v13Var = v13.e;
            } else if (d <= 2.0d) {
                v13Var = v13.f;
            } else if (d <= 3.0d) {
                v13Var = v13.C;
            } else {
                v13Var = v13.D;
            }
            P = new sq9(ub6Var, km9Var, h6cVar, v13Var);
            rv4Var.o0(P);
        }
        sq9 sq9Var = (sq9) P;
        rv4Var.q(false);
        return sq9Var;
    }
}
