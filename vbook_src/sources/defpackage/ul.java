package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ul  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ul implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ul(yld yldVar, String str, String str2, boolean z) {
        this.a = 2;
        this.c = yldVar;
        this.d = str;
        this.e = str2;
        this.b = z;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int k;
        int i = this.a;
        boolean z = this.b;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                nl5 nl5Var = (nl5) obj3;
                wl0 wl0Var = (wl0) obj2;
                qd6 qd6Var = (qd6) obj;
                qd6Var.a();
                n61 n61Var = qd6Var.a;
                if (((Boolean) ((vt4) obj4).invoke()).booleanValue()) {
                    if (z) {
                        long b1 = n61Var.b1();
                        ij1 ij1Var = n61Var.b;
                        long G = ij1Var.G();
                        ij1Var.w().i();
                        try {
                            ((mu9) ij1Var.b).A(-1.0f, 1.0f, b1);
                            ak3.W(qd6Var, nl5Var, 0L, nae.e, wl0Var, 0, 46);
                        } finally {
                            rs8.r(ij1Var, G);
                        }
                    } else {
                        ak3.W(qd6Var, nl5Var, 0L, nae.e, wl0Var, 0, 46);
                    }
                }
                return pvcVar;
            case 1:
                iw2 iw2Var = (iw2) obj4;
                m82 m82Var = (m82) obj3;
                yya yyaVar = (yya) obj2;
                int intValue = ((Integer) obj).intValue();
                if (z && (k = iw2Var.k() + intValue) >= 0 && k < ((List) yyaVar.getValue()).size()) {
                    z87.v(m82Var, null, null, new ed3(iw2Var, k, null, 0), 3);
                }
                return pvcVar;
            case 2:
                String str = (String) obj3;
                ((vjc) obj).getClass();
                ii2 ii2Var = ((yld) obj4).a;
                ii2Var.V.e0(str);
                gk2 gk2Var = ii2Var.V;
                String B = ube.B();
                yj1 yj1Var = by5.a;
                gk2Var.G0(new zp2(0, yj1Var.k().b(), yj1Var.k().b(), B, (String) obj2, str, this.b));
                return pvcVar;
            default:
                lr6 lr6Var = (lr6) obj4;
                String str2 = (String) obj3;
                nnd nndVar = (nnd) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof fnd) {
                    lr6Var.c.compareAndSet(-256, ((fnd) th).a);
                }
                if (z && str2 != null) {
                    r0f r0fVar = nndVar.e.m;
                    int hashCode = nndVar.a.hashCode();
                    r0fVar.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        ric.b(sxd.o(str2), hashCode);
                    } else {
                        String o = sxd.o(str2);
                        try {
                            if (sxd.q == null) {
                                sxd.q = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            sxd.q.invoke(null, Long.valueOf(sxd.n), o, Integer.valueOf(hashCode));
                        } catch (Exception e) {
                            sxd.k("asyncTraceEnd", e);
                        }
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ul(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ul(boolean z, iw2 iw2Var, m82 m82Var, yya yyaVar) {
        this.a = 1;
        this.b = z;
        this.c = iw2Var;
        this.d = m82Var;
        this.e = yyaVar;
    }
}
