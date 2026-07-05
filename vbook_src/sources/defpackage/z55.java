package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z55  reason: default package */
/* loaded from: classes.dex */
public final class z55 {
    public static final z55 d;
    public final boolean a;
    public final x55 b;
    public final y55 c;

    static {
        x55 x55Var = x55.c;
        y55 y55Var = y55.f;
        d = new z55(false, x55Var, y55Var);
        new z55(true, x55Var, y55Var);
    }

    public z55(boolean z, x55 x55Var, y55 y55Var) {
        x55Var.getClass();
        y55Var.getClass();
        this.a = z;
        this.b = x55Var;
        this.c = y55Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a("        ", sb);
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.a("        ", sb);
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
