package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mm3  reason: default package */
/* loaded from: classes.dex */
public final class mm3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vfb b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm3(vfb vfbVar, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = vfbVar;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new mm3(this.b, this.c, m42Var, 0);
            case 1:
                return new mm3(this.b, this.c, m42Var, 1);
            default:
                return new mm3(this.b, this.c, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((mm3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((mm3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((mm3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        vfb vfbVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                long j = zl1.h;
                vfbVar.d(new sfb(j, Boolean.valueOf(z)));
                vfbVar.c(new sfb(j, Boolean.valueOf(z)));
                return pvcVar;
            case 1:
                hre.r(obj);
                long j2 = zl1.h;
                vfbVar.d(new sfb(j2, Boolean.valueOf(z)));
                vfbVar.c(new sfb(j2, Boolean.valueOf(z)));
                return pvcVar;
            default:
                hre.r(obj);
                long j3 = zl1.h;
                vfbVar.d(new sfb(j3, Boolean.valueOf(z)));
                vfbVar.c(new sfb(j3, Boolean.valueOf(z)));
                return pvcVar;
        }
    }
}
