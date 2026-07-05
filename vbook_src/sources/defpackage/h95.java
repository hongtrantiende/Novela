package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h95  reason: default package */
/* loaded from: classes3.dex */
public final class h95 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ j95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h95(j95 j95Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = j95Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        j95 j95Var = this.c;
        switch (i) {
            case 0:
                return new h95(j95Var, m42Var, 0);
            case 1:
                return new h95(j95Var, m42Var, 1);
            case 2:
                return new h95(j95Var, m42Var, 2);
            default:
                return new h95(j95Var, m42Var, 3);
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
                return ((h95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((h95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((h95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((h95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        j95 j95Var = this.c;
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
                mm mmVar = (mm) ((jg3) j95Var.e).a.F.a;
                fm2 fm2Var = new fm2(29);
                mmVar.getClass();
                s02 O = v9e.O(new xla(-1325179802, new String[]{"DbDownload"}, mmVar, "DbDownload.sq", "getDownloadCount", "SELECT COUNT(*)\nFROM DbDownload\nWHERE status = 0 OR status = 1 OR status = 2", fm2Var));
                sw2 sw2Var = ab3.a;
                sl4 A = v9e.A(O, ru2.c);
                g95 g95Var = new g95(j95Var, 0);
                this.b = 1;
                if (A.a(g95Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                yf3 yf3Var = j95Var.e;
                this.b = 1;
                if (((jg3) yf3Var).d(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                jj9 b = ((en6) j95Var.c).b();
                g95 g95Var2 = new g95(j95Var, 1);
                this.b = 1;
                if (b.a.a(g95Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                wl6 wl6Var = j95Var.d;
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                mm mmVar2 = (mm) ((bn6) wl6Var).a.c.a;
                bk2 bk2Var = new bk2(9);
                mmVar2.getClass();
                s02 O2 = v9e.O(new xla(647714544, new String[]{"DbBook"}, mmVar2, "DbBook.sq", "countShelfAll", "SELECT COUNT(*)\nFROM DbBook\nWHERE location = 1", bk2Var));
                sw2 sw2Var2 = ab3.a;
                ru2 ru2Var = ru2.c;
                sl4 A2 = v9e.A(O2, ru2Var);
                gk2 gk2Var = ((bn6) wl6Var).a.c;
                gk2Var.getClass();
                sl4 sl4Var = new sl4(v9e.O(new pk2(gk2Var, 1, new bk2(13), 0)), ru2Var, 1);
                gk2 gk2Var2 = ((bn6) wl6Var).a.c;
                gk2Var2.getClass();
                sl4 sl4Var2 = new sl4(v9e.O(new pk2(gk2Var2, 2, new bk2(13), 0)), ru2Var, 1);
                sl4 l = ((bn6) wl6Var).l();
                gk2 gk2Var3 = ((bn6) wl6Var).a.c;
                gk2Var3.getClass();
                sl4 sl4Var3 = new sl4(v9e.O(new pk2(gk2Var3, 4, new bk2(13), 0)), ru2Var, 1);
                gk2 gk2Var4 = ((bn6) wl6Var).a.c;
                gk2Var4.getClass();
                ja jaVar = new ja(13, new sj4[]{A2, sl4Var, sl4Var2, l, sl4Var3, new sl4(v9e.O(new pk2(gk2Var4, 3, new bk2(13), 0)), ru2Var, 1)}, j95Var);
                this.b = 1;
                if (z1d.u(jaVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
