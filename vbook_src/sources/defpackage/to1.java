package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to1  reason: default package */
/* loaded from: classes3.dex */
public final class to1 {
    public final int a;
    public final int b;

    public to1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to1)) {
            return false;
        }
        to1 to1Var = (to1) obj;
        if (this.a == to1Var.a && this.b == to1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "DownloadProgress(downloaded=", ", size=", ")");
    }
}
