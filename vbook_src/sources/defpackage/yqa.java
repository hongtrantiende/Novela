package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yqa  reason: default package */
/* loaded from: classes.dex */
public final class yqa implements xl3 {
    public final int a;

    public yqa(int i) {
        this.a = i;
    }

    @Override // defpackage.xr
    public final q4d a(drc drcVar) {
        return new r95(this.a, 8);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yqa) && ((yqa) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
