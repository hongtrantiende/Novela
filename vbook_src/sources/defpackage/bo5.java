package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bo5  reason: default package */
/* loaded from: classes.dex */
public final class bo5 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo5(String str, int i) {
        super(1);
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.b;
        switch (i) {
            case 0:
                ((t7a) obj).a.put(g8a.a, tl1.A(str));
                return pvcVar;
            default:
                j8a.e((l8a) obj, str);
                return pvcVar;
        }
    }
}
