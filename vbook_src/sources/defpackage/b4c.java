package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b4c  reason: default package */
/* loaded from: classes3.dex */
public final class b4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ c4c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4c(c4c c4cVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = c4cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        c4c c4cVar = this.c;
        switch (i) {
            case 0:
                return new b4c(c4cVar, m42Var, 0);
            default:
                return new b4c(c4cVar, m42Var, 1);
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
                return ((b4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((b4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        c4c c4cVar = this.c;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    bad e = ((yld) c4cVar.c).e();
                    r58 r58Var = new r58(c4cVar, 14);
                    this.b = 1;
                    if (e.a(r58Var, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    nld nldVar = c4cVar.c;
                    this.b = 1;
                    gk2 gk2Var = ((yld) nldVar).a.V;
                    ((mm) gk2Var.a).q(-571959754, "DELETE FROM DbTrash\nWHERE type = 0", null);
                    gk2Var.C(-571959754, new bq2(1));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
