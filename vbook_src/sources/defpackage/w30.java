package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w30  reason: default package */
/* loaded from: classes.dex */
public final class w30 implements x89 {
    public final int c;

    public w30(int i) {
        this.c = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return x89.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x89) {
                x89 x89Var = (x89) obj;
                if (this.c == x89Var.tag() && v89.a.equals(x89Var.intEncoding())) {
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
        return (this.c ^ 14552422) + (v89.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.x89
    public final v89 intEncoding() {
        return v89.a;
    }

    @Override // defpackage.x89
    public final int tag() {
        return this.c;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + v89.a + ')';
    }
}
