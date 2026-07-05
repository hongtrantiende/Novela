package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o94  reason: default package */
/* loaded from: classes.dex */
public final class o94 {
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o94(java.lang.String r2, int r3) {
        /*
            r1 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L7
            java.lang.String r3 = "string"
            goto L9
        L7:
            java.lang.String r3 = "uint"
        L9:
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o94.<init>(java.lang.String, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o94) {
                o94 o94Var = (o94) obj;
                if (!c16.i(this.a, o94Var.a) || !c16.i(this.b, o94Var.b) || this.c != o94Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("ExthRecordType(name=", this.a, ", type=", this.b, ", many="), this.c);
    }

    public o94(String str, String str2, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
