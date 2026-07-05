package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb9  reason: default package */
/* loaded from: classes3.dex */
public final class fb9 {
    public final String a;
    public final int b;

    public fb9(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb9)) {
            return false;
        }
        fb9 fb9Var = (fb9) obj;
        if (c16.i(this.a, fb9Var.a) && this.b == fb9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("QtDictionary(path=", this.b, this.a, ", size=", ")");
    }
}
