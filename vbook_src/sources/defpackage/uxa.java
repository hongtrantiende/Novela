package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uxa  reason: default package */
/* loaded from: classes3.dex */
public final class uxa {
    public final m82 a;
    public final rxa b;
    public final hm8 c;
    public final cza d;

    public uxa(m82 m82Var, rxa rxaVar) {
        m82Var.getClass();
        rxaVar.getClass();
        this.a = m82Var;
        this.b = rxaVar;
        this.c = yae.z(ks3.a);
        this.d = dza.a(Boolean.FALSE);
    }

    public final List a() {
        return (List) this.c.getValue();
    }

    public final void b(sxa sxaVar) {
        Boolean bool = Boolean.FALSE;
        cza czaVar = this.d;
        czaVar.getClass();
        czaVar.n(null, bool);
        ArrayList E0 = sl1.E0(a());
        E0.add(sxaVar);
        this.c.setValue(E0);
        z87.v(this.a, null, null, new txa(this, null, 0), 3);
    }
}
