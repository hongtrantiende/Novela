package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kg3  reason: default package */
/* loaded from: classes3.dex */
public final class kg3 {
    public final long a;
    public final List b;

    public kg3(long j, List list) {
        list.getClass();
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg3)) {
            return false;
        }
        kg3 kg3Var = (kg3) obj;
        if (this.a == kg3Var.a && c16.i(this.b, kg3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DownloadSection(time=" + this.a + ", downloadList=" + this.b + ")";
    }
}
