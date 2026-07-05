package defpackage;

import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: op1  reason: default package */
/* loaded from: classes3.dex */
public final class op1 extends ur5 {
    public final String e0;
    public final wl6 f0;
    public final klc g0;
    public final fq5 h0;
    public final cza i0;
    public final ho5 j0;

    public op1(String str, wl6 wl6Var, yf3 yf3Var, wo5 wo5Var, cs0 cs0Var, nld nldVar, klc klcVar, bm5 bm5Var, pi9 pi9Var, fq5 fq5Var) {
        super(str, wl6Var, yf3Var, wo5Var, cs0Var, nldVar, klcVar, bm5Var, pi9Var);
        this.e0 = str;
        this.f0 = wl6Var;
        this.g0 = klcVar;
        this.h0 = fq5Var;
        this.i0 = dza.a(new mp1("", "", true, false, false));
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n0(this, null, 25));
        this.j0 = new ho5(new uwd(this, 11), 104857600L, Context.VERSION_ES6);
    }

    @Override // defpackage.ur5
    public final ho5 q() {
        return this.j0;
    }

    @Override // defpackage.ur5
    public final void z(boolean z) {
        cza czaVar = this.i0;
        if (czaVar == null) {
            return;
        }
        while (true) {
            Object value = czaVar.getValue();
            boolean z2 = z;
            if (!czaVar.l(value, mp1.a((mp1) value, false, null, z2, null, 22))) {
                z = z2;
            } else {
                return;
            }
        }
    }
}
