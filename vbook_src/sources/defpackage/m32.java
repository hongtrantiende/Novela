package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m32  reason: default package */
/* loaded from: classes3.dex */
public final class m32 {
    public final String a;
    public final String b;
    public final ly c;
    public final boolean d;

    public m32(String str, String str2, ly lyVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = lyVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m32)) {
            return false;
        }
        m32 m32Var = (m32) obj;
        if (!c16.i(this.a, m32Var.a) || this.d != m32Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("ContextMenu(id=", this.a, ", label=", this.b, ", application=");
        y.append(this.c);
        y.append(", enabled=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }

    public /* synthetic */ m32(String str, String str2, ly lyVar, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : lyVar, true);
    }
}
