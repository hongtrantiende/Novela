package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y4d  reason: default package */
/* loaded from: classes.dex */
public final class y4d extends mq7 implements zj3 {
    public pkc K;
    public eu3 L;
    public lz3 M;
    public sga N;

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        zl1 zl1Var;
        qd6Var.a();
        pkc pkcVar = this.K;
        x4d x4dVar = new x4d(this, 0);
        sga sgaVar = this.N;
        if (sgaVar.a()) {
            zl1Var = new zl1(sgaVar.e);
        } else {
            zl1Var = null;
        }
        okc a = pkcVar.a(x4dVar, zl1Var, null, new x4d(this, 1));
        sga sgaVar2 = this.N;
        long j = ((zl1) a.getValue()).a;
        sk8 sk8Var = sgaVar2.c;
        if (sgaVar2.b() && ((Boolean) ((hm8) sk8Var.g).getValue()).booleanValue()) {
            j = ((zl1) ((hm8) sk8Var.h).getValue()).a;
        }
        long j2 = j;
        if (sgaVar2.b()) {
            sgaVar2.e = j2;
        }
        if (zl1.d(j2) == nae.e) {
            return;
        }
        if (this.L.a.e == null) {
            ukc ukcVar = this.M.a;
        }
        ak3.R0(qd6Var, j2, 0L, 0L, nae.e, null, 0, Token.ELSE);
    }
}
