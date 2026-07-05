package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m3c  reason: default package */
/* loaded from: classes3.dex */
public final class m3c {
    public final ps a;
    public final ps b;
    public final List c;

    public m3c(ps psVar, ps psVar2, jq6 jq6Var) {
        psVar.getClass();
        this.a = psVar;
        this.b = psVar2;
        this.c = jq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3c)) {
            return false;
        }
        m3c m3cVar = (m3c) obj;
        if (c16.i(this.a, m3cVar.a) && c16.i(this.b, m3cVar.b) && c16.i(this.c, m3cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        ps psVar = this.b;
        if (psVar == null) {
            hashCode = 0;
        } else {
            hashCode = psVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        List list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextTranslateContent(originText=");
        sb.append((Object) this.a);
        sb.append(", translateText=");
        sb.append((Object) this.b);
        sb.append(", segments=");
        return rs8.n(sb, this.c, ")");
    }
}
