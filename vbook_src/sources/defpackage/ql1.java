package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ql1  reason: default package */
/* loaded from: classes3.dex */
public abstract class ql1 extends w0 {
    public final s76 a;

    public ql1(s76 s76Var) {
        this.a = s76Var;
    }

    @Override // defpackage.s76
    public void a(jbe jbeVar, Object obj) {
        int i = i(obj);
        o9a e = e();
        e.getClass();
        jbe k = jbeVar.k(e);
        Iterator h = h(obj);
        for (int i2 = 0; i2 < i; i2++) {
            k.F(e(), i2, this.a, h.next());
        }
        k.K(e);
    }

    @Override // defpackage.w0
    public void k(fx1 fx1Var, int i, Object obj) {
        n(i, obj, fx1Var.q(e(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
