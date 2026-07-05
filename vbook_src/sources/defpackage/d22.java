package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d22  reason: default package */
/* loaded from: classes3.dex */
public final class d22 extends aab implements mu4 {
    public final /* synthetic */ int a = 0;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d22(m82 m82Var, vt4 vt4Var, lq lqVar, lf4 lf4Var, aw7 aw7Var, m42 m42Var) {
        super(3, m42Var);
        this.b = m82Var;
        this.c = vt4Var;
        this.d = lqVar;
        this.e = lf4Var;
        this.f = aw7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                d22 d22Var = new d22((a22) obj6, (hj1) obj5, (p81) obj4, (m42) obj3);
                d22Var.b = (gh5) obj;
                d22Var.c = (rf8) obj2;
                return d22Var.invokeSuspend(pvcVar);
            default:
                m82 m82Var = (m82) obj;
                ((Number) obj2).floatValue();
                new d22((m82) this.b, (vt4) this.c, (lq) obj6, (lf4) obj5, (aw7) obj4, (m42) obj3).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        rf8 rf8Var;
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                gh5 gh5Var = (gh5) this.b;
                rf8 rf8Var2 = (rf8) this.c;
                hre.r(obj);
                if (!((a22) obj3).a) {
                    return null;
                }
                uy1 uy1Var = gh5Var.f;
                xtc xtcVar = gh5Var.a;
                List<String> list = (List) uy1Var.e(e22.c);
                if (list == null) {
                    pw6 pw6Var = e22.a;
                    if (!gwe.k(pw6Var)) {
                        return null;
                    }
                    pw6Var.i("Skipping request compression for " + xtcVar + " because no compressions set");
                    return null;
                }
                pw6 pw6Var2 = e22.a;
                if (gwe.k(pw6Var2)) {
                    pw6Var2.i("Compressing request body for " + xtcVar + " using " + list);
                }
                p81 p81Var = (p81) obj2;
                ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                for (String str : list) {
                    z12 z12Var = (z12) p81Var.get(str);
                    if (z12Var != null) {
                        arrayList.add(z12Var);
                    } else {
                        throw new bj1(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    z12 z12Var2 = (z12) obj4;
                    b9b b9bVar = gh5Var.e;
                    rf8Var2.getClass();
                    z12Var2.getClass();
                    b9bVar.getClass();
                    if (rf8Var2 instanceof pf8) {
                        rf8Var = new hy1(rf8Var2, new gy1(rf8Var2, 0), z12Var2, b9bVar);
                    } else if (rf8Var2 instanceof qf8) {
                        rf8Var = new iy1((qf8) rf8Var2, z12Var2, b9bVar);
                    } else if (rf8Var2 instanceof nf8) {
                        rf8Var = new hy1(rf8Var2, new gy1(rf8Var2, 1), z12Var2, b9bVar);
                    } else if (rf8Var2 instanceof of8) {
                        rf8Var = null;
                    } else {
                        xk5.o();
                        return null;
                    }
                    if (rf8Var != null) {
                        rf8Var2 = rf8Var;
                    }
                }
                return rf8Var2;
            default:
                hre.r(obj);
                z87.v((m82) this.b, null, null, new z45((vt4) this.c, (lq) obj3, (lf4) this.e, (aw7) obj2, (m42) null, 9), 3);
                return pvc.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d22(a22 a22Var, hj1 hj1Var, p81 p81Var, m42 m42Var) {
        super(3, m42Var);
        this.d = a22Var;
        this.e = hj1Var;
        this.f = p81Var;
    }
}
