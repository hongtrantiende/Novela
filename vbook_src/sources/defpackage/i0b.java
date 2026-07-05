package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i0b  reason: default package */
/* loaded from: classes.dex */
public final class i0b {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final boolean e;

    public i0b(String str, Integer num, String str2, String str3) {
        boolean z;
        int intValue;
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        if (num != null && 200 <= (intValue = num.intValue()) && intValue < 300) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i0b) {
                i0b i0bVar = (i0b) obj;
                if (!this.a.equals(i0bVar.a) || !c16.i(this.b, i0bVar.b) || !c16.i(this.c, i0bVar.c) || !c16.i(this.d, i0bVar.d)) {
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
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder y = nk2.y("Status(statusLine=", this.a, ", httpVersion=", this.b, ", httpStatusCode=");
        y.append(this.c);
        y.append(", reasonPhrase=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
