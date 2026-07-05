package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b8b  reason: default package */
/* loaded from: classes3.dex */
public final class b8b {
    public final long a;
    public final long b;
    public final ArrayList c;

    public b8b(long j, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b8b) {
                b8b b8bVar = (b8b) obj;
                if (this.a != b8bVar.a || this.b != b8bVar.b || !this.c.equals(b8bVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = rs8.o(this.a, "SubtitleEntry(startMillis=", ", endMillis=");
        o.append(this.b);
        o.append(", lines=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
