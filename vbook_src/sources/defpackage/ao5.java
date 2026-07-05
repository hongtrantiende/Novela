package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ao5  reason: default package */
/* loaded from: classes.dex */
public final class ao5 extends fb6 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ to5 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xy4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dm1 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao5(to5 to5Var, String str, xy4 xy4Var, int i, dm1 dm1Var, int i2, int i3) {
        super(2);
        this.a = to5Var;
        this.b = str;
        this.c = xy4Var;
        this.d = i;
        this.e = dm1Var;
        this.f = i2;
        this.C = i3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.C;
        xwe.b(this.a, this.b, this.c, this.d, this.e, (rv4) obj, this.f | 1, i);
        return pvc.a;
    }
}
