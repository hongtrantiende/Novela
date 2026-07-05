package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qrb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qrb implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ trb b;

    public /* synthetic */ qrb(trb trbVar, int i) {
        this.a = i;
        this.b = trbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [ez5, java.lang.Object, ch3] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        trb trbVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (trbVar.P && !trbVar.Q) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue) {
                    if (z) {
                        trbVar.P1(false);
                    }
                } else {
                    trbVar.K1();
                    mkc mkcVar = trbVar.M;
                    dub dubVar = mkcVar.a;
                    og0 og0Var = mkcVar.b;
                    dubVar.b.a().k();
                    frb frbVar = dubVar.b;
                    frbVar.f(null);
                    mkcVar.o(frbVar);
                    dub.a(dubVar, og0Var, true, wrb.a);
                    dubVar.f(true);
                    trbVar.M.a();
                }
                iue.R(trbVar, new prb(trbVar, 1));
                return pvcVar;
            case 1:
                bh3 bh3Var = (bh3) obj;
                ck9.a(trbVar);
                return pvcVar;
            case 2:
                bh3 bh3Var2 = (bh3) obj;
                ?? obj2 = new Object();
                trbVar.U.c(obj2);
                trbVar.Y = obj2;
                ck9.a(trbVar);
                return pvcVar;
            case 3:
                hvb hvbVar = trbVar.N;
                long j = ((y78) obj).a;
                sc6 b = hvbVar.b();
                if (b != null && b.t()) {
                    j = b.O(j);
                }
                int d = trbVar.N.d(true, j);
                if (d >= 0) {
                    trbVar.M.m(sze.a(d, d));
                }
                trbVar.O.z(h35.a, j);
                return pvcVar;
            case 4:
                bh3 bh3Var3 = (bh3) obj;
                trbVar.L1();
                trbVar.O.d();
                ck9.a(trbVar);
                return pvcVar;
            case 5:
                bh3 bh3Var4 = (bh3) obj;
                trbVar.L1();
                return pvcVar;
            case 6:
                z87.v(trbVar.v1(), null, p82.d, new koa((f86) obj, trbVar, null, 18), 1);
                return pvcVar;
            case 7:
                List list = (List) obj;
                fvb c = trbVar.N.c();
                if (c != null) {
                    z2 = list.add(c);
                }
                return Boolean.valueOf(z2);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                trbVar.O.l.setValue(bool);
                return pvcVar;
        }
    }
}
