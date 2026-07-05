package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s1a  reason: default package */
/* loaded from: classes.dex */
public final class s1a {
    public final vt4 a;
    public final vt4 b;
    public final boolean c;

    public s1a(vt4 vt4Var, vt4 vt4Var2, boolean z) {
        this.a = vt4Var;
        this.b = vt4Var2;
        this.c = z;
    }

    public final String toString() {
        Object invoke = this.a.invoke();
        Object invoke2 = this.b.invoke();
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(invoke);
        sb.append(", maxValue=");
        sb.append(invoke2);
        sb.append(", reverseScrolling=");
        return rs8.m(")", sb, this.c);
    }
}
