package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b84  reason: default package */
/* loaded from: classes3.dex */
public final class b84 {
    public final String a;
    public final String b;

    public b84(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b84) {
                b84 b84Var = (b84) obj;
                if (!c16.i(this.a, b84Var.a) || !this.b.equals(b84Var.b)) {
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
        return hl5.o("ExtensionScriptCode(name=", this.a, ", code=", this.b, ")");
    }
}
