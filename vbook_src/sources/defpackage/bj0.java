package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bj0 implements vt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bj0(dw1 dw1Var, boolean z, vt4 vt4Var, vt4 vt4Var2, boolean z2, vt4 vt4Var3, vt4 vt4Var4, g08 g08Var) {
        this.d = dw1Var;
        this.b = z;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.c = z2;
        this.C = vt4Var3;
        this.D = vt4Var4;
        this.E = g08Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        epb epbVar;
        iya iyaVar;
        f08 f08Var;
        f08 f08Var2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.E;
        Object obj2 = this.D;
        Object obj3 = this.C;
        boolean z = this.c;
        Object obj4 = this.e;
        boolean z2 = this.b;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ytb ytbVar = (ytb) this.f;
                s35 s35Var = (s35) obj3;
                pj1 pj1Var = (pj1) obj2;
                r13 r13Var = (r13) obj;
                ((mkc) obj5).b = (og0) obj4;
                if (!z2 && (epbVar = ytbVar.d.a) != null && (iyaVar = epbVar.Q) != null) {
                    iyaVar.cancel(null);
                    epbVar.Q = null;
                }
                ytbVar.k = s35Var;
                ytbVar.g = pj1Var;
                ytbVar.c = r13Var;
                ytbVar.i = z2;
                ytbVar.j = z;
                return pvcVar;
            default:
                dw1 dw1Var = (dw1) obj5;
                vt4 vt4Var = (vt4) obj4;
                vt4 vt4Var2 = (vt4) obj3;
                vt4 vt4Var3 = (vt4) obj2;
                g08 g08Var = (g08) obj;
                if (dw1Var.f != z2) {
                    dw1Var.f = z2;
                    yz7 yz7Var = dw1Var.g;
                    if (yz7Var != null && (f08Var2 = yz7Var.d) != null) {
                        f08Var2.b();
                    }
                }
                dw1Var.i = vt4Var;
                dw1Var.i(z);
                dw1Var.j = vt4Var2;
                dw1Var.k = vt4Var3;
                d08 d08Var = (d08) g08Var.c.getValue();
                List list = (List) g08Var.b.getValue();
                List list2 = (List) g08Var.d.getValue();
                d08Var.getClass();
                list.getClass();
                list2.getClass();
                dw1Var.a = d08Var;
                dw1Var.b = list;
                dw1Var.c = list2;
                yz7 yz7Var2 = dw1Var.g;
                if (yz7Var2 != null && (f08Var = yz7Var2.d) != null) {
                    f08Var.d(dw1Var);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ bj0(mkc mkcVar, og0 og0Var, ytb ytbVar, s35 s35Var, pj1 pj1Var, ej0 ej0Var, r13 r13Var, boolean z, boolean z2) {
        this.d = mkcVar;
        this.e = og0Var;
        this.f = ytbVar;
        this.C = s35Var;
        this.D = pj1Var;
        this.E = r13Var;
        this.b = z;
        this.c = z2;
    }
}
