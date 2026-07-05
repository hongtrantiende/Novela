package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns1 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ns1(int i, int i2, int i3, nq7 nq7Var, String str) {
        this.a = 1;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fce.a((String) obj4, i3, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj;
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                int i4 = this.c;
                int i5 = this.d;
                uaf.b(i4, i5, p, rv4Var, (nq7) obj3, (String) obj4);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                bce.h(i3, (mwb) obj4, (nq7) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                dpe.f((yja) obj4, (nq7) obj3, (rv4) obj, xoe.p(i3 | 1), i2);
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                dpe.g((nq7) obj4, (wea) obj3, (rv4) obj, xoe.p(i3 | 1), i2);
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                dye.b((nq7) obj4, (tu1) obj3, (rv4) obj, xoe.p(i3 | 1), i2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                ie2.g((s8c) obj4, (nq7) obj3, i3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
        }
    }

    public /* synthetic */ ns1(int i, int i2, int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.e = obj2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ns1(int i, mwb mwbVar, nq7 nq7Var, int i2) {
        this.a = 2;
        this.c = i;
        this.b = mwbVar;
        this.e = nq7Var;
        this.d = i2;
    }

    public /* synthetic */ ns1(String str, int i, vt4 vt4Var, int i2) {
        this.a = 0;
        this.b = str;
        this.c = i;
        this.e = vt4Var;
        this.d = i2;
    }
}
