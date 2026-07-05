package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w0  reason: default package */
/* loaded from: classes3.dex */
public abstract class w0 implements s76 {
    @Override // defpackage.s76
    public Object c(yq2 yq2Var) {
        yq2Var.getClass();
        return j(yq2Var);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(yq2 yq2Var) {
        yq2Var.getClass();
        Object f = f();
        int g = g(f);
        fx1 t = yq2Var.t(e());
        while (true) {
            int f2 = t.f(e());
            if (f2 != -1) {
                k(t, f2 + g, f);
            } else {
                t.n(e());
                return m(f);
            }
        }
    }

    public abstract void k(fx1 fx1Var, int i, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
