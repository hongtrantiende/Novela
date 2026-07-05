package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: or8  reason: default package */
/* loaded from: classes3.dex */
public final class or8 {
    public final String a;
    public final pr8 b;

    public or8(String str, pr8 pr8Var) {
        str.getClass();
        this.a = str;
        this.b = pr8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof or8) {
                or8 or8Var = (or8) obj;
                if (!c16.i(this.a, or8Var.a) || !this.b.equals(or8Var.b)) {
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
        return "PdfTextLine(text=" + this.a + ", rect=" + this.b + ")";
    }
}
