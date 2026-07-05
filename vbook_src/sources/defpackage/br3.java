package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br3  reason: default package */
/* loaded from: classes.dex */
public final class br3 implements ar3 {
    public final int a;
    public int b = -1;
    public int c = -1;

    public br3(int i) {
        this.a = i;
    }

    @Override // defpackage.ar3
    public final boolean i(CharSequence charSequence, int i, int i2, xsc xscVar) {
        int i3 = this.a;
        if (i <= i3 && i3 < i2) {
            this.b = i;
            this.c = i2;
            return false;
        } else if (i2 > i3) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.ar3
    public final Object e() {
        return this;
    }
}
