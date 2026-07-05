package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qb0  reason: default package */
/* loaded from: classes.dex */
public final class qb0 extends aa2 {
    public final String a;
    public final String b;
    public final List c;
    public final aa2 d;
    public final int e;

    public qb0(String str, String str2, List list, aa2 aa2Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = aa2Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aa2) {
            qb0 qb0Var = (qb0) ((aa2) obj);
            if (this.a.equals(qb0Var.a)) {
                String str = qb0Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(qb0Var.c)) {
                        aa2 aa2Var = qb0Var.d;
                        aa2 aa2Var2 = this.d;
                        if (aa2Var2 != null ? aa2Var2.equals(aa2Var) : aa2Var == null) {
                            if (this.e == qb0Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        aa2 aa2Var = this.d;
        if (aa2Var != null) {
            i = aa2Var.hashCode();
        }
        return this.e ^ ((hashCode3 ^ i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return rs8.g(this.e, "}", sb);
    }
}
