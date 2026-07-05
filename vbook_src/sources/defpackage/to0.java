package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to0  reason: default package */
/* loaded from: classes3.dex */
public final class to0 {
    public final String a;
    public final String b;

    public to0(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof to0) {
                to0 to0Var = (to0) obj;
                if (!this.a.equals(to0Var.a) || !c16.i(this.b, to0Var.b)) {
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
        return hl5.o("ExportImage(fileName=", this.a, ", mediaType=", this.b, ")");
    }
}
