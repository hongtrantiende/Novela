package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a85  reason: default package */
/* loaded from: classes.dex */
public final class a85 {
    public final vq4 a;
    public final String b;
    public final String c;

    public a85(vq4 vq4Var, String str, String str2) {
        uq4 a = vq4Var.a();
        a.a = null;
        a.k = null;
        this.a = new vq4(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a85)) {
            return false;
        }
        a85 a85Var = (a85) obj;
        if (Objects.equals(this.a, a85Var.a) && Objects.equals(this.b, a85Var.b) && Objects.equals(this.c, a85Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
