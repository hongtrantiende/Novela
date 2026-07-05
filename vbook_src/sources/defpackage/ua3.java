package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ua3  reason: default package */
/* loaded from: classes3.dex */
public abstract class ua3 {
    public static final lie a = new lie(5, "UNDEFINED", false);
    public static final lie b = new lie(5, "REUSABLE_CLAIMED", false);

    public static final void a(m42 m42Var, Object obj) {
        Object ft1Var;
        gvc gvcVar;
        if (m42Var instanceof ta3) {
            ta3 ta3Var = (ta3) m42Var;
            f82 f82Var = ta3Var.d;
            n42 n42Var = ta3Var.e;
            Throwable a2 = hs9.a(obj);
            if (a2 == null) {
                ft1Var = obj;
            } else {
                ft1Var = new ft1(a2, false);
            }
            if (c(f82Var, n42Var.getContext())) {
                ta3Var.f = ft1Var;
                ta3Var.c = 1;
                b(f82Var, n42Var.getContext(), ta3Var);
                return;
            }
            lx3 a3 = c7c.a();
            if (a3.c >= 4294967296L) {
                ta3Var.f = ft1Var;
                ta3Var.c = 1;
                a3.I0(ta3Var);
                return;
            }
            a3.V0(true);
            try {
                w26 w26Var = (w26) n42Var.getContext().get(r0f.I);
                if (w26Var != null && !w26Var.isActive()) {
                    ta3Var.resumeWith(hre.i(w26Var.getCancellationException()));
                } else {
                    Object obj2 = ta3Var.C;
                    d82 context = n42Var.getContext();
                    Object c = a7c.c(context, obj2);
                    if (c != a7c.a) {
                        gvcVar = tc4.t(n42Var, context, c);
                    } else {
                        gvcVar = null;
                    }
                    n42Var.resumeWith(obj);
                    if (gvcVar == null || gvcVar.t0()) {
                        a7c.a(context, c);
                    }
                }
                do {
                } while (a3.k1());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        m42Var.resumeWith(obj);
    }

    public static final void b(f82 f82Var, d82 d82Var, Runnable runnable) {
        try {
            f82Var.C(d82Var, runnable);
        } catch (Throwable th) {
            throw new sa3(th, f82Var, d82Var);
        }
    }

    public static final boolean c(f82 f82Var, d82 d82Var) {
        try {
            return f82Var.V(d82Var);
        } catch (Throwable th) {
            throw new sa3(th, f82Var, d82Var);
        }
    }
}
