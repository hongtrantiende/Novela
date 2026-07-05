package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ay0  reason: default package */
/* loaded from: classes3.dex */
public final class ay0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay0(fy0 fy0Var, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = fy0Var;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.c;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                return new ay0(fy0Var, z, m42Var, 0);
            case 1:
                return new ay0(fy0Var, z, m42Var, 1);
            default:
                return new ay0(fy0Var, z, m42Var, 2);
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
                ((ay0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((ay0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((ay0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((qw0) fy0Var.d).b.a.e(lw0.h[0], Boolean.valueOf(z));
                cza czaVar = fy0Var.D;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, lx0.a((lx0) value, false, this.c, false, null, null, 59)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((qw0) fy0Var.d).b.b.e(lw0.h[1], Boolean.valueOf(z));
                cza czaVar2 = fy0Var.D;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, lx0.a((lx0) value2, false, false, this.c, null, null, 55)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((qw0) fy0Var.d).b.d.e(lw0.h[3], Boolean.valueOf(z));
                return pvcVar;
        }
    }
}
