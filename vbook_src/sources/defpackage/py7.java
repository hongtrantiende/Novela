package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py7  reason: default package */
/* loaded from: classes3.dex */
public final class py7 {
    public final String a;
    public final String b;
    public final boolean c;

    public py7(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py7)) {
            return false;
        }
        py7 py7Var = (py7) obj;
        if (c16.i(this.a, py7Var.a) && c16.i(this.b, py7Var.b) && this.c == py7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("Voice(id=", this.a, ", name=", this.b, ", isRequireNetwork="), this.c);
    }
}
