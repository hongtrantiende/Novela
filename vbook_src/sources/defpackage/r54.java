package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r54  reason: default package */
/* loaded from: classes3.dex */
public final class r54 {
    public final String a;
    public final String b;

    public r54(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r54)) {
            return false;
        }
        r54 r54Var = (r54) obj;
        if (c16.i(this.a, r54Var.a) && c16.i(this.b, r54Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("ExtensionLocalStorageItem(key=", this.a, ", value=", this.b, ")");
    }
}
