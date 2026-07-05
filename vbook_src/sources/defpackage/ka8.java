package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ka8  reason: default package */
/* loaded from: classes3.dex */
public final class ka8 {
    public static final ja8 Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ka8(int i, long j, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka8)) {
            return false;
        }
        ka8 ka8Var = (ka8) obj;
        if (this.a == ka8Var.a && c16.i(this.b, ka8Var.b) && c16.i(this.c, ka8Var.c) && c16.i(this.d, ka8Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncExtensionSource(id=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        nk2.C(sb, ", description=", this.c, ", author=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
