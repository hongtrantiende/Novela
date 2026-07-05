package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw8  reason: default package */
/* loaded from: classes.dex */
public final class pw8 {
    public final long a;
    public final long b;
    public final int c;

    public pw8(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
        f4c[] f4cVarArr = e4c.b;
        if ((j & 1095216660480L) == 0) {
            mv5.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            mv5.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pw8) {
                pw8 pw8Var = (pw8) obj;
                if (e4c.a(this.a, pw8Var.a) && e4c.a(this.b, pw8Var.b) && this.c == pw8Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        f4c[] f4cVarArr = e4c.b;
        return Integer.hashCode(this.c) + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String str;
        String e = e4c.e(this.a);
        String e2 = e4c.e(this.b);
        int i = this.c;
        if (i == 1) {
            str = "AboveBaseline";
        } else if (i == 2) {
            str = "Top";
        } else if (i == 3) {
            str = "Bottom";
        } else if (i == 4) {
            str = "Center";
        } else if (i == 5) {
            str = "TextTop";
        } else if (i == 6) {
            str = "TextBottom";
        } else if (i == 7) {
            str = "TextCenter";
        } else {
            str = "Invalid";
        }
        return s21.q(nk2.y("Placeholder(width=", e, ", height=", e2, ", placeholderVerticalAlign="), str, ")");
    }
}
