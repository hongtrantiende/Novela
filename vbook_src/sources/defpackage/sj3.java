package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sj3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sj3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ sj3(uj3 uj3Var, int i) {
        this.a = i;
        this.b = uj3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        pvc pvcVar = pvc.a;
        uj3 uj3Var = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.w(true);
                t15Var.J0((jfa) uj3Var.L.g);
                t15Var.k0(1);
                return pvcVar;
            case 1:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                k61 w = ak3Var.Q0().w();
                float h = uj3Var.U.h();
                int i2 = (h > nae.e ? 1 : (h == nae.e ? 0 : -1));
                if (i2 != 0) {
                    w.p(h, h);
                }
                uj3Var.O.invoke(ak3Var, new sj3(uj3Var, 3));
                if (i2 != 0) {
                    float f = -h;
                    w.p(f, f);
                }
                return pvcVar;
            case 2:
                ak3 ak3Var2 = (ak3) obj;
                ak3Var2.getClass();
                p15 p15Var = uj3Var.R;
                if (p15Var != null) {
                    float h2 = uj3Var.U.h();
                    int i3 = (int) h2;
                    int i4 = i3 * 2;
                    sj3 sj3Var = uj3Var.V;
                    sj3Var.getClass();
                    ak3Var2.R(((((int) Float.intBitsToFloat((int) (ak3Var2.b() & 4294967295L))) + i4) & 4294967295L) | ((((int) Float.intBitsToFloat((int) (ak3Var2.b() >> 32))) + i4) << 32), new j34(14, voe.v(uj3Var).V, sj3Var), p15Var);
                    if (h2 == nae.e) {
                        j = 0;
                    } else {
                        long j2 = -i3;
                        j = (j2 & 4294967295L) | (j2 << 32);
                    }
                    if (!py5.b(p15Var.t, j)) {
                        p15Var.t = j;
                        p15Var.a.H((int) (j >> 32), p15Var.u, (int) (j & 4294967295L));
                    }
                    npe.p(ak3Var2, p15Var);
                }
                return pvcVar;
            default:
                ak3 ak3Var3 = (ak3) obj;
                ak3Var3.getClass();
                uj3Var.K.b(ak3Var3, uj3Var.Q, (sc6) uj3Var.T.getValue(), uj3Var.N);
                return pvcVar;
        }
    }
}
