package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hub  reason: default package */
/* loaded from: classes.dex */
public final class hub {
    public final pyb a;
    public final int b;

    public hub(pyb pybVar, int i) {
        this.a = pybVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hub) {
                hub hubVar = (hub) obj;
                if (this.b != hubVar.b || !this.a.equals(hubVar.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
