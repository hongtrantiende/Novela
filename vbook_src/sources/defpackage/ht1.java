package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ht1  reason: default package */
/* loaded from: classes3.dex */
public final class ht1 {
    public final String a;
    public final String b;
    public final String c;
    public final it1 d;

    public ht1(String str, String str2, String str3, it1 it1Var) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = it1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ht1) {
                ht1 ht1Var = (ht1) obj;
                if (!c16.i(this.a, ht1Var.a) || !c16.i(this.b, ht1Var.b) || !c16.i(this.c, ht1Var.c) || this.d != ht1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + eub.j((hashCode2 + hashCode) * 961, 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("CompletionItem(label=", this.a, ", detail=", this.b, ", documentation=null, insertText=");
        y.append(this.c);
        y.append(", kind=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
