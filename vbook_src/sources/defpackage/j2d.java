package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j2d  reason: default package */
/* loaded from: classes.dex */
public abstract class j2d {
    public static final long a = y02.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final q10 a(rv4 rv4Var) {
        if (((Boolean) rv4Var.j(lx5.a)).booleanValue()) {
            rv4Var.e0(2019030948);
            q10 q10Var = (q10) rv4Var.j(dt6.a);
            rv4Var.q(false);
            return q10Var;
        }
        rv4Var.e0(2019088453);
        rv4Var.q(false);
        return null;
    }

    public static final una b(w22 w22Var, rv4 rv4Var) {
        Object a12Var;
        boolean equals = w22Var.equals(r0f.E);
        boolean g = rv4Var.g(equals);
        Object P = rv4Var.P();
        if (g || P == ax1.a) {
            if (equals) {
                a12Var = una.p;
            } else {
                a12Var = new a12();
            }
            P = a12Var;
            rv4Var.o0(P);
        }
        return (una) P;
    }

    public static final jp5 c(Object obj, rv4 rv4Var) {
        rv4Var.e0(1319639034);
        if (obj instanceof jp5) {
            rv4Var.e0(1530875884);
            jp5 jp5Var = (jp5) obj;
            rv4Var.q(false);
            rv4Var.q(false);
            return jp5Var;
        }
        rv4Var.e0(1530915130);
        Context context = (Context) rv4Var.j(gh.b);
        boolean f = rv4Var.f(context) | rv4Var.f(obj);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            fp5 fp5Var = new fp5(context);
            fp5Var.c = obj;
            P = fp5Var.a();
            rv4Var.o0(P);
        }
        jp5 jp5Var2 = (jp5) P;
        rv4Var.q(false);
        rv4Var.q(false);
        return jp5Var2;
    }

    public static final long d(long j) {
        int A = k27.A(Float.intBitsToFloat((int) (j >> 32)));
        return (k27.A(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (A << 32);
    }

    public static void e(String str) {
        throw new IllegalArgumentException(eub.p("Unsupported type: ", str, ". ", hl5.n("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void f(jp5 jp5Var) {
        Object obj = jp5Var.b;
        if (!(obj instanceof fp5)) {
            if (!(obj instanceof nl5)) {
                if (!(obj instanceof ar5)) {
                    if (!(obj instanceof vk8)) {
                        if (jp5Var.c == null) {
                            if (((xn6) fca.j(jp5Var, op5.e)) == null) {
                                return;
                            }
                            vs.m("request.lifecycle must be null.");
                            return;
                        }
                        vs.m("request.target must be null.");
                        return;
                    }
                    e("Painter");
                    throw null;
                }
                e("ImageVector");
                throw null;
            }
            e("ImageBitmap");
            throw null;
        }
        vs.m("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }
}
