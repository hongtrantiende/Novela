package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: as5  reason: default package */
/* loaded from: classes.dex */
public final class as5 {
    public static final as5 g = new as5(false, 0, true, 1, 1, ov6.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final ov6 f;

    public as5(boolean z, int i, boolean z2, int i2, int i3, ov6 ov6Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = ov6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as5)) {
            return false;
        }
        as5 as5Var = (as5) obj;
        if (this.a == as5Var.a && this.b == as5Var.b && this.c == as5Var.c && this.d == as5Var.d && this.e == as5Var.e && c16.i(this.f, as5Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.a.hashCode() + hl5.a(this.e, hl5.a(this.d, eub.k(hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String a = r86.a(this.b);
        String a2 = a96.a(this.d);
        String a3 = xr5.a(this.e);
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + a + ", autoCorrect=" + this.c + ", keyboardType=" + a2 + ", imeAction=" + a3 + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
