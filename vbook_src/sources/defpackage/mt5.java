package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mt5  reason: default package */
/* loaded from: classes3.dex */
public final class mt5 implements jpd, b72 {
    public Integer a;
    public Integer b;

    public mt5(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.b72
    public final Object c() {
        return new mt5(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mt5) {
            mt5 mt5Var = (mt5) obj;
            if (c16.i(this.a, mt5Var.a) && c16.i(this.b, mt5Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.jpd
    public final void f(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        int i;
        Integer num = this.a;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    @Override // defpackage.jpd
    public final Integer i() {
        return this.a;
    }

    @Override // defpackage.jpd
    public final void r(Integer num) {
        this.a = num;
    }

    @Override // defpackage.jpd
    public final Integer s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Integer num = this.a;
        Object obj = "??";
        if (num == null) {
            num = "??";
        }
        sb.append(num);
        sb.append('-');
        Integer num2 = this.b;
        if (num2 != null) {
            obj = num2;
        }
        sb.append(obj);
        return sb.toString();
    }
}
