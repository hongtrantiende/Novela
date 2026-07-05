package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wb6  reason: default package */
/* loaded from: classes3.dex */
public final class wb6 {
    public final kb6 a;
    public final kb6 b;
    public final List c;

    public wb6(kb6 kb6Var, kb6 kb6Var2, List list) {
        list.getClass();
        this.a = kb6Var;
        this.b = kb6Var2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb6)) {
            return false;
        }
        wb6 wb6Var = (wb6) obj;
        if (c16.i(this.a, wb6Var.a) && c16.i(this.b, wb6Var.b) && c16.i(this.c, wb6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        kb6 kb6Var = this.a;
        if (kb6Var == null) {
            hashCode = 0;
        } else {
            hashCode = kb6Var.hashCode();
        }
        int i2 = hashCode * 31;
        kb6 kb6Var2 = this.b;
        if (kb6Var2 != null) {
            i = kb6Var2.hashCode();
        }
        return this.c.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageState(currentLanguage=");
        sb.append(this.a);
        sb.append(", systemLanguage=");
        sb.append(this.b);
        sb.append(", languages=");
        return rs8.n(sb, this.c, ")");
    }
}
