package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ta  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ta(int i, vt4 vt4Var, nq7 nq7Var, String str, boolean z) {
        this.a = 1;
        this.b = str;
        this.c = z;
        this.d = nq7Var;
        this.f = vt4Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        pvc pvcVar = pvc.a;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                w92.g((String) obj5, (m9) obj3, this.c, (nq7) obj4, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                fbe.l((String) obj5, this.c, (nq7) obj4, (vt4) obj3, (rv4) obj, p2);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(1);
                yae.d(this.c, (vt4) obj5, (vt4) obj3, (vt4) obj4, (rv4) obj, p3, this.e);
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                int p4 = xoe.p(i2 | 1);
                ese.h((g08) obj5, this.c, (vt4) obj3, (vt4) obj4, (rv4) obj, p4);
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                int p5 = xoe.p(i2 | 1);
                owe.m((List) obj5, (wza) obj3, this.c, (vza) obj4, (rv4) obj, p5);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p6 = xoe.p(i2 | 1);
                ch0.k(this.c, (amc) obj5, (nq7) obj4, (vt4) obj3, (rv4) obj, p6);
                return pvcVar;
        }
    }

    public /* synthetic */ ta(g08 g08Var, boolean z, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.a = 3;
        this.b = g08Var;
        this.c = z;
        this.f = vt4Var;
        this.d = vt4Var2;
        this.e = i;
    }

    public /* synthetic */ ta(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.f = obj2;
        this.c = z;
        this.d = obj3;
        this.e = i;
    }

    public /* synthetic */ ta(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, int i, int i2) {
        this.a = 2;
        this.c = z;
        this.b = vt4Var;
        this.f = vt4Var2;
        this.d = vt4Var3;
        this.e = i2;
    }

    public /* synthetic */ ta(boolean z, amc amcVar, nq7 nq7Var, vt4 vt4Var, int i) {
        this.a = 5;
        this.c = z;
        this.b = amcVar;
        this.d = nq7Var;
        this.f = vt4Var;
        this.e = i;
    }
}
