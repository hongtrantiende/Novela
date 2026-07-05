package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l52  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l52 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r13 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ l52(r13 r13Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = r13Var;
        this.c = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        ix8 ix8Var = lx8.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        r13 r13Var = this.b;
        switch (i) {
            case 0:
                aw7Var.setValue(new rg3(r13Var.y0((int) (((zy5) obj).a >> 32))));
                return pvcVar;
            case 1:
                aw7Var.setValue(new rg3(r13Var.y0((int) (((zy5) obj).a & 4294967295L))));
                return pvcVar;
            case 2:
                nv nvVar = new nv(16, (vt4) obj);
                l52 l52Var = new l52(r13Var, aw7Var, 3);
                if (yz6.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        ix8Var = nc6.b;
                    }
                    return yz6.b(kq7.a, nvVar, null, l52Var, true, 0L, ix8Var, 490);
                }
                xk5.q("Magnifier is only supported on API level 28 and higher.");
                return null;
            case 3:
                ug3 ug3Var = (ug3) obj;
                aw7Var.setValue(new zy5((r13Var.X0(ug3.b(ug3Var.a)) << 32) | (r13Var.X0(ug3.a(ug3Var.a)) & 4294967295L)));
                return pvcVar;
            case 4:
                nv nvVar2 = new nv(17, (vt4) obj);
                l52 l52Var2 = new l52(r13Var, aw7Var, 5);
                if (yz6.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        ix8Var = nc6.b;
                    }
                    return yz6.b(kq7.a, nvVar2, null, l52Var2, true, 0L, ix8Var, 490);
                }
                xk5.q("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                ug3 ug3Var2 = (ug3) obj;
                aw7Var.setValue(new zy5((r13Var.X0(ug3.b(ug3Var2.a)) << 32) | (r13Var.X0(ug3.a(ug3Var2.a)) & 4294967295L)));
                return pvcVar;
        }
    }
}
