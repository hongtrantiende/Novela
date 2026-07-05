package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rhd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rhd implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rhd(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vve.a((lhd) obj4, (nq7) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            default:
                ((Integer) obj2).intValue();
                ((tkc) obj4).a(obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
        }
    }
}
