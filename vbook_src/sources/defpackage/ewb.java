package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ewb  reason: default package */
/* loaded from: classes3.dex */
public final class ewb {
    public final int a;
    public final String b;
    public final float c;

    public ewb(int i, String str, float f) {
        this.a = i;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ewb) {
                ewb ewbVar = (ewb) obj;
                if (this.a != ewbVar.a || !this.b.equals(ewbVar.b) || Float.compare(this.c, ewbVar.c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = s21.r("TextNavigation(index=", this.a, ", title=", this.b, ", position=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
