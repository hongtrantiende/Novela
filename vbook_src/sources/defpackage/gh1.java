package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gh1  reason: default package */
/* loaded from: classes3.dex */
public final class gh1 {
    public final String a;
    public final String b;
    public final boolean c;

    public gh1(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh1)) {
            return false;
        }
        gh1 gh1Var = (gh1) obj;
        if (c16.i(this.a, gh1Var.a) && c16.i(this.b, gh1Var.b) && this.c == gh1Var.c) {
            return true;
        }
        return false;
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
        return Boolean.hashCode(this.c) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("ChooseItem(text=", this.a, ", subText=", this.b, ", isRequireNetwork="), this.c);
    }

    public /* synthetic */ gh1(int i, String str, boolean z) {
        this(str, (String) null, (i & 4) != 0 ? false : z);
    }
}
