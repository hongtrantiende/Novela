package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wm9  reason: default package */
/* loaded from: classes.dex */
public final class wm9 extends lbe {
    public final lbe d;
    public final int e;

    public wm9(lbe lbeVar, int i) {
        this.d = lbeVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wm9) {
            wm9 wm9Var = (wm9) obj;
            if (wm9Var.d.equals(this.d) && wm9Var.e == this.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.e * 31);
    }
}
