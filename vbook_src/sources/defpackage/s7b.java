package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s7b  reason: default package */
/* loaded from: classes3.dex */
public final class s7b extends pga implements aza {
    @Override // defpackage.aza
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.D;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.E + ((int) ((r() + this.G) - this.E))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            Object[] objArr = this.D;
            objArr.getClass();
            f(Integer.valueOf(((Number) objArr[((int) ((this.E + ((int) ((r() + this.G) - this.E))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
