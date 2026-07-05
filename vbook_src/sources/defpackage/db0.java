package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db0  reason: default package */
/* loaded from: classes.dex */
public final class db0 extends v92 {
    public final List a;
    public final String b;

    public db0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v92) {
                db0 db0Var = (db0) ((v92) obj);
                if (this.a.equals(db0Var.a)) {
                    String str = db0Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            return true;
                        }
                        return false;
                    } else if (str2.equals(str)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return s21.q(sb, this.b, "}");
    }
}
