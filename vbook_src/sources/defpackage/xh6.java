package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xh6  reason: default package */
/* loaded from: classes.dex */
public final class xh6 implements yya {
    public final int a;
    public final int b;
    public final hm8 c;
    public int d;

    public xh6(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new hm8(dce.F(Math.max(i4 - i3, 0), i4 + i2 + i3), zj1.G);
        this.d = i;
    }

    public final void a(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            this.c.setValue(dce.F(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return (ty5) this.c.getValue();
    }
}
