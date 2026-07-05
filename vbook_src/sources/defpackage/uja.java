package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uja  reason: default package */
/* loaded from: classes3.dex */
public final class uja {
    public final boolean a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [ks3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ uja(java.util.ArrayList r14, int r15, int r16, boolean r17, boolean r18, boolean r19, boolean r20, int r21) {
        /*
            r13 = this;
            r0 = r21
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto La
            r1 = 1
            r4 = r1
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            ks3 r14 = defpackage.ks3.a
        L11:
            r5 = r14
            r14 = r0 & 4
            if (r14 == 0) goto L18
            r6 = r2
            goto L19
        L18:
            r6 = r15
        L19:
            r14 = r0 & 8
            if (r14 == 0) goto L1f
            r7 = r2
            goto L21
        L1f:
            r7 = r16
        L21:
            r14 = r0 & 16
            if (r14 == 0) goto L27
            r8 = r2
            goto L29
        L27:
            r8 = r17
        L29:
            r14 = r0 & 32
            if (r14 == 0) goto L2f
            r9 = r2
            goto L31
        L2f:
            r9 = r18
        L31:
            r14 = r0 & 64
            if (r14 == 0) goto L37
            r10 = r2
            goto L39
        L37:
            r10 = r19
        L39:
            r14 = r0 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L3f
            r11 = r2
            goto L41
        L3f:
            r11 = r20
        L41:
            r12 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uja.<init>(java.util.ArrayList, int, int, boolean, boolean, boolean, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    public static uja a(uja ujaVar, ArrayList arrayList, boolean z, boolean z2, int i) {
        boolean z3 = ujaVar.a;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = ujaVar.b;
        }
        ArrayList arrayList3 = arrayList2;
        int i2 = ujaVar.c;
        int i3 = ujaVar.d;
        boolean z4 = ujaVar.e;
        boolean z5 = ujaVar.f;
        boolean z6 = ujaVar.g;
        if ((i & Token.CASE) != 0) {
            z = ujaVar.h;
        }
        ujaVar.getClass();
        arrayList3.getClass();
        return new uja(z3, arrayList3, i2, i3, z4, z5, z6, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uja) {
                uja ujaVar = (uja) obj;
                if (this.a != ujaVar.a || !c16.i(this.b, ujaVar.b) || this.c != ujaVar.c || this.d != ujaVar.d || this.e != ujaVar.e || this.f != ujaVar.f || this.g != ujaVar.g || this.h != ujaVar.h || this.i != ujaVar.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + eub.k(eub.k(eub.k(eub.k(hl5.a(this.d, hl5.a(this.c, eub.l(Boolean.hashCode(this.a) * 31, this.b, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelfState(isLoading=");
        sb.append(this.a);
        sb.append(", books=");
        sb.append(this.b);
        sb.append(", viewType=");
        rs8.q(this.c, this.d, ", shelfSize=", ", isShowReadPercent=", sb);
        rs8.z(sb, this.e, ", isShowTotalChapter=", this.f, ", isShowNewChapter=");
        rs8.z(sb, this.g, ", hasMore=", this.h, ", isLoadingMore=");
        return rs8.m(")", sb, this.i);
    }

    public uja(boolean z, List list, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        list.getClass();
        this.a = z;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }
}
