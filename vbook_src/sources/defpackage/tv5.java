package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tv5  reason: default package */
/* loaded from: classes.dex */
public final class tv5 {
    public final Boolean a;
    public final Boolean b;
    public final Double c;
    public final String d;

    public tv5(Boolean bool, Boolean bool2, Double d, String str) {
        this.a = bool;
        this.b = bool2;
        this.c = d;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv5)) {
            return false;
        }
        tv5 tv5Var = (tv5) obj;
        if (c16.i(this.a, tv5Var.a) && c16.i(this.b, tv5Var.b) && c16.i(this.c, tv5Var.c) && c16.i(this.d, tv5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d = this.c;
        if (d == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "InlineStyle(bold=" + this.a + ", italic=" + this.b + ", fontSize=" + this.c + ", fontName=" + this.d + ")";
    }

    public /* synthetic */ tv5(Boolean bool, Boolean bool2, Double d, int i) {
        this(bool, bool2, (i & 4) != 0 ? null : d, (String) null);
    }
}
