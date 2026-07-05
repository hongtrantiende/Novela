package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l72  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l72 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l72(ol6 ol6Var, boolean z, oid oidVar, gtb gtbVar, jub jubVar, j88 j88Var) {
        this.c = ol6Var;
        this.b = z;
        this.d = oidVar;
        this.e = gtbVar;
        this.f = jubVar;
        this.C = j88Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        wub wubVar;
        sc6 sc6Var;
        sc6 sc6Var2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.C;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ol6 ol6Var = (ol6) obj6;
                hm8 hm8Var = ol6Var.o;
                oid oidVar = (oid) obj5;
                gtb gtbVar = (gtb) obj4;
                jub jubVar = (jub) obj3;
                j88 j88Var = (j88) obj2;
                sc6 sc6Var3 = (sc6) obj;
                ol6Var.h = sc6Var3;
                gvb d = ol6Var.d();
                if (d != null) {
                    d.b = sc6Var3;
                }
                if (z) {
                    if (ol6Var.a() == l35.b) {
                        if (((Boolean) ol6Var.l.getValue()).booleanValue() && ((zk6) oidVar).c()) {
                            gtbVar.r();
                        } else {
                            gtbVar.o();
                        }
                        ol6Var.m.setValue(Boolean.valueOf(p17.i(gtbVar, true)));
                        ol6Var.n.setValue(Boolean.valueOf(p17.i(gtbVar, false)));
                        hm8Var.setValue(Boolean.valueOf(fxb.d(jubVar.b)));
                    } else if (ol6Var.a() == l35.c) {
                        hm8Var.setValue(Boolean.valueOf(p17.i(gtbVar, true)));
                    }
                    ch0.s(ol6Var, jubVar, j88Var);
                    gvb d2 = ol6Var.d();
                    if (d2 != null && (wubVar = ol6Var.e) != null && ol6Var.b() && (sc6Var = d2.b) != null && sc6Var.t() && (sc6Var2 = d2.c) != null) {
                        fvb fvbVar = d2.a;
                        lv0 lv0Var = new lv0(sc6Var, 4);
                        rk9 w = yte.w(sc6Var);
                        rk9 g0 = sc6Var.g0(sc6Var2, false);
                        if (c16.i((wub) wubVar.a.b.get(), wubVar)) {
                            wubVar.b.d(jubVar, j88Var, fvbVar, lv0Var, w, g0);
                        }
                    }
                }
                return pvcVar;
            default:
                zl0 zl0Var = (zl0) obj6;
                xl0 xl0Var = (xl0) obj5;
                zoa zoaVar = (zoa) obj4;
                aw7 aw7Var = (aw7) obj3;
                aw7 aw7Var2 = (aw7) obj2;
                dn4 dn4Var = (dn4) obj;
                dn4Var.getClass();
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                aw7Var.setValue(Boolean.valueOf(dn4Var.b()));
                if (dn4Var.b() && !z) {
                    zl0Var.e(xl0Var.a);
                }
                if (!dn4Var.b() && booleanValue) {
                    if (zoaVar != null && zoaVar.f >= 0) {
                        zoaVar.a();
                    }
                    aw7Var2.setValue(null);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ l72(boolean z, zl0 zl0Var, xl0 xl0Var, zoa zoaVar, aw7 aw7Var, aw7 aw7Var2) {
        this.b = z;
        this.c = zl0Var;
        this.d = xl0Var;
        this.e = zoaVar;
        this.f = aw7Var;
        this.C = aw7Var2;
    }
}
