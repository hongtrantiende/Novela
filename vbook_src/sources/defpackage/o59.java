package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o59  reason: default package */
/* loaded from: classes3.dex */
public final class o59 {
    public final String a;
    public final String b;

    public o59(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o59)) {
            return false;
        }
        o59 o59Var = (o59) obj;
        if (c16.i(this.a, o59Var.a) && c16.i(this.b, o59Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("PreviewBook(path=", this.a, ", extensionId=", this.b, ")");
    }
}
