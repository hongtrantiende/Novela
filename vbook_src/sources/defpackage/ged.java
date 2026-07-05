package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ged  reason: default package */
/* loaded from: classes.dex */
public final class ged {
    public static final fed Companion = new Object();
    public static final ye6[] c = {null, ipe.x(sk6.b, new u6d(8))};
    public final gd a;
    public final ff8 b;

    public /* synthetic */ ged(int i, gd gdVar, ff8 ff8Var) {
        if (3 == (i & 3)) {
            this.a = gdVar;
            this.b = ff8Var;
            return;
        }
        w92.x(i, 3, eed.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ged)) {
            return false;
        }
        ged gedVar = (ged) obj;
        if (c16.i(this.a, gedVar.a) && this.b == gedVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        gd gdVar = this.a;
        if (gdVar == null) {
            hashCode = 0;
        } else {
            hashCode = gdVar.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "RestoreData(anchor=" + this.a + ", orientation=" + this.b + ")";
    }

    public ged(gd gdVar, ff8 ff8Var) {
        ff8Var.getClass();
        this.a = gdVar;
        this.b = ff8Var;
    }
}
