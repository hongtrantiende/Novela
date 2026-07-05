package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd  reason: default package */
/* loaded from: classes3.dex */
public final class wd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ lu4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd(vt4 vt4Var, lu4 lu4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = vt4Var;
        this.e = lu4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                wd wdVar = new wd(this.d, this.e, m42Var, 0);
                wdVar.c = obj;
                return wdVar;
            default:
                wd wdVar2 = new wd(this.d, this.e, m42Var, 1);
                wdVar2.c = obj;
                return wdVar2;
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
                return ((wd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((wd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [zl9, java.lang.Object] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.e;
        vt4 vt4Var = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                m82 m82Var = (m82) this.c;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                ?? obj2 = new Object();
                s02 G = yae.G(vt4Var);
                vd vdVar = new vd(obj2, m82Var, lu4Var, 0);
                this.c = null;
                this.b = 1;
                if (G.a(vdVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                ?? obj3 = new Object();
                s02 G2 = yae.G(vt4Var);
                vd vdVar2 = new vd(obj3, (m82) this.c, lu4Var, 1);
                this.b = 1;
                if (G2.a(vdVar2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
