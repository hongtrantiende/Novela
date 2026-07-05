package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k71  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k71 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ k71(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        List list = this.b;
        switch (i) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 1:
                Object obj2 = list.get(2);
                obj2.getClass();
                return (Integer) obj2;
            case 2:
                Object obj3 = list.get(2);
                obj3.getClass();
                return (Integer) obj3;
            case 3:
                return sl1.i0(this.b, " ", null, null, new bq2(26), 30);
            case 4:
                return sl1.i0(this.b, " ", null, null, new bq2(28), 30);
            case 5:
                return list;
            case 6:
                return Integer.valueOf(list.size());
            case 7:
                if (list != null && (!(list instanceof j76) || (list instanceof l76))) {
                    xl1.S(list);
                }
                return pvcVar;
            case 8:
                z87.C(gs3.a, new z38(list, null, 16));
                return pvcVar;
            case 9:
                return ((t76) list.get(0)).e();
            case 10:
                return ((t76) list.get(0)).e();
            case 11:
                return Integer.valueOf(list.size());
            case 12:
                return sl1.i0(sl1.v0(list, 5), " ", null, null, new eja(27), 30);
            case 13:
                return list;
            default:
                return Integer.valueOf(list.size());
        }
    }
}
