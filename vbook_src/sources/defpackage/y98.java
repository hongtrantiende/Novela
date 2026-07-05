package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: y98  reason: default package */
/* loaded from: classes3.dex */
public final class y98 {
    public static final x98 Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ y98(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y98)) {
            return false;
        }
        y98 y98Var = (y98) obj;
        if (c16.i(this.a, y98Var.a) && c16.i(this.b, y98Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("OldSyncCategory(id=", this.a, ", name=", this.b, ")");
    }
}
