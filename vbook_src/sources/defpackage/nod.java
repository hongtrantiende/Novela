package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nod  reason: default package */
/* loaded from: classes.dex */
public final class nod extends al6 {
    public final boolean e;

    public nod(String str, boolean z) {
        str.getClass();
        this.d = str;
        this.e = z;
    }

    public static nod J() {
        return J();
    }

    @Override // defpackage.y28
    public final Object clone() {
        return J();
    }

    @Override // defpackage.y28
    public final y28 i() {
        return J();
    }

    @Override // defpackage.y28
    public final y28 j() {
        Object obj = this.d;
        obj.getClass();
        return new nod((String) obj, this.e);
    }

    @Override // defpackage.y28
    public final String toString() {
        return x();
    }

    @Override // defpackage.y28
    public final String u() {
        return "#declaration";
    }

    @Override // defpackage.y28
    public final void y(bp3 bp3Var, sc3 sc3Var) {
        String str;
        bp3Var.c("<");
        String str2 = "?";
        boolean z = this.e;
        if (!z) {
            str = "?";
        } else {
            str = "!";
        }
        bp3Var.c(str);
        bp3Var.c(H());
        i40 i40Var = new i40(e());
        while (i40Var.hasNext()) {
            g40 g40Var = (g40) i40Var.next();
            String str3 = g40Var.a;
            String value = g40Var.getValue();
            if (!c16.i(str3, "#declaration")) {
                bp3Var.b(' ');
                bp3Var.c(str3);
                if (value.length() > 0) {
                    bp3Var.c("=\"");
                    hu3.c(bp3Var, value, sc3Var, 2);
                    bp3Var.b('\"');
                }
            }
        }
        if (z) {
            str2 = "";
        }
        bp3Var.c(str2);
        bp3Var.c(">");
    }
}
