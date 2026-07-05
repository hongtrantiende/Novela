package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pm8  reason: default package */
/* loaded from: classes.dex */
public final class pm8 {
    public final we4 a;
    public final String b;
    public final kw3 c;

    public pm8(we4 we4Var, String str, kw3 kw3Var) {
        this.a = we4Var;
        this.b = str;
        this.c = kw3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pm8) {
                pm8 pm8Var = (pm8) obj;
                if (this.a != pm8Var.a || !this.b.equals(pm8Var.b) || this.c != pm8Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b)) * 961;
    }

    public final String toString() {
        return "ParseFailure(fileType=" + this.a + ", error=" + this.b + ", code=" + this.c + ", pageCount=null, isImageBased=null)";
    }
}
