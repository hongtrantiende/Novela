package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t86  reason: default package */
/* loaded from: classes.dex */
public final class t86 {
    public static final t86 g = new t86(0, 0, Token.SWITCH);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final ov6 f;

    public t86(int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i4 = -1;
        } else {
            i4 = 1;
        }
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = i4;
        this.b = null;
        this.c = i;
        this.d = i2;
        this.e = null;
        this.f = null;
    }

    public final int a() {
        int i = this.d;
        xr5 xr5Var = new xr5(i);
        if (i == -1) {
            xr5Var = null;
        }
        if (xr5Var != null) {
            return xr5Var.a;
        }
        return 1;
    }

    public final as5 b(boolean z) {
        int i;
        boolean z2;
        int i2 = this.a;
        r86 r86Var = new r86(i2);
        a96 a96Var = null;
        if (i2 == -1) {
            r86Var = null;
        }
        if (r86Var != null) {
            i = r86Var.a;
        } else {
            i = 0;
        }
        int i3 = i;
        int i4 = 1;
        Boolean bool = this.b;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i5 = this.c;
        a96 a96Var2 = new a96(i5);
        if (i5 != 0) {
            a96Var = a96Var2;
        }
        if (a96Var != null) {
            i4 = a96Var.a;
        }
        int i6 = i4;
        int a = a();
        ov6 ov6Var = this.f;
        if (ov6Var == null) {
            ov6Var = ov6.c;
        }
        return new as5(z, i3, z2, i6, a, ov6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t86)) {
            return false;
        }
        t86 t86Var = (t86) obj;
        if (this.a == t86Var.a && c16.i(this.b, t86Var.b) && this.c == t86Var.c && this.d == t86Var.d && c16.i(this.e, t86Var.e) && c16.i(this.f, t86Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Integer.hashCode(this.a) * 31;
        int i3 = 0;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int a = hl5.a(this.d, hl5.a(this.c, (hashCode + i) * 31, 31), 961);
        Boolean bool2 = this.e;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (a + i2) * 31;
        ov6 ov6Var = this.f;
        if (ov6Var != null) {
            i3 = ov6Var.a.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        String a = r86.a(this.a);
        String a2 = a96.a(this.c);
        String a3 = xr5.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(a);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        nk2.C(sb, a2, ", imeAction=", a3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.e);
        sb.append(", hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
