package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c1d  reason: default package */
/* loaded from: classes3.dex */
public final class c1d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ d1d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1d(d1d d1dVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = d1dVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        d1d d1dVar = this.c;
        switch (i) {
            case 0:
                return new c1d(d1dVar, m42Var, 0);
            case 1:
                return new c1d(d1dVar, m42Var, 1);
            default:
                return new c1d(d1dVar, m42Var, 2);
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
                return ((c1d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((c1d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((c1d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        d1d d1dVar = this.c;
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
                    jj9 q = z1d.q(((x0d) d1dVar.c).h);
                    b1d b1dVar = new b1d(d1dVar, 0);
                    this.b = 1;
                    if (q.a.a(b1dVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 1:
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
                    mm mmVar = (mm) ((d58) d1dVar.e).a.M.a;
                    ao2 ao2Var = new ao2(25);
                    mmVar.getClass();
                    s02 O = v9e.O(new xla(-1424942206, new String[]{"DbNotification"}, mmVar, "DbNotification.sq", "getUnreadCount", "SELECT COUNT(*) FROM DbNotification\nWHERE read = 0", ao2Var));
                    sw2 sw2Var = ab3.a;
                    sl4 A = v9e.A(O, ru2.c);
                    b1d b1dVar2 = new b1d(d1dVar, 1);
                    this.b = 1;
                    if (A.a(b1dVar2, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    m0d m0dVar = d1dVar.c;
                    this.b = 1;
                    ((x0d) m0dVar).h();
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
