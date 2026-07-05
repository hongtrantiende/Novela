package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d0b  reason: default package */
/* loaded from: classes3.dex */
public final class d0b {
    public final long a;
    public final long b;
    public final int c;
    public final List d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d0b(long r11, long r13, int r15) {
        /*
            r10 = this;
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L8
            r4 = r1
            goto L9
        L8:
            r4 = r11
        L9:
            r11 = r15 & 2
            if (r11 == 0) goto Lf
            r6 = r1
            goto L10
        Lf:
            r6 = r13
        L10:
            r8 = 1
            ks3 r9 = defpackage.ks3.a
            r3 = r10
            r3.<init>(r4, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0b.<init>(long, long, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0b)) {
            return false;
        }
        d0b d0bVar = (d0b) obj;
        if (this.a == d0bVar.a && this.b == d0bVar.b && this.c == d0bVar.c && c16.i(this.d, d0bVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl5.a(this.c, hl5.c(Long.hashCode(this.a) * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder o = rs8.o(this.a, "StatisticSummary(readTime=", ", listenTime=");
        o.append(this.b);
        o.append(", averageDivisor=");
        o.append(this.c);
        o.append(", sessions=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }

    public d0b(long j, long j2, int i, List list) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = list;
    }
}
