package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: eb9  reason: default package */
/* loaded from: classes3.dex */
public final class eb9 {
    public static final db9 Companion = new Object();
    public final String a;
    public final int b;

    public /* synthetic */ eb9(int i, String str, int i2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = i2;
            return;
        }
        w92.x(i, 3, cb9.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb9)) {
            return false;
        }
        eb9 eb9Var = (eb9) obj;
        if (c16.i(this.a, eb9Var.a) && this.b == eb9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("QtDicDto(path=", this.b, this.a, ", size=", ")");
    }

    public eb9(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }
}
