package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u1a  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1a extends h7 implements xt4 {
    public final /* synthetic */ int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.D = i3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.D;
        pvc pvcVar = pvc.a;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                ((gw7) obj2).b((v1a) obj);
                return pvcVar;
            case 1:
                Object c = ((qv8) obj2).c((m42) obj);
                if (c == n82.a) {
                    return c;
                }
                return pvcVar;
            default:
                ((trb) obj2).N1(((xr5) obj).a);
                return pvcVar;
        }
    }
}
