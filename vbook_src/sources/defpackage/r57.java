package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r57  reason: default package */
/* loaded from: classes3.dex */
public final class r57 {
    public final String a;
    public final long b;

    public r57(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r57)) {
            return false;
        }
        r57 r57Var = (r57) obj;
        if (c16.i(this.a, r57Var.a) && this.b == r57Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Long.hashCode(this.b) + (i * 31);
    }
}
