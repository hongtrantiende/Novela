package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vm5  reason: default package */
/* loaded from: classes.dex */
public final class vm5 implements lu4 {
    public final /* synthetic */ rh8 a;
    public final /* synthetic */ wea b;
    public final /* synthetic */ mu4 c;
    public final /* synthetic */ zc2 d;
    public final /* synthetic */ nu4 e;

    public vm5(rh8 rh8Var, wea weaVar, mu4 mu4Var, zc2 zc2Var, nu4 nu4Var) {
        this.a = rh8Var;
        this.b = weaVar;
        this.c = mu4Var;
        this.d = zc2Var;
        this.e = nu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            v9b.a(zbe.x(kq7.a, this.a), this.b, 0L, 0L, nae.e, nae.e, null, jce.E(623960193, new um5(this.c, this.d, this.e), rv4Var), rv4Var, 12582912, Token.IMPORT);
        }
        return pvc.a;
    }
}
