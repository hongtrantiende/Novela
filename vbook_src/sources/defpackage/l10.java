package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l10  reason: default package */
/* loaded from: classes.dex */
public final class l10 implements m10 {
    public final vk8 a;
    public final t8b b;

    public l10(vk8 vk8Var, t8b t8bVar) {
        this.a = vk8Var;
        this.b = t8bVar;
    }

    @Override // defpackage.m10
    public final vk8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l10) {
                l10 l10Var = (l10) obj;
                if (!this.a.equals(l10Var.a) || !this.b.equals(l10Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
