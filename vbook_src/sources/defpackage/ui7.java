package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ui7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ui7(String str, String str2, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.c;
        String str2 = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                yae.b(str2, str, rv4Var, xoe.p(1));
                return pvcVar;
            default:
                owe.f(str2, str, rv4Var, xoe.p(1));
                return pvcVar;
        }
    }
}
