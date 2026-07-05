package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f1c  reason: default package */
/* loaded from: classes3.dex */
public final class f1c {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public f1c(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static f1c a(f1c f1cVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = f1cVar.a;
        }
        if ((i & 4) != 0) {
            z3 = f1cVar.c;
        }
        f1cVar.getClass();
        f1cVar.getClass();
        f1cVar.getClass();
        return new f1c(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1c) {
            f1c f1cVar = (f1c) obj;
            if (this.a == f1cVar.a && this.b == f1cVar.b && this.c == f1cVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, true);
    }

    public final String toString() {
        return rs8.m(", hasNext=true, hasPrevious=true)", rs8.p("TextToSpeechControlState(isLoading=", this.a, ", isPlaying=", this.b, ", isError="), this.c);
    }
}
