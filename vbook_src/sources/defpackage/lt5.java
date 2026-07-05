package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lt5  reason: default package */
/* loaded from: classes3.dex */
public final class lt5 implements b72 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public lt5(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.b72
    public final Object c() {
        return new lt5(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lt5) {
            lt5 lt5Var = (lt5) obj;
            if (c16.i(this.a, lt5Var.a) && c16.i(this.b, lt5Var.b) && c16.i(this.c, lt5Var.c) && c16.i(this.d, lt5Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Boolean bool = this.a;
        int i4 = 0;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        Integer num = this.b;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        Integer num2 = this.c;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = i5 + i3;
        Integer num3 = this.d;
        if (num3 != null) {
            i4 = num3.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.a;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "-";
            } else {
                str = "+";
            }
        } else {
            str = " ";
        }
        sb.append(str);
        Integer num = this.b;
        Object obj = "??";
        if (num == null) {
            num = "??";
        }
        sb.append(num);
        sb.append(':');
        Integer num2 = this.c;
        if (num2 == null) {
            num2 = "??";
        }
        sb.append(num2);
        sb.append(':');
        Integer num3 = this.d;
        if (num3 != null) {
            obj = num3;
        }
        sb.append(obj);
        return sb.toString();
    }
}
