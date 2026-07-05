package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pb8  reason: default package */
/* loaded from: classes.dex */
public final class pb8 extends d08 {
    public final if0 a;
    public final un6 b;

    public pb8(if0 if0Var, un6 un6Var) {
        if0Var.getClass();
        this.a = if0Var;
        this.b = un6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb8)) {
            return false;
        }
        pb8 pb8Var = (pb8) obj;
        if (c16.i(this.a, pb8Var.a) && c16.i(this.b, pb8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        un6 un6Var = this.b;
        if (un6Var == null) {
            hashCode = 0;
        } else {
            hashCode = un6Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
