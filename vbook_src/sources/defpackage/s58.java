package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s58  reason: default package */
/* loaded from: classes3.dex */
public final class s58 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ t58 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s58(t58 t58Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = t58Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        t58 t58Var = this.c;
        switch (i) {
            case 0:
                return new s58(t58Var, m42Var, 0);
            case 1:
                return new s58(t58Var, m42Var, 1);
            default:
                return new s58(t58Var, m42Var, 2);
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
                return ((s58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((s58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((s58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        t58 t58Var = this.c;
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
                    gk2 gk2Var = ((d58) t58Var.c).a.M;
                    gk2Var.getClass();
                    uo2 uo2Var = uo2.a;
                    mm mmVar = (mm) gk2Var.a;
                    bo2 bo2Var = new bo2(gk2Var);
                    mmVar.getClass();
                    s02 O = v9e.O(new xla(-866601853, new String[]{"DbNotification"}, mmVar, "DbNotification.sq", "getAll", "SELECT DbNotification.id, DbNotification.type, DbNotification.content, DbNotification.createAt, DbNotification.read FROM DbNotification\nORDER BY read ASC, createAt DESC", bo2Var));
                    sw2 sw2Var = ab3.a;
                    hs0 hs0Var = new hs0(v9e.z(O, ru2.c), 20);
                    r58 r58Var = new r58(t58Var, 0);
                    this.b = 1;
                    if (hs0Var.a(r58Var, this) == n82Var) {
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
                    a58 a58Var = t58Var.c;
                    this.b = 1;
                    ((d58) a58Var).a.M.b0();
                    if (pvcVar == n82Var) {
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
                    a58 a58Var2 = t58Var.c;
                    this.b = 1;
                    gk2 gk2Var2 = ((d58) a58Var2).a.M;
                    ((mm) gk2Var2.a).q(-570018684, "UPDATE DbNotification\nSET read = 1\nWHERE read = 0", null);
                    gk2Var2.C(-570018684, new ao2(23));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
