package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aba  reason: default package */
/* loaded from: classes.dex */
public final class aba {
    public final fba a;
    public final ky b;

    public aba(fba fbaVar, ky kyVar) {
        this.a = fbaVar;
        this.b = kyVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aba) {
                aba abaVar = (aba) obj;
                if (!this.a.equals(abaVar.a) || !this.b.equals(abaVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + ((hashCode + (jy3.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + jy3.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
