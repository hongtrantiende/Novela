package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rff  reason: default package */
/* loaded from: classes.dex */
public final class rff extends uff {
    public final /* synthetic */ uff a;

    @Override // defpackage.uff
    public final Object read(tyd tydVar) {
        if (tydVar.l1() == 9) {
            tydVar.V0();
            return null;
        }
        return this.a.read(tydVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        return nk2.v(new StringBuilder(obj.length() + 21), "NullSafeTypeAdapter[", obj, "]");
    }

    @Override // defpackage.uff
    public final void write(uyd uydVar, Object obj) {
        if (obj == null) {
            uydVar.y0();
        } else {
            this.a.write(uydVar, obj);
        }
    }
}
