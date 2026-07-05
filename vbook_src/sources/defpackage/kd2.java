package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kd2  reason: default package */
/* loaded from: classes3.dex */
public final class kd2 extends fb6 implements lu4 {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ lf4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ tu1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd2(Boolean bool, nq7 nq7Var, lf4 lf4Var, String str, tu1 tu1Var, int i) {
        super(2);
        this.a = bool;
        this.b = nq7Var;
        this.c = lf4Var;
        this.d = str;
        this.e = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p = xoe.p(24577);
        ctd.g(this.a, this.b, this.c, this.d, this.e, (rv4) obj, p);
        return pvc.a;
    }
}
