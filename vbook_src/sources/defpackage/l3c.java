package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l3c  reason: default package */
/* loaded from: classes3.dex */
public final class l3c {
    public final gwb a;
    public final kwb b;
    public final mn c;
    public final int d;

    public l3c(gwb gwbVar, kwb kwbVar, mn mnVar, int i) {
        mnVar.getClass();
        this.a = gwbVar;
        this.b = kwbVar;
        this.c = mnVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l3c) {
                l3c l3cVar = (l3c) obj;
                if (!this.a.equals(l3cVar.a) || !this.b.equals(l3cVar.b) || !c16.i(this.c, l3cVar.c) || this.d != l3cVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextTouchTarget(page=" + this.a + ", paragraph=" + this.b + ", textLayoutResult=" + this.c + ", index=" + this.d + ")";
    }
}
