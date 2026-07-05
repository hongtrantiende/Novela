package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm8  reason: default package */
/* loaded from: classes.dex */
public final class sm8 {
    public final String a;
    public final gfd b;
    public final Integer c;

    public sm8(String str, gfd gfdVar, Integer num) {
        this.a = str;
        this.b = gfdVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm8)) {
            return false;
        }
        sm8 sm8Var = (sm8) obj;
        if (c16.i(this.a, sm8Var.a) && this.b == sm8Var.b && c16.i(this.c, sm8Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ParseWarning(message=" + this.a + ", code=" + this.b + ", page=" + this.c + ")";
    }
}
