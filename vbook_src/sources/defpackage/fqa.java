package defpackage;

import java.util.Locale;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fqa  reason: default package */
/* loaded from: classes.dex */
public final class fqa {
    public final long a;
    public final long b;
    public final int c;

    public fqa(long j, long j2, int i) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fqa.class == obj.getClass()) {
            fqa fqaVar = (fqa) obj;
            if (this.a == fqaVar.a && this.b == fqaVar.b && this.c == fqaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = a2d.a;
        Locale locale = Locale.US;
        StringBuilder o = rs8.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
