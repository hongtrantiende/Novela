package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rg6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rg6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ rg6(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new qg6(i2, 0);
            case 1:
                return jye.u(Integer.valueOf(i2));
            case 2:
                return Float.valueOf(i2 / 100.0f);
            default:
                return jye.u(Integer.valueOf(i2));
        }
    }
}
