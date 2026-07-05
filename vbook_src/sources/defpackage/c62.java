package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c62  reason: default package */
/* loaded from: classes.dex */
public final class c62 implements lu4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public c62(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        long j;
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            ar5 ar5Var = zve.i;
            if (ar5Var == null) {
                zq5 zq5Var = new zq5("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = k4d.a;
                esa esaVar = new esa(zl1.b);
                hy hyVar = new hy(2);
                hyVar.i(18.0f, 8.0f);
                hyVar.f(-1.0f);
                hyVar.g(17.0f, 6.0f);
                hyVar.d(nae.e, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                tn8 tn8Var = new tn8(7.0f, 3.24f, 7.0f, 6.0f);
                ArrayList arrayList = hyVar.a;
                arrayList.add(tn8Var);
                hyVar.p(2.0f);
                hyVar.g(6.0f, 8.0f);
                hyVar.d(-1.1f, nae.e, -2.0f, 0.9f, -2.0f, 2.0f);
                hyVar.p(10.0f);
                hyVar.d(nae.e, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                hyVar.f(12.0f);
                hyVar.d(1.1f, nae.e, 2.0f, -0.9f, 2.0f, -2.0f);
                hyVar.g(20.0f, 10.0f);
                hyVar.d(nae.e, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                hyVar.b();
                hyVar.i(12.0f, 17.0f);
                hyVar.d(-1.1f, nae.e, -2.0f, -0.9f, -2.0f, -2.0f);
                arrayList.add(new bo8(0.9f, -2.0f, 2.0f, -2.0f));
                arrayList.add(new bo8(2.0f, 0.9f, 2.0f, 2.0f));
                arrayList.add(new bo8(-0.9f, 2.0f, -2.0f, 2.0f));
                hyVar.b();
                hyVar.i(15.1f, 8.0f);
                hyVar.g(8.9f, 8.0f);
                hyVar.g(8.9f, 6.0f);
                hyVar.d(nae.e, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                hyVar.d(1.71f, nae.e, 3.1f, 1.39f, 3.1f, 3.1f);
                hyVar.p(2.0f);
                hyVar.b();
                zq5Var.c(1.0f, 1.0f, 1.0f, 1.0f, nae.e, 1.0f, nae.e, 0, 0, 2, esaVar, null, "", arrayList);
                ar5Var = zq5Var.e();
                zve.i = ar5Var;
            }
            if (this.a) {
                j = this.b;
            } else {
                j = this.c;
            }
            nk5.a(ar5Var, null, null, j, rv4Var, 48, 4);
        }
        return pvc.a;
    }
}
