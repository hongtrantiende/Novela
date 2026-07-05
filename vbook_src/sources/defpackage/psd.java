package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: psd  reason: default package */
/* loaded from: classes.dex */
public final class psd implements tj4 {
    public final /* synthetic */ xh8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public psd(xh8 xh8Var, boolean z, boolean z2) {
        this.a = xh8Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        moc mocVar = (moc) obj;
        float floatValue = ((Number) mocVar.a).floatValue();
        boolean booleanValue = ((Boolean) mocVar.b).booleanValue();
        float floatValue2 = ((Number) mocVar.c).floatValue();
        String str = "snap[idx=" + this.a.b + "] offsetY=" + floatValue + " zoom=" + floatValue2 + " isAligned=" + booleanValue + " isCurrent=" + this.b + " isSettled=" + this.c;
        if (jy.a()) {
            kw6 kw6Var = kw6.b;
            iea ieaVar = iea.b;
            if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                kw6Var.a(ieaVar, "PagerAlign", str, null);
            }
        }
        return pvc.a;
    }
}
