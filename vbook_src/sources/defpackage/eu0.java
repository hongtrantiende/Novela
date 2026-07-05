package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eu0  reason: default package */
/* loaded from: classes3.dex */
public final class eu0 extends fb6 implements lu4 {
    public final /* synthetic */ xy4 a;
    public final /* synthetic */ cc b;
    public final /* synthetic */ tu1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu0(xy4 xy4Var, cc ccVar, tu1 tu1Var, int i, int i2) {
        super(2);
        this.a = xy4Var;
        this.b = ccVar;
        this.c = tu1Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.e;
        w92.b(this.a, this.b, this.c, (rv4) obj, this.d | 1, i);
        return pvc.a;
    }
}
