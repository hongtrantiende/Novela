package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ii0  reason: default package */
/* loaded from: classes.dex */
public final class ii0 {
    public final List a;
    public final long b;
    public final float c;
    public final int d;

    public ii0(List list, long j, float f, int i) {
        this.a = list;
        this.b = j;
        this.c = f;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ii0) {
                ii0 ii0Var = (ii0) obj;
                if (!this.a.equals(ii0Var.a) || !zy5.b(this.b, ii0Var.b) || Float.compare(this.c, ii0Var.c) != 0 || this.d != ii0Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + nk2.d(this.c, hl5.c(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        String c = zy5.c(this.b);
        return "BaseTileParams(tileRects=" + this.a + ", pageSize=" + c + ", renderScale=" + this.c + ", generation=" + this.d + ")";
    }
}
