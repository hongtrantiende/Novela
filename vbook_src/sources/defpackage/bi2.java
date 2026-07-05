package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bi2  reason: default package */
/* loaded from: classes3.dex */
public final class bi2 extends aab implements lu4 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi2(String str, double d, m42 m42Var) {
        super(2, m42Var);
        this.b = str;
        this.c = d;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        bi2 bi2Var = new bi2(this.b, this.c, m42Var);
        bi2Var.a = obj;
        return bi2Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((bi2) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        pv7 pv7Var = (pv7) this.a;
        e49 o = s9e.o(this.b);
        Double d = new Double(this.c);
        pv7Var.getClass();
        pv7Var.f(o, d);
        return pvc.a;
    }
}
