package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hb9  reason: default package */
/* loaded from: classes3.dex */
public final class hb9 implements nb9 {
    public final String a;
    public final String b;

    public hb9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hb9) {
                hb9 hb9Var = (hb9) obj;
                if (!this.a.equals(hb9Var.a) || !this.b.equals(hb9Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("ExportReady(tempPath=", this.a, ", baseName=", this.b, ")");
    }
}
