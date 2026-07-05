package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au3  reason: default package */
/* loaded from: classes.dex */
public final class au3 extends fb6 implements xt4 {
    public final /* synthetic */ kj3 C;
    public final /* synthetic */ du3 a;
    public final /* synthetic */ yya b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ mw8 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(du3 du3Var, okc okcVar, long j, long j2, long j3, mw8 mw8Var, long j4, kj3 kj3Var) {
        super(1);
        this.a = du3Var;
        this.b = okcVar;
        this.c = j2;
        this.d = j3;
        this.e = mw8Var;
        this.f = j4;
        this.C = kj3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        lw8 lw8Var = (lw8) obj;
        du3 du3Var = this.a;
        sga sgaVar = du3Var.R;
        long j2 = 0;
        yya yyaVar = this.b;
        if (yyaVar != null) {
            j = ((py5) yyaVar.getValue()).a;
        } else {
            j = 0;
        }
        sgaVar.b();
        if (sgaVar.b()) {
            sgaVar.c.getClass();
        }
        long d = py5.d(j, 0L);
        if (sgaVar.b()) {
            sgaVar.i = d;
        }
        dc dcVar = du3Var.V;
        if (dcVar != null) {
            j2 = dcVar.a(this.c, this.d, tc6.a);
        }
        long d2 = py5.d(j2, d);
        long j3 = this.f;
        lw8Var.J(this.e, ((int) (d2 >> 32)) + ((int) (j3 >> 32)), ((int) (d2 & 4294967295L)) + ((int) (j3 & 4294967295L)), nae.e, this.C);
        return pvc.a;
    }
}
