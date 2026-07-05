package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q06  reason: default package */
/* loaded from: classes.dex */
public final class q06 {
    public final int a;
    public final int b;
    public final ih6 c;

    public q06(int i, int i2, ih6 ih6Var) {
        this.a = i;
        this.b = i2;
        this.c = ih6Var;
        if (i < 0) {
            ov5.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        ov5.a("size should be > 0");
    }
}
