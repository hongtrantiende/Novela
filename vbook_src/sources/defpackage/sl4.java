package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sl4  reason: default package */
/* loaded from: classes3.dex */
public final class sl4 implements sj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s02 b;
    public final /* synthetic */ d82 c;

    public /* synthetic */ sl4(s02 s02Var, d82 d82Var, int i) {
        this.a = i;
        this.b = s02Var;
        this.c = d82Var;
    }

    @Override // defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        d82 d82Var = this.c;
        s02 s02Var = this.b;
        switch (i) {
            case 0:
                Object a = s02Var.a(new rl4(tj4Var, d82Var, 0), m42Var);
                if (a == n82Var) {
                    return a;
                }
                return pvcVar;
            case 1:
                Object a2 = s02Var.a(new rl4(tj4Var, d82Var, 1), m42Var);
                if (a2 == n82Var) {
                    return a2;
                }
                return pvcVar;
            default:
                Object a3 = s02Var.a(new rl4(tj4Var, d82Var, 2), m42Var);
                if (a3 == n82Var) {
                    return a3;
                }
                return pvcVar;
        }
    }
}
