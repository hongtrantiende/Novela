package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jnc  reason: default package */
/* loaded from: classes.dex */
public final class jnc {
    public final ld0 a;
    public final String b;
    public final bt3 c;
    public final nkc d;
    public final knc e;

    public jnc(ld0 ld0Var, String str, bt3 bt3Var, nkc nkcVar, knc kncVar) {
        this.a = ld0Var;
        this.b = str;
        this.c = bt3Var;
        this.d = nkcVar;
        this.e = kncVar;
    }

    public final void a(ic0 ic0Var, lnc lncVar) {
        nkc nkcVar = this.d;
        if (nkcVar != null) {
            knc kncVar = this.e;
            tw2 tw2Var = kncVar.c;
            ld0 b = this.a.b(ic0Var.b);
            kn knVar = new kn();
            knVar.C = new HashMap();
            knVar.e = Long.valueOf(kncVar.a.h());
            knVar.f = Long.valueOf(kncVar.b.h());
            knVar.b = this.b;
            knVar.d = new us3(this.c, (byte[]) nkcVar.apply(ic0Var.a));
            knVar.c = null;
            bd0 bd0Var = ic0Var.c;
            if (bd0Var != null) {
                knVar.D = bd0Var.a;
            }
            tw2Var.b.execute(new rw2(tw2Var, b, lncVar, knVar.f(), 0));
            return;
        }
        xk5.k("Null transformer");
    }
}
