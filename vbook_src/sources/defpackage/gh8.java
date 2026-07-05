package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gh8  reason: default package */
/* loaded from: classes.dex */
public final class gh8 {
    public final String a;
    public final eh8 b;

    public gh8(String str, eh8 eh8Var) {
        str.getClass();
        this.a = str;
        this.b = eh8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gh8) {
                gh8 gh8Var = (gh8) obj;
                if (!c16.i(this.a, gh8Var.a) || !this.b.equals(gh8Var.b)) {
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
        return "PDFTextLine(text=" + this.a + ", rect=" + this.b + ")";
    }
}
