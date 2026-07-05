package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sf7  reason: default package */
/* loaded from: classes3.dex */
public final class sf7 implements lu4 {
    public final /* synthetic */ int a;

    public sf7(int i) {
        this.a = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            cvb.c(yqe.B((y3b) b3b.q.getValue(), new Object[]{Integer.valueOf(this.a + 1)}, rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 262142);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
