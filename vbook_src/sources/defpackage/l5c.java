package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l5c  reason: default package */
/* loaded from: classes3.dex */
public final class l5c extends aab implements lu4 {
    public final /* synthetic */ y5c a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5c(y5c y5cVar, boolean z, boolean z2, m42 m42Var) {
        super(2, m42Var);
        this.a = y5cVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new l5c(this.a, this.b, this.c, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((l5c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        hre.r(obj);
        y5c y5cVar = this.a;
        ls0 ls0Var = ((be9) y5cVar.c0).c.m;
        r76[] r76VarArr = rc9.q;
        ls0Var.e(r76VarArr[12], Boolean.valueOf(this.b));
        ((be9) y5cVar.c0).c.n.e(r76VarArr[13], Boolean.valueOf(this.c));
        y5cVar.h(y5cVar.s0, zqb.a);
        cza czaVar = y5cVar.E0;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, exb.a((exb) value, null, 0, 0, null, null, null, this.b, this.c, 511)));
            return pvc.a;
        }
        return pvc.a;
    }
}
