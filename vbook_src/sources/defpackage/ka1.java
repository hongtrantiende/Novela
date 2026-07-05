package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ka1  reason: default package */
/* loaded from: classes.dex */
public final class ka1 {
    public final String a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;

    public ka1(String str, int i, int i2, Integer num, Integer num2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        if (c16.i(this.a, ka1Var.a) && this.b == ka1Var.b && this.c == ka1Var.c && c16.i(this.d, ka1Var.d) && c16.i(this.e, ka1Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31);
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder s = s21.s("CellContext(text=", this.a, ", colSpan=", this.b, ", rowSpan=");
        s.append(this.c);
        s.append(", colAddr=");
        s.append(this.d);
        s.append(", rowAddr=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }

    public /* synthetic */ ka1(String str, int i, int i2) {
        this(str, i, i2, null, null);
    }
}
