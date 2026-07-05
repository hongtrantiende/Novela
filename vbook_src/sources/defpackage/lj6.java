package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lj6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lj6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ lj6(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                return new kj6(i3, i2);
            case 1:
                int i4 = i3 + 1;
                int min = Math.min(i3 + 50, i2);
                return yae.z(i4 + "-" + min);
            default:
                return new sj8(nae.e, i3, i2);
        }
    }
}
