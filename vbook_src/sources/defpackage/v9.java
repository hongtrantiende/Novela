package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v9  reason: default package */
/* loaded from: classes3.dex */
public final class v9 implements y9 {
    public final String a;
    public final String b;

    public v9(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v9) {
                v9 v9Var = (v9) obj;
                if (!c16.i(this.a, v9Var.a) || !this.b.equals(v9Var.b)) {
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
        return hl5.o("ModelDeleted(modelId=", this.a, ", name=", this.b, ")");
    }
}
