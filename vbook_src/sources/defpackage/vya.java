package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vya  reason: default package */
/* loaded from: classes3.dex */
public final class vya implements vha {
    public final long a;
    public final long b;

    public vya(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            p1a.k(nk2.t(j2, "replayExpiration(", " ms) cannot be negative"));
            throw null;
        }
        p1a.k(nk2.t(j, "stopTimeout(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.vha
    public final sj4 b(s7b s7bVar) {
        return z1d.A(new ok4(z1d.N(s7bVar, new uya(this, null)), new bo0(2, 11, null), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vya) {
            vya vyaVar = (vya) obj;
            if (this.a == vyaVar.a && this.b == vyaVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        jq6 jq6Var = new jq6(2);
        long j = this.a;
        if (j > 0) {
            jq6Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            jq6Var.add("replayExpiration=" + j2 + "ms");
        }
        return s21.p(new StringBuilder("SharingStarted.WhileSubscribed("), sl1.i0(tl1.r(jq6Var), null, null, null, null, 63), ')');
    }
}
