package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: b70  reason: default package */
/* loaded from: classes3.dex */
public final class b70 {
    public static final a70 Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ b70(String str, String str2, int i) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        w92.x(i, 3, z60.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        if (c16.i(this.a, b70Var.a) && c16.i(this.b, b70Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return hl5.o("AuthCodeResult(code=", this.a, ", state=", this.b, ")");
    }

    public b70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
