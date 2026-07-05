package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oh2  reason: default package */
/* loaded from: classes3.dex */
public final class oh2 implements sj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ oh2(sj4 sj4Var, String str, int i) {
        this.a = i;
        this.b = sj4Var;
        this.c = str;
    }

    @Override // defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        String str = this.c;
        sj4 sj4Var = this.b;
        switch (i) {
            case 0:
                Object a = sj4Var.a(new nh2(tj4Var, str, 0), m42Var);
                if (a == n82Var) {
                    return a;
                }
                return pvcVar;
            case 1:
                Object a2 = sj4Var.a(new nh2(tj4Var, str, 1), m42Var);
                if (a2 == n82Var) {
                    return a2;
                }
                return pvcVar;
            case 2:
                Object a3 = sj4Var.a(new nh2(tj4Var, str, 2), m42Var);
                if (a3 == n82Var) {
                    return a3;
                }
                return pvcVar;
            default:
                Object a4 = sj4Var.a(new nh2(tj4Var, str, 3), m42Var);
                if (a4 == n82Var) {
                    return a4;
                }
                return pvcVar;
        }
    }
}
