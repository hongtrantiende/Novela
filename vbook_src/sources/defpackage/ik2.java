package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ik2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ik2 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ ik2(String str, long j, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        iw9 h1;
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.j(0, Long.valueOf(j));
                nmVar.g(1, str);
                return pvcVar;
            case 1:
                nm nmVar2 = (nm) obj;
                nmVar2.getClass();
                nmVar2.j(0, Long.valueOf(j));
                nmVar2.g(1, str);
                return pvcVar;
            case 2:
                nm nmVar3 = (nm) obj;
                nmVar3.getClass();
                nmVar3.j(0, Long.valueOf(j));
                nmVar3.g(1, str);
                return pvcVar;
            case 3:
                nm nmVar4 = (nm) obj;
                nmVar4.getClass();
                nmVar4.j(0, Long.valueOf(j));
                nmVar4.g(1, str);
                return pvcVar;
            case 4:
                nm nmVar5 = (nm) obj;
                nmVar5.getClass();
                nmVar5.j(0, Long.valueOf(j));
                nmVar5.g(1, str);
                return pvcVar;
            case 5:
                nm nmVar6 = (nm) obj;
                nmVar6.getClass();
                nmVar6.j(0, Long.valueOf(j));
                nmVar6.g(1, str);
                return pvcVar;
            case 6:
                nm nmVar7 = (nm) obj;
                nmVar7.getClass();
                nmVar7.j(0, Long.valueOf(j));
                nmVar7.g(1, str);
                return pvcVar;
            case 7:
                nm nmVar8 = (nm) obj;
                nmVar8.getClass();
                nmVar8.j(0, Long.valueOf(j));
                nmVar8.g(1, str);
                return pvcVar;
            case 8:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                h1 = cw9Var.h1("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    h1.m(1, j);
                    h1.b0(2, str);
                    h1.Z0();
                    int y = tl1.y(cw9Var);
                    h1.close();
                    return Integer.valueOf(y);
                } finally {
                }
            default:
                cw9 cw9Var2 = (cw9) obj;
                cw9Var2.getClass();
                h1 = cw9Var2.h1("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    h1.m(1, j);
                    h1.b0(2, str);
                    h1.Z0();
                    return pvcVar;
                } finally {
                }
        }
    }
}
