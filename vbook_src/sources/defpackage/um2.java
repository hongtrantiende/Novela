package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: um2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class um2 implements xt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ um2(long j, String str, gk2 gk2Var, int i) {
        this.c = j;
        this.d = str;
        this.e = gk2Var;
        this.b = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        int i2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                nm nmVar = (nm) obj;
                nmVar.getClass();
                nmVar.j(0, Long.valueOf(this.c));
                nmVar.g(1, (String) obj3);
                ((lh9) ((gk2) obj2).c).getClass();
                nmVar.j(2, Long.valueOf(i2));
                return pvcVar;
            default:
                cyb cybVar = (cyb) obj2;
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                List list = ((jwb) obj3).d;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    kwb kwbVar = (kwb) list.get(i3);
                    mn mnVar = kwbVar.h;
                    int i4 = kwbVar.e;
                    int i5 = kwbVar.d;
                    if (mnVar != null) {
                        if (i2 == cybVar.c().a) {
                            i5 = Math.max(cybVar.c().b, i5);
                        }
                        int min = i2 == cybVar.b().a ? Math.min(cybVar.b().b, i4 - 1) : i4 - 1;
                        if (i5 <= min) {
                            int i6 = kwbVar.b;
                            bce.m(ak3Var, i5 - i6, min - i6, kwbVar.a, nae.e, this.c, kwbVar.h);
                        }
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ um2(jwb jwbVar, int i, cyb cybVar, long j) {
        this.d = jwbVar;
        this.b = i;
        this.e = cybVar;
        this.c = j;
    }
}
