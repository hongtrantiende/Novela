package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vxb  reason: default package */
/* loaded from: classes3.dex */
public final class vxb {
    public final boolean a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final List f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ vxb(java.lang.String r9, int r10) {
        /*
            r8 = this;
            r0 = r10 & 1
            if (r0 == 0) goto L7
            r0 = 0
        L5:
            r2 = r0
            goto L9
        L7:
            r0 = 1
            goto L5
        L9:
            r10 = r10 & 4
            if (r10 == 0) goto Lf
            java.lang.String r9 = ""
        Lf:
            r4 = r9
            r6 = 0
            ks3 r7 = defpackage.ks3.a
            r3 = 0
            r5 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxb.<init>(java.lang.String, int):void");
    }

    public static vxb a(vxb vxbVar, boolean z, int i, String str, int i2, int i3, List list, int i4) {
        if ((i4 & 1) != 0) {
            z = vxbVar.a;
        }
        boolean z2 = z;
        if ((i4 & 2) != 0) {
            i = vxbVar.b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            str = vxbVar.c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            i2 = vxbVar.d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = vxbVar.e;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            list = vxbVar.f;
        }
        List list2 = list;
        vxbVar.getClass();
        str2.getClass();
        list2.getClass();
        return new vxb(z2, i5, str2, i6, i7, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxb)) {
            return false;
        }
        vxb vxbVar = (vxb) obj;
        if (this.a == vxbVar.a && this.b == vxbVar.b && c16.i(this.c, vxbVar.c) && this.d == vxbVar.d && this.e == vxbVar.e && c16.i(this.f, vxbVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + hl5.a(this.e, hl5.a(this.d, eub.j(hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSearchState(isSearching=");
        sb.append(this.a);
        sb.append(", searchPercent=");
        sb.append(this.b);
        sb.append(", searchKey=");
        a82.u(this.d, this.c, ", focusSearchIndex=", ", searchFoundCount=", sb);
        sb.append(this.e);
        sb.append(", searchResults=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public vxb(boolean z, int i, String str, int i2, int i3, List list) {
        str.getClass();
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = list;
    }
}
