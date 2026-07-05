package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s2c  reason: default package */
/* loaded from: classes3.dex */
public final class s2c extends aab implements lu4 {
    public final /* synthetic */ t2c a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2c(t2c t2cVar, long j, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = t2cVar;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new s2c(this.a, this.b, this.c, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((s2c) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        hre.r(obj);
        t2c t2cVar = this.a;
        wx6 wx6Var = ((i2c) t2cVar.C).a.h;
        r76[] r76VarArr = y1c.o;
        wx6Var.e(r76VarArr[7], Long.valueOf(this.b));
        ((i2c) t2cVar.C).a.i.e(r76VarArr[8], Boolean.valueOf(this.c));
        cza czaVar = t2cVar.H;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, ozb.a((ozb) value, nae.e, nae.e, this.b, this.c, false, nae.e, null, 0, 487)));
            t2cVar.d.getClass();
            mfb mfbVar = ix3.a;
            ix3.a(azb.a);
            return pvc.a;
        }
        t2cVar.d.getClass();
        mfb mfbVar2 = ix3.a;
        ix3.a(azb.a);
        return pvc.a;
    }
}
