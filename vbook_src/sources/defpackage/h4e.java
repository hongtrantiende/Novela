package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h4e  reason: default package */
/* loaded from: classes.dex */
public final class h4e implements e8e {
    public final int c;

    public h4e(int i) {
        this.c = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e8e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e8e) {
                e8e e8eVar = (e8e) obj;
                if (this.c == e8eVar.zza() && s7e.a.equals(e8eVar.zzb())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.c ^ 14552422) + (s7e.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + s7e.a + ')';
    }

    @Override // defpackage.e8e
    public final int zza() {
        return this.c;
    }

    @Override // defpackage.e8e
    public final s7e zzb() {
        return s7e.a;
    }
}
