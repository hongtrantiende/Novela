package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ar4  reason: default package */
/* loaded from: classes3.dex */
public final class ar4 {
    public final Map a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public ar4(Map map, boolean z, String str, boolean z2) {
        this.a = map;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final a6b a(tva tvaVar) {
        a6b a6bVar = (a6b) this.a.get(tvaVar);
        if (a6bVar == null) {
            return a6b.c;
        }
        return a6bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L3b
        L4:
            boolean r1 = r5 instanceof defpackage.ar4
            r2 = 0
            if (r1 != 0) goto La
            goto L3a
        La:
            ar4 r5 = (defpackage.ar4) r5
            java.util.Map r1 = r4.a
            java.util.Map r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L3a
        L17:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L1e
            goto L3a
        L1e:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L2a
            if (r1 != 0) goto L28
            r1 = r0
            goto L31
        L28:
            r1 = r2
            goto L31
        L2a:
            if (r1 != 0) goto L2d
            goto L28
        L2d:
            boolean r1 = r3.equals(r1)
        L31:
            if (r1 != 0) goto L34
            goto L3a
        L34:
            boolean r4 = r4.d
            boolean r5 = r5.d
            if (r4 == r5) goto L3b
        L3a:
            return r2
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.d) + ((k + hashCode) * 31);
    }

    public final String toString() {
        String a;
        String str = this.c;
        if (str == null) {
            a = "null";
        } else {
            a = pm0.a(str);
        }
        return "FormattingState(styles=" + this.a + ", canFormat=" + this.b + ", focusedBlockId=" + a + ", selectionCollapsed=" + this.d + ")";
    }
}
