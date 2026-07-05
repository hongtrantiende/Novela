package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri0  reason: default package */
/* loaded from: classes3.dex */
public final class ri0 implements v38 {
    public final bc4 a;

    public ri0(bc4 bc4Var) {
        this.a = bc4Var;
    }

    @Override // defpackage.xq4
    public final yq4 a() {
        return this.a.a();
    }

    @Override // defpackage.xq4
    public final zm8 b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ri0) {
            if (this.a.equals(((ri0) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
