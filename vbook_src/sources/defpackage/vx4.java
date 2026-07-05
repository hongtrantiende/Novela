package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vx4  reason: default package */
/* loaded from: classes3.dex */
public final class vx4 {
    public final String a;
    public final String b;

    public vx4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx4)) {
            return false;
        }
        vx4 vx4Var = (vx4) obj;
        if (c16.i(this.a, vx4Var.a) && c16.i(this.b, vx4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("GetInstalledReadExtensionRegex(id=", this.a, ", regex=", this.b, ")");
    }
}
