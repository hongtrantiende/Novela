package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d62  reason: default package */
/* loaded from: classes.dex */
public final class d62 implements lu4 {
    public final /* synthetic */ e00 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public d62(e00 e00Var, boolean z, long j, long j2) {
        this.a = e00Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        long j;
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            e00 e00Var = this.a;
            String str = e00Var.a + ":" + e00Var.b;
            if (this.b) {
                j = this.c;
            } else {
                j = this.d;
            }
            cvb.b(str, null, j, 0L, 0L, 0L, 0, false, 0, 0, null, rv4Var, 0);
        }
        return pvc.a;
    }
}
