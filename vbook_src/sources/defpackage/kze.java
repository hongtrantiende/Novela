package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kze  reason: default package */
/* loaded from: classes.dex */
public final class kze {
    public final Context a;
    public final c9b b;

    public kze(Context context, c9b c9bVar) {
        this.a = context;
        this.b = c9bVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof kze) {
                kze kzeVar = (kze) obj;
                if (this.a.equals(kzeVar.a)) {
                    c9b c9bVar = kzeVar.b;
                    c9b c9bVar2 = this.b;
                    if (c9bVar2 == null) {
                        if (c9bVar == null) {
                            return true;
                        }
                        return false;
                    } else if (c9bVar2.equals(c9bVar)) {
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
        int hashCode2 = this.a.hashCode() ^ 1000003;
        c9b c9bVar = this.b;
        if (c9bVar == null) {
            hashCode = 0;
        } else {
            hashCode = c9bVar.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        nk2.C(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
