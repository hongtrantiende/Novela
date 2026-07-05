package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h22  reason: default package */
/* loaded from: classes3.dex */
public final class h22 {
    public final bv0 a;
    public final f61 b;

    public h22(bv0 bv0Var, f61 f61Var) {
        this.a = bv0Var;
        this.b = f61Var;
    }

    public final String toString() {
        String str;
        String str2;
        f61 f61Var = this.b;
        i82 i82Var = (i82) f61Var.e.get(i82.c);
        if (i82Var != null) {
            str = i82Var.b;
        } else {
            str = null;
        }
        int hashCode = hashCode();
        nqe.u(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        if (str != null) {
            str2 = hl5.n("[", str, "](");
        } else {
            str2 = "(";
        }
        Object invoke = this.a.invoke();
        return "Request@" + num + str2 + "currentBounds()=" + invoke + ", continuation=" + f61Var + ")";
    }
}
