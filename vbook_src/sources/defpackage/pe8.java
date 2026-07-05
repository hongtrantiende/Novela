package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe8  reason: default package */
/* loaded from: classes.dex */
public abstract class pe8 {
    public final int a;
    public final int b;

    public /* synthetic */ pe8(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var);

    public lv4 b(vh1 vh1Var) {
        return null;
    }

    public final String toString() {
        String g = cm9.a(getClass()).g();
        if (g == null) {
            return "";
        }
        return g;
    }

    public pe8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
