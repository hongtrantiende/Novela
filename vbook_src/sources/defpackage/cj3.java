package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cj3  reason: default package */
/* loaded from: classes3.dex */
public final class cj3 {
    public final Set a;
    public final Integer b;
    public final float c;
    public final int d;
    public final List e;
    public final List f;
    public final Set g;
    public final List h;
    public final Set i;
    public final List j;
    public final String k;
    public final int l;
    public final Boolean m;
    public final Map n;
    public final Map o;
    public final Map p;
    public final int q;

    public cj3(Set set, Integer num, float f, int i, List list, List list2, Set set2, List list3, Set set3, List list4, String str, int i2, Boolean bool, Map map, Map map2, Map map3, int i3) {
        this.a = set;
        this.b = num;
        this.c = f;
        this.d = i;
        this.e = list;
        this.f = list2;
        this.g = set2;
        this.h = list3;
        this.i = set3;
        this.j = list4;
        this.k = str;
        this.l = i2;
        this.m = bool;
        this.n = map;
        this.o = map2;
        this.p = map3;
        this.q = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto Ld1
        L5:
            boolean r1 = r5 instanceof defpackage.cj3
            r2 = 0
            if (r1 != 0) goto Lc
            goto Ld0
        Lc:
            cj3 r5 = (defpackage.cj3) r5
            java.util.Set r1 = r4.a
            java.util.Set r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1a
            goto Ld0
        L1a:
            java.lang.Integer r1 = r4.b
            java.lang.Integer r3 = r5.b
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L26
            goto Ld0
        L26:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L32
            goto Ld0
        L32:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L3a
            goto Ld0
        L3a:
            java.util.List r1 = r4.e
            java.util.List r3 = r5.e
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L46
            goto Ld0
        L46:
            java.util.List r1 = r4.f
            java.util.List r3 = r5.f
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto Ld0
        L52:
            java.util.Set r1 = r4.g
            java.util.Set r3 = r5.g
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5e
            goto Ld0
        L5e:
            java.util.List r1 = r4.h
            java.util.List r3 = r5.h
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6a
            goto Ld0
        L6a:
            java.util.Set r1 = r4.i
            java.util.Set r3 = r5.i
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L76
            goto Ld0
        L76:
            java.util.List r1 = r4.j
            java.util.List r3 = r5.j
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L81
            goto Ld0
        L81:
            java.lang.String r1 = r5.k
            java.lang.String r3 = r4.k
            if (r3 != 0) goto L8d
            if (r1 != 0) goto L8b
            r1 = r0
            goto L94
        L8b:
            r1 = r2
            goto L94
        L8d:
            if (r1 != 0) goto L90
            goto L8b
        L90:
            boolean r1 = r3.equals(r1)
        L94:
            if (r1 != 0) goto L97
            goto Ld0
        L97:
            int r1 = r4.l
            int r3 = r5.l
            if (r1 == r3) goto L9e
            goto Ld0
        L9e:
            java.lang.Boolean r1 = r4.m
            java.lang.Boolean r3 = r5.m
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto La9
            goto Ld0
        La9:
            java.util.Map r1 = r4.n
            java.util.Map r3 = r5.n
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb4
            goto Ld0
        Lb4:
            java.util.Map r1 = r4.o
            java.util.Map r3 = r5.o
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lbf
            goto Ld0
        Lbf:
            java.util.Map r1 = r4.p
            java.util.Map r3 = r5.p
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lca
            goto Ld0
        Lca:
            int r4 = r4.q
            int r5 = r5.q
            if (r4 == r5) goto Ld1
        Ld0:
            return r2
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int l = eub.l(s21.b(this.i, eub.l(s21.b(this.g, eub.l(eub.l(hl5.a(this.d, nk2.d(this.c, (hashCode3 + hashCode) * 31, 31), 31), this.e, 31), this.f, 31), 31), this.h, 31), 31), this.j, 31);
        String str = this.k;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int a = hl5.a(this.l, (l + hashCode2) * 31, 31);
        Boolean bool = this.m;
        if (bool != null) {
            i = bool.hashCode();
        }
        return Integer.hashCode(this.q) + rs8.a(rs8.a(rs8.a((a + i) * 31, 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        String a;
        String str = this.k;
        if (str == null) {
            a = "null";
        } else {
            a = pm0.a(str);
        }
        StringBuilder sb = new StringBuilder("DragState(draggingBlockIds=");
        sb.append(this.a);
        sb.append(", targetIndex=");
        sb.append(this.b);
        sb.append(", initialTouchOffsetY=");
        sb.append(this.c);
        sb.append(", primaryBlockOriginalIndex=");
        sb.append(this.d);
        sb.append(", dragRootIds=");
        sb.append(this.e);
        sb.append(", payloadBlockIds=");
        sb.append(this.f);
        sb.append(", payloadBlockIdSet=");
        sb.append(this.g);
        sb.append(", payloadBlockIndices=");
        sb.append(this.h);
        sb.append(", payloadBlockIndexSet=");
        sb.append(this.i);
        sb.append(", payloadIndexRanges=");
        sb.append(this.j);
        sb.append(", primaryRootId=");
        a82.u(this.l, a, ", primaryRootOriginalIndex=", ", primaryRootSupportsIndentation=", sb);
        sb.append(this.m);
        sb.append(", originalRootIndentationLevels=");
        sb.append(this.n);
        sb.append(", payloadRelativeDepthOffsets=");
        sb.append(this.o);
        sb.append(", payloadRootIdsByBlockId=");
        sb.append(this.p);
        sb.append(", futureRootIndentationLevel=");
        return rs8.g(this.q, ")", sb);
    }
}
