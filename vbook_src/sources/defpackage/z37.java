package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z37  reason: default package */
/* loaded from: classes.dex */
public abstract class z37 extends hh1 {
    public final long F;

    public z37(jg2 jg2Var, mg2 mg2Var, vq4 vq4Var, int i, Object obj, long j, long j2, long j3) {
        super(jg2Var, mg2Var, 1, vq4Var, i, obj, j, j2);
        vq4Var.getClass();
        this.F = j3;
    }

    public long a() {
        long j = this.F;
        if (j == -1) {
            return -1L;
        }
        return j + 1;
    }

    public abstract boolean d();
}
