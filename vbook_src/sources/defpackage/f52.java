package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f52  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f52 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ btd b;

    public /* synthetic */ f52(btd btdVar, int i) {
        this.a = i;
        this.b = btdVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long b;
        int i = this.a;
        mw6 mw6Var = mw6.a;
        pvc pvcVar = pvc.a;
        btd btdVar = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                zjc g = btdVar.g();
                float a = g.a();
                long j = g.b;
                if (a >= 1.0f) {
                    t15Var.v(g.a());
                    t15Var.l(Float.intBitsToFloat((int) (g.a & 4294967295L)));
                    t15Var.x(Float.intBitsToFloat((int) (j >> 32)));
                    t15Var.i(Float.intBitsToFloat((int) (j & 4294967295L)));
                    t15Var.Z0(g.d);
                }
                return pvcVar;
            case 1:
                t15 t15Var2 = (t15) obj;
                t15Var2.getClass();
                zjc g2 = btdVar.g();
                qw6 qw6Var = btdVar.a;
                qw6Var.getClass();
                if (qw6Var.a(mw6Var)) {
                    pj pjVar = qw6Var.b;
                    String str = qw6Var.a;
                    pjVar.getClass();
                    pj.a(mw6Var, str, "ZoomableState. graphicsLayer. transform=" + g2);
                }
                float a2 = g2.a();
                long j2 = g2.b;
                t15Var2.v(a2);
                t15Var2.l(Float.intBitsToFloat((int) (g2.a & 4294967295L)));
                t15Var2.x(Float.intBitsToFloat((int) (j2 >> 32)));
                t15Var2.i(Float.intBitsToFloat((int) (j2 & 4294967295L)));
                t15Var2.Z0(g2.d);
                return pvcVar;
            case 2:
                t15 t15Var3 = (t15) obj;
                t15Var3.getClass();
                zjc g3 = btdVar.g();
                t15Var3.h(g3.c);
                t15Var3.Z0(g3.e);
                return pvcVar;
            case 3:
                t15 t15Var4 = (t15) obj;
                t15Var4.getClass();
                long j3 = ((zy5) btdVar.f.getValue()).a;
                long f = btdVar.f();
                mfb mfbVar = yw1.a;
                if (((int) (j3 >> 32)) > 0 && ((int) (j3 & 4294967295L)) > 0 && ((int) (f >> 32)) > 0 && ((int) (f & 4294967295L)) > 0) {
                    b = ase.r(dye.u(j3), dye.u(f));
                } else {
                    int i2 = lz9.c;
                    b = mz9.b();
                }
                qw6 qw6Var2 = btdVar.a;
                qw6Var2.getClass();
                if (qw6Var2.a(mw6Var)) {
                    String c = zy5.c(j3);
                    String c2 = zy5.c(f);
                    String d = lz9.d(b);
                    StringBuilder y = nk2.y("ZoomableState. graphicsLayer. scaleByContentSize. contentOriginSize=", c, ", contentSize=", c2, ", scaleFactor=");
                    y.append(d);
                    String sb = y.toString();
                    pj pjVar2 = qw6Var2.b;
                    String str2 = qw6Var2.a;
                    pjVar2.getClass();
                    pj.a(mw6Var, str2, sb);
                }
                t15Var4.v(lz9.b(b));
                t15Var4.l(lz9.c(b));
                t15Var4.Z0(y9e.j(nae.e, nae.e));
                return pvcVar;
            default:
                yrd yrdVar = (yrd) obj;
                yrdVar.getClass();
                btdVar.P.setValue(dye.x(yrdVar.q));
                btdVar.Q.setValue(dye.x(yrdVar.r));
                btdVar.O.setValue(dye.x(yrdVar.s));
                btdVar.R.i(yrdVar.t);
                btdVar.S.i(yrdVar.u);
                btdVar.T.i(yrdVar.v);
                btdVar.U.setValue(dye.w(yrdVar.w));
                btdVar.V.setValue(dye.r(yrdVar.w));
                btdVar.W.setValue(dye.w(yrdVar.x));
                btdVar.X.setValue(dye.r(yrdVar.x));
                btdVar.Y.setValue(dye.w(yrdVar.y));
                btdVar.Z.setValue(dye.r(yrdVar.y));
                btdVar.a0.setValue(dye.w(yrdVar.z));
                btdVar.b0.setValue(dye.r(yrdVar.z));
                btdVar.c0.setValue(new kz9(dye.z(yrdVar.A)));
                btdVar.d0.setValue(dye.w(yrdVar.B));
                btdVar.e0.setValue(dye.r(yrdVar.B));
                btdVar.f0.setValue(dye.w(yrdVar.D));
                btdVar.g0.setValue(dye.r(yrdVar.D));
                btdVar.h0.setValue(dye.r(yrdVar.D));
                btdVar.i0.setValue(yrdVar.C);
                btdVar.j0.i(yrdVar.E);
                return pvcVar;
        }
    }
}
