package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ya8  reason: default package */
/* loaded from: classes3.dex */
public final class ya8 {
    public static final xa8 Companion = new Object();
    public final int a;
    public final String b;

    public /* synthetic */ ya8(int i, int i2, String str) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya8)) {
            return false;
        }
        ya8 ya8Var = (ya8) obj;
        if (this.a == ya8Var.a && c16.i(this.b, ya8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OldSyncPage(id=" + this.a + ", url=" + this.b + ")";
    }
}
