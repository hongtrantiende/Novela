package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gub  reason: default package */
/* loaded from: classes.dex */
public final class gub extends m03 implements fd6, hz4, wx1 {
    public hvb M;
    public boolean N;
    public final av0 O;
    public Map P;

    public gub(hvb hvbVar, mkc mkcVar, oyb oybVar, boolean z, lu4 lu4Var, t86 t86Var) {
        boolean z2;
        this.M = hvbVar;
        this.N = z;
        av0 av0Var = new av0(hvbVar.h);
        H1(av0Var);
        this.O = av0Var;
        hvb hvbVar2 = this.M;
        hvbVar2.b = lu4Var;
        boolean z3 = this.N;
        boolean z4 = !z3;
        msb msbVar = hvbVar2.a;
        msbVar.getClass();
        if (t86Var.c == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        msbVar.a.setValue(new lsb(mkcVar, oybVar, z3, z4, z2));
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        float f;
        hvb hvbVar = this.M;
        msb msbVar = hvbVar.a;
        msbVar.getClass();
        ksb ksbVar = new ksb(e37Var, e37Var.getLayoutDirection(), (do4) nye.q(this, dy1.k), j);
        msbVar.b.setValue(ksbVar);
        lsb lsbVar = (lsb) msbVar.a.getValue();
        if (lsbVar != null) {
            fvb f2 = msbVar.f(lsbVar, ksbVar);
            long j2 = f2.c;
            lu4 lu4Var = hvbVar.b;
            if (lu4Var != null) {
                lu4Var.invoke(e37Var, new imb(hvbVar, 6));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            mw8 M = w27Var.M(ak0.r(i, i, i2, i2));
            hvb hvbVar2 = this.M;
            if (this.N) {
                f = e37Var.y0(qwe.l(f2.b.b(0)));
            } else {
                f = nae.e;
            }
            hvbVar2.g.setValue(new rg3(f));
            Map map = this.P;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(hc.a, Integer.valueOf(Math.round(f2.d)));
            map.put(hc.b, Integer.valueOf(Math.round(f2.e)));
            this.P = map;
            return e37Var.q0(i, i2, map, new a1(M, 18));
        }
        ov5.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        ls2.c();
        return null;
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        this.M.d.setValue(i38Var);
    }
}
