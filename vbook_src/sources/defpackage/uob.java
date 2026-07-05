package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uob  reason: default package */
/* loaded from: classes.dex */
public final class uob extends mob {
    public final String b;
    public final int c;
    public final xt4 d;

    public uob(Object obj, String str, int i, xt4 xt4Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = xt4Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return rs8.g(this.c, ")", sb);
    }
}
