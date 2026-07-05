package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kid  reason: default package */
/* loaded from: classes.dex */
public final class kid extends fb6 implements lu4 {
    public static final kid b = new kid(2, 0);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kid(int i, int i2) {
        super(i);
        this.a = i2;
        switch (i2) {
            case 1:
                super(2);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wy4 wy4Var = (wy4) obj2;
                if (wy4Var instanceof u55) {
                    return wy4Var;
                }
                return obj;
            default:
                ((Number) obj2).intValue();
                qwe.i(1, (rv4) obj);
                return pvc.a;
        }
    }
}
