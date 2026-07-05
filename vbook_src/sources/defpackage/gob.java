package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gob  reason: default package */
/* loaded from: classes3.dex */
public final class gob extends aab implements lu4 {
    public final /* synthetic */ h2a a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ m82 d;
    public final /* synthetic */ af e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gob(h2a h2aVar, boolean z, aw7 aw7Var, m82 m82Var, af afVar, m42 m42Var) {
        super(2, m42Var);
        this.a = h2aVar;
        this.b = z;
        this.c = aw7Var;
        this.d = m82Var;
        this.e = afVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new gob(this.a, this.b, this.c, this.d, this.e, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((gob) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        se0 se0Var;
        hre.r(obj);
        String str = (String) this.c.getValue();
        if (this.b && str != null) {
            se0Var = new se0(28, this.d, this.e, str);
        } else {
            se0Var = null;
        }
        this.a.m = se0Var;
        return pvc.a;
    }
}
