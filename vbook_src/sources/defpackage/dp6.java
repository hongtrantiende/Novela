package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dp6  reason: default package */
/* loaded from: classes.dex */
public final class dp6 extends fp6 {
    public final String a;
    public final lvb b;
    public final d89 c;

    public dp6(String str, lvb lvbVar, d89 d89Var) {
        this.a = str;
        this.b = lvbVar;
        this.c = d89Var;
    }

    @Override // defpackage.fp6
    public final d89 a() {
        return this.c;
    }

    @Override // defpackage.fp6
    public final lvb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp6)) {
            return false;
        }
        dp6 dp6Var = (dp6) obj;
        if (c16.i(this.a, dp6Var.a) && c16.i(this.b, dp6Var.b) && c16.i(this.c, dp6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        lvb lvbVar = this.b;
        if (lvbVar != null) {
            i = lvbVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        d89 d89Var = this.c;
        if (d89Var != null) {
            i2 = d89Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return hl5.n("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
