package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ioa  reason: default package */
/* loaded from: classes3.dex */
public final class ioa {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final l f;

    public ioa(String str, String str2, String str3, List list, String str4, l lVar) {
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ioa
            r2 = 0
            if (r1 != 0) goto La
            goto L4d
        La:
            ioa r5 = (defpackage.ioa) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L4d
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L22
            goto L4d
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L2d
            goto L4d
        L2d:
            java.util.List r1 = r4.d
            java.util.List r3 = r5.d
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L38
            goto L4d
        L38:
            java.lang.String r1 = r5.e
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L44
            if (r1 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r1 != 0) goto L47
            goto L42
        L47:
            boolean r1 = r3.equals(r1)
        L4b:
            if (r1 != 0) goto L4e
        L4d:
            return r2
        L4e:
            l r4 = r4.f
            l r5 = r5.f
            if (r4 == r5) goto L55
            return r2
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int l = eub.l(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = bpa.a.hashCode();
        return this.f.hashCode() + ((hashCode2 + ((l + hashCode) * 31)) * 31);
    }

    public final String toString() {
        String n;
        String a = noa.a(this.a);
        String str = this.e;
        if (str == null) {
            n = "null";
        } else {
            n = hl5.n("SlashCommandIconKey(value=", str, ")");
        }
        StringBuilder y = nk2.y("SlashCommandAction(id=", a, ", title=", this.b, ", description=");
        y.append(this.c);
        y.append(", keywords=");
        y.append(this.d);
        y.append(", icon=");
        y.append(n);
        y.append(", queryTextPolicy=");
        y.append(bpa.a);
        y.append(", onExecute=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
