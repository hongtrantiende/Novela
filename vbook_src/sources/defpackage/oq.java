package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq  reason: default package */
/* loaded from: classes3.dex */
public final class oq extends fb6 implements lu4 {
    public final /* synthetic */ tu1 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ dc d;
    public final /* synthetic */ String e;
    public final /* synthetic */ xt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(Boolean bool, nq7 nq7Var, xt4 xt4Var, dc dcVar, String str, xt4 xt4Var2, tu1 tu1Var, int i, int i2) {
        super(2);
        this.a = bool;
        this.b = nq7Var;
        this.c = xt4Var;
        this.d = dcVar;
        this.e = str;
        this.f = xt4Var2;
        this.C = tu1Var;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b16.c(this.a, this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, xoe.p(this.D | 1), this.E);
        return pvc.a;
    }
}
