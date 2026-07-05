package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nf  reason: default package */
/* loaded from: classes3.dex */
public final class nf extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ AndroidBookUpdateWorker c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf(AndroidBookUpdateWorker androidBookUpdateWorker, int i, int i2, m42 m42Var, int i3) {
        super(2, m42Var);
        this.a = i3;
        this.c = androidBookUpdateWorker;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new nf(this.c, this.d, this.e, m42Var, 0);
            default:
                return new nf(this.c, this.d, this.e, m42Var, 1);
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
                return ((nf) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((nf) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                this.b = 1;
                if (((kf) this.c.F.getValue()).a(this.d, this.e, this) == n82Var) {
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
                sw2 sw2Var = ab3.a;
                n35 n35Var = zz6.a.f;
                nf nfVar = new nf(this.c, this.d, this.e, null, 0);
                this.b = 1;
                if (z87.E(n35Var, nfVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
