package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf8  reason: default package */
/* loaded from: classes.dex */
public final class wf8 {
    public final int a;
    public final String b;
    public final Integer c;

    public wf8(int i, Integer num, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf8)) {
            return false;
        }
        wf8 wf8Var = (wf8) obj;
        if (this.a == wf8Var.a && c16.i(this.b, wf8Var.b) && c16.i(this.c, wf8Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        StringBuilder r = s21.r("OutlineItem(level=", this.a, ", text=", this.b, ", pageNumber=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
